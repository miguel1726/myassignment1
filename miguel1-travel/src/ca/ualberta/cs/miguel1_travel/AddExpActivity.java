package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AddExpActivity extends Activity {
	private Spinner category;
	private Spinner currency;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_exp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_exp, menu);
		return true;
	}
	public void addnewExp(View v){
		Toast.makeText(this, "add exp", Toast.LENGTH_SHORT).show();
		ExpenseListController ae= new ExpenseListController();
		EditText date = (EditText) findViewById(R.id.new_exp_dest_ins);
		category = (Spinner) findViewById(R.id.select_edit_claim);
		EditText description = (EditText) findViewById(R.id.new_exp_descp);
		EditText amount = (EditText) findViewById(R.id.exp_amount_in);
		currency = (Spinner)  findViewById(R.id.currency_exp_type);
		EditText name = (EditText) findViewById(R.id.name_of_exp);
		
		ae.addExp(name.getText().toString(), date.getText().toString(), category,description.getText().toString(),amount.getText().toString(), currency);
	}

}
