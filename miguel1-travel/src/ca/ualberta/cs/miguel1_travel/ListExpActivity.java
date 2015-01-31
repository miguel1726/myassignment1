package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.Collection;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
//import android.widget.Toast;
import android.widget.AdapterView.OnItemLongClickListener;
//List the expenses according to the claims
/**
 * @author  miguel1
 */
public class ListExpActivity extends Activity {
	
	/**
	 * @uml.property  name="exp"
	 * @uml.associationEnd  
	 */
	private  ExpenseListController exp;
	Spinner claim;
	ArrayAdapter<String> claimadapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_exp);
		 
		ClaimListManager.initManager(this.getApplicationContext());
		 
		claim=(Spinner) findViewById(R.id.select_claim_list);
		claimadapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new ArrayList<String>());
		claimadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		claim.setAdapter(claimadapter);
		 
		 
		
		
		
	        
	    
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expmenu, menu);
		return true;
	}
	public void editExp(MenuItem menu){
    	//Toast.makeText(this, "Edit claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(ListExpActivity.this, EditExpActivity.class);
    	startActivity(intent);
    }
    public void addExp(MenuItem menu){
    	//Toast.makeText(this, "add claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(ListExpActivity.this, AddExpActivity.class);
    	startActivity(intent);
    }

    
}
