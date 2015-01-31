package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
//activity consist in adding an expense to a claim
public class AddExpActivity extends Activity {
	private Spinner category;
	private Spinner currency;
	//spinner code based from youtube video: Android spinner example, by raghav shetty, link watch?v=o7Om-iUoiio accessed on jan 16 2015
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_exp);
		ClaimListManager.initManager(this.getApplicationContext());
		//spiners for category
		category=(Spinner) findViewById(R.id.select_edit_claim);
	    ArrayAdapter<CharSequence> cat= ArrayAdapter.createFromResource(this,R.array.Category, android.R.layout.simple_list_item_1);
	    cat.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
	    category.setAdapter(cat);
	    //spinners for currency
	    currency=(Spinner) findViewById(R.id.currency_exp_type);
	    ArrayAdapter<CharSequence> cur = ArrayAdapter.createFromResource(this,R.array.Currency, android.R.layout.simple_list_item_1);
	    cur.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
	    currency.setAdapter(cur);
	    	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_exp, menu);
		return true;
	}
	//button action to add new expense
	public void addnewExp(View v){
		
		ExpenseListController ae= new ExpenseListController();
		EditText date = (EditText) findViewById(R.id.new_exp_dest_ins);
		category = (Spinner) findViewById(R.id.select_edit_claim);
		EditText description = (EditText) findViewById(R.id.new_exp_descp);
		EditText amount = (EditText) findViewById(R.id.exp_amount_in);
		currency = (Spinner)  findViewById(R.id.currency_exp_type);
		EditText name = (EditText) findViewById(R.id.name_of_exp);
		
		ae.addExp(name.getText().toString(), date.getText().toString(), category,description.getText().toString(),amount.getText().toString(), currency);
		Toast.makeText(this, "add exp", Toast.LENGTH_SHORT).show();
	}

}
