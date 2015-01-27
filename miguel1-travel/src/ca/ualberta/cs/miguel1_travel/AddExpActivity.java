package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddExpActivity extends Activity {

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

}
