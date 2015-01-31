package ca.ualberta.cs.miguel1_travel;

import java.io.IOException;
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

//Activity involved in the editing of a particular claim
//must choose the claim through a spinner

/**
 * @author  miguel1
 */
public class EditClaimactivity extends Activity {
	public ArrayList<Claim> claims=new ArrayList<Claim>();
	/**
	 * @uml.property  name="adapter"
	 * @uml.associationEnd  
	 */
	CustomAdapter adapter;
	/**
	 * @uml.property  name="activity"
	 * @uml.associationEnd  
	 */
	EditClaimactivity activity=null;
	Spinner claimspinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_claim);
		 ClaimListManager.initManager(this.getApplicationContext());
		 
		 //Setting spinner with adapter, try/catch in the even of empty claim list
		 activity =this;
		  claimspinner =(Spinner) findViewById(R.id.select_edit_claim);
		 try {
			claims=ClaimListManager.getManager().loadClaimList().getClaims();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 claimspinner.setAdapter(new CustomAdapter(EditClaimactivity.this, R.layout.row,claims));
		
		 
			
		
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_claimactivity, menu);
		return true;
	}
	
	//Button action for editing
	public void editClaim(View v){
		
		ClaimListController cl= new ClaimListController();
		
		
		EditText destination=(EditText) findViewById(R.id.edit_destination_ins);
		EditText dateto=(EditText) findViewById(R.id.edit_to_ins);
		EditText datefrom=(EditText) findViewById(R.id.edit_from_ins);
		EditText reason=(EditText) findViewById(R.id.edit_reason_ins);
		
		cl.editClaim(new Claim(claimspinner.getSelectedItem().toString()), destination.getText().toString(), dateto.getText().toString(),datefrom.getText().toString(), reason.getText().toString() );
		Toast.makeText(this, "edit claim", Toast.LENGTH_SHORT).show();
	}
	

}
