package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_claim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_claim, menu);
		return true;
	}
	public void addnewClaim(View v){
		Toast.makeText(this, "add claim", Toast.LENGTH_SHORT).show();
		ClaimListController cl= new ClaimListController();
		EditText name = (EditText) findViewById(R.id.insert_claim_name);
		EditText destination=(EditText) findViewById(R.id.new_exp_dest_ins);
		EditText dateto=(EditText) findViewById(R.id.date_from_insert);
		EditText datefrom=(EditText) findViewById(R.id.date_to_insert);
		EditText reason=(EditText) findViewById(R.id.reason_claim);
		
		cl.addClaim(new Claim(name.getText().toString()), destination.getText().toString(), dateto.getText().toString(),datefrom.getText().toString(), reason.getText().toString() );
	}
	
	

}
