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


//Main activity displays the list of all the Claims that have added 
//you can move from this view to add, delete, submit, mail claim and view expenses
/**
 * @author  miguel1
 */
public class MainActivity extends Activity {
	
	/**
	 * @uml.property  name="cl"
	 * @uml.associationEnd  
	 */
	private ClaimListController cl;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClaimListManager.initManager(this.getApplicationContext());
            
        
    }   
        
     
    //OnResume loads the claim list on the list view and sets the option of delete on long click
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
       
        
        ListView listView=(ListView) findViewById(R.id.List_of_claims);
        Collection<Claim> claims=ClaimListController.getClaimList().getClaims();
        final ArrayList<Claim> list= new ArrayList<Claim>(claims);
        final ArrayAdapter<Claim> claimadapter= new ArrayAdapter<Claim>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(claimadapter);
        
        //delete by long click
        listView.setOnItemLongClickListener(new OnItemLongClickListener() {
		public boolean onItemLongClick(AdapterView<?> adapterView, View view,
 				int position, long id) {
 						
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
    	//option to go the edit a claim
    	Intent intent = new Intent(MainActivity.this, EditClaimactivity.class);
    	startActivity(intent);
    }
    public void addClaim(MenuItem menu){
    	//option to go to add a claim
    	Intent intent = new Intent(MainActivity.this, AddClaimActivity.class);
    	startActivity(intent);
    }
   //option to viewExpenses      
     public void viewExpenseofClaim(MenuItem menu){
    	Intent intent = new Intent(MainActivity.this, ListExpActivity.class);
    	startActivity(intent);
    }
}
