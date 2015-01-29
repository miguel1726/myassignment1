package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.Collection;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
//import android.widget.Toast;

public class ListExpActivity extends Activity {
	private static final String FILENAME="file.sav";
	Spinner claim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_exp);
		
		
		ListView listView=(ListView) findViewById(R.id.expense_listview);
		Collection<Expense> expenses = ExpenseListController.getExpenseList().getExpenses();
		final ArrayList<Expense> list = new ArrayList<Expense>(expenses);
		
		ArrayAdapter<Expense> expenseAdapter= new ArrayAdapter<Expense>(this, android.R.layout.simple_list_item_1, list);
		listView.setAdapter(expenseAdapter);
	}
	protected void onStart(){
		
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
