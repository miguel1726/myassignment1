package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
//import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MailClaimActivity extends Activity {
	private Spinner spinner;
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mail_claim);
		 ClaimListManager.initManager(this.getApplicationContext());
		//ArrayAdapter<T>.createFromResource(this, R.array., textViewResId)
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mail_claim, menu);
		return true;
	}
	public void mailClaim(View v){
		Toast.makeText(this, "SUBMIT", Toast.LENGTH_SHORT).show();
		ClaimListController cl= new ClaimListController();
		EditText view = (EditText) findViewById(R.id.email_to_ins);
		spinner= (Spinner) findViewById(R.id.select_edit_claim);
		cl.mailClaim(spinner,view);
	}

}
