package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class EditClaimactivity extends Activity {
	
	
	Spinner claim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_claim);
		 ClaimListManager.initManager(this.getApplicationContext());
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_claimactivity, menu);
		return true;
	}
	public void editClaim(View v){
		Toast.makeText(this, "edit claim", Toast.LENGTH_SHORT).show();
		ClaimListController cl= new ClaimListController();
		claim= (Spinner) findViewById(R.id.select_edit_claim);
		
		EditText destination=(EditText) findViewById(R.id.edit_destination_ins);
		EditText dateto=(EditText) findViewById(R.id.edit_to_ins);
		EditText datefrom=(EditText) findViewById(R.id.edit_from_ins);
		EditText reason=(EditText) findViewById(R.id.edit_reason_ins);
		
		cl.editClaim(new Claim(claim.getSelectedItem().toString()), destination.getText().toString(), dateto.getText().toString(),datefrom.getText().toString(), reason.getText().toString() );
	}
	

}
