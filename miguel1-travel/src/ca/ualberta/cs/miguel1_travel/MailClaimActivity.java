package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MailClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mail_claim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mail_claim, menu);
		return true;
	}

}
