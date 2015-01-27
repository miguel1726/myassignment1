package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.Toast;

public class ListExpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_exp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expmenu, menu);
		return true;
	}
	public void editExp(MenuItem menu){
    	//Toast.makeText(this, "Edit claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(ListExpActivity.this, EditExpActivity.class);
    	startActivity(intent);
    }
    public void addExp(MenuItem menu){
    	//Toast.makeText(this, "add claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(ListExpActivity.this, AddExpActivity.class);
    	startActivity(intent);
    }
    public void deleteExp(MenuItem menu){
    	//Toast.makeText(this, "delete claim", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(ListExpActivity.this, DeleteExpActivity.class);
    	startActivity(intent);
    }
}
