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

public class ListExpActivity extends Activity {
	
	private  ExpenseListController exp;
	Spinner claim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_exp);
		 ClaimListManager.initManager(this.getApplicationContext());
		
		
		ListView listView=(ListView) findViewById(R.id.expense_listview);
		Collection<Expense> expenses = ExpenseListController.getExpenseList().getExpenses();
		
		//final ArrayList<Expense> list = new ArrayList<Expense>(expenses);
		/*
		
		final ArrayAdapter<Expense> expenseAdapter= new ArrayAdapter<Expense>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(expenseAdapter);
		
		
		 ExpenseListController.getExpenseList().addListener(new Listener(){
	    	   public void update(){
	    		   list.clear();
	    		   Collection<Expense> expenses= ExpenseListController.getExpenseList().getExpenses(); 
	    		   list.addAll(expenses);
	    		   expenseAdapter.notifyDataSetChanged();
	    	   }
	       });
	       
	       
	       
	       //delete by long click
	       listView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> adapterView, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				AlertDialog.Builder adb = new AlertDialog.Builder(ListExpActivity.this);
				adb.setMessage("DELETE "+list.get(position).toString()+"?");
				adb.setCancelable(true);
				final int finalPosition = position;
				adb.setPositiveButton("DELETE", new OnClickListener(){

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Expense expense= list.get(finalPosition);
						ExpenseListController.getExpenseList().deleteExp(expense);
						
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
	    	   
		});*/
	        
	    
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
    public void deleteExp(MenuItem menu){
    	//Toast.makeText(this, "delete claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(ListExpActivity.this, DeleteExpActivity.class);
    	startActivity(intent);
    }
    
}
