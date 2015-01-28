package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DeleteExpActivity extends Activity {
	Spinner exp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete_exp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.delete_exp, menu);
		return true;
	}
	
	public void deleteExp(View v){
		Toast.makeText(this, "delete exp", Toast.LENGTH_SHORT).show();
		ExpenseListController cl= new ExpenseListController();
		exp= (Spinner) findViewById(R.id.select_exp_to_del);
		cl.deleteClaim(exp);
				
	}

}
