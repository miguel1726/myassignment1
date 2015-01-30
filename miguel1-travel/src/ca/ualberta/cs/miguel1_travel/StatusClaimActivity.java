package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.Toast;

public class StatusClaimActivity extends Activity {
	Spinner claim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.submit_claim);
		 ClaimListManager.initManager(this.getApplicationContext());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.status_claim, menu);
		return true;
	}
	
	public void submitClaim(){
		Toast.makeText(this, "submit", Toast.LENGTH_SHORT).show();
		ClaimListController cl= new ClaimListController();
		claim=(Spinner) findViewById(R.id.select_c_sub);
		cl.submitClaim(new Claim(claim.getSelectedItem().toString()));
		
	}
	
	public void savestatusClaim(){//find out how radio buttons work
		Toast.makeText(this, "save status", Toast.LENGTH_SHORT).show();
		//ClaimListController cl= new ClaimListController();
		
	}

}
