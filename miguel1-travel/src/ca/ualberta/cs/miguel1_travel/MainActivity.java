/*
 TRAVEL EXPENSE MANAGER: Manages the expenses and claims of the user and all expenses
  belong to a claim per trip abroad.

Copyright (C) 2015 Miguel Ramirez miguel1@ualberta.ca
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/	
package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.Collection;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
//import android.widget.Toast;



public class MainActivity extends Activity {
	private  ClaimListController cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         cl= ClaimListController.getController();
         
        
        setContentView(R.layout.activity_main);
        ListView listView=(ListView) findViewById(R.id.List_of_claims);
        Collection<Claim> claim= ClaimListController.getClaimList().getClaims();
        final ArrayList<Claim> list = new ArrayList<Claim>(claim);//make a new adapter class to take in the values of the stuff
        final ArrayAdapter<Claim> claimadapter= new ArrayAdapter<Claim>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(claimadapter);
        
        
        //added a change observer
       ClaimListController.getClaimList().addListener(new Listener(){
    	   public void update(){
    		   list.clear();
    		   Collection<Claim> claims= ClaimListController.getClaimList().getClaims();
    		   list.addAll(claims);
    		   claimadapter.notifyDataSetChanged();
    	   }
       });
       
        //get the total
       
       //delete by long click
       listView.setOnItemLongClickListener(new OnItemLongClickListener() {

		@Override
		public boolean onItemLongClick(AdapterView<?> adapterView, View view,
				int position, long id) {
			// TODO Auto-generated method stub
			
			AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
			adb.setMessage("DELETE "+list.get(position).toString()+"?");
			adb.setCancelable(true);
			final int finalPosition = position;
			adb.setPositiveButton("DELETE", new OnClickListener(){

				@Override
				public void onClick(DialogInterface dialog, int which) {
					Claim claim= list.get(finalPosition);
					ClaimListController.getClaimList().removeClaim(claim);
					
				}
				
			});
			adb.setNegativeButton("CANCEL",new OnClickListener(){

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			adb.show();
			
			return false;
		}
    	   
	});
        
    
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void editClaim(MenuItem menu){
    	//Toast.makeText(this, "Edit claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(MainActivity.this, EditClaimactivity.class);
    	startActivity(intent);
    }
    public void addClaim(MenuItem menu){
    	//Toast.makeText(this, "add claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(MainActivity.this, AddClaimActivity.class);
    	startActivity(intent);
    }
   
    
    public void mailClaim(MenuItem menu){
    	//Toast.makeText(this, "mail claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(MainActivity.this, MailClaimActivity.class);
    	startActivity(intent);
    }
    public void statusClaim(MenuItem menu){
    	//Toast.makeText(this, "status of claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(MainActivity.this, StatusClaimActivity.class);
    	startActivity(intent);
    }
    public void viewExpenseofClaim(MenuItem menu){
    	//Toast.makeText(this, "expenses in claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(MainActivity.this, ListExpActivity.class);
    	startActivity(intent);
    }
}
