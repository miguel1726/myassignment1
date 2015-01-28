package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DeleteClaimActivity extends Activity {
	Spinner claim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete_claim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.delete_claim, menu);
		return true;
	}
	
	public void deleteClaim(View v){
		Toast.makeText(this, "delete claim", Toast.LENGTH_SHORT).show();
		ClaimListController cl= new ClaimListController();
		claim= (Spinner) findViewById(R.id.select_claim_to_delete);
		cl.deleteClaim(new Claim(claim.getSelectedItem().toString()));
				
	}

}
