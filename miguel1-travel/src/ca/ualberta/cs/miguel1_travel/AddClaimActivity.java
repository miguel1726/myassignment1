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
		//ClaimListController cl= new ClaimListController();
		// EditText textView = (EditText) findViewById(R.id.add_new_claim);
		//cl.addClaim(new Claim(textView.getText().toString()));
	}

}
