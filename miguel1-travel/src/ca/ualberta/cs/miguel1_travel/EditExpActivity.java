package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
/*
 * Editing the expeneses, 
 */
public class EditExpActivity extends Activity {
	Spinner exp;
	Spinner category;
	Spinner currency;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_expense);
		 ClaimListManager.initManager(this.getApplicationContext());
		// spinner code based from youtube video: Android spinner example, by raghav shetty, link watch?v=o7Om-iUoiio accessed on jan 16 2015
		category=(Spinner) findViewById(R.id.cat_exp);
	    ArrayAdapter<CharSequence> cat= ArrayAdapter.createFromResource(this,R.array.Category, android.R.layout.simple_list_item_1);
	    cat.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
	    category.setAdapter(cat);
	    
	    currency=(Spinner) findViewById(R.id.curr_exp_to_edit);
	    ArrayAdapter<CharSequence> cur = ArrayAdapter.createFromResource(this,R.array.Currency, android.R.layout.simple_list_item_1);
	    cur.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
	    currency.setAdapter(cur);
	    
	  
	    
	    
	    
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_exp, menu);
		return true;
	}
	//button action to edit expense
	public void editExp(View v){
		
		ExpenseListController ae= new ExpenseListController();
		exp=(Spinner) findViewById(R.id.select_exp_to_edit);
		EditText date = (EditText) findViewById(R.id.date_exp_edit);
		category = (Spinner) findViewById(R.id.cat_exp);
		EditText description = (EditText) findViewById(R.id.desc_edit_exp);
		EditText amount = (EditText) findViewById(R.id.edit_am_exp);
		currency = (Spinner)  findViewById(R.id.curr_exp_to_edit);
		
		ae.editExp(exp,date.getText().toString(), category,description.getText().toString(),amount.getText().toString(), currency);
		
		Toast.makeText(this, "edit exp", Toast.LENGTH_SHORT).show();
	}

	
}
