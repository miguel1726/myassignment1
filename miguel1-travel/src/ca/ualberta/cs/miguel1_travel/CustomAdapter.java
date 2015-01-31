package ca.ualberta.cs.miguel1_travel;

import java.io.IOException;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/*Adapter class that extends with arrayadapter for spinners based on 
 * http://android-er.blogspot.ca/2013/06/custom-arrayadapter-for-spinner-with.html
*accessed on 1/31/2015
*/
/**
 * @author  miguel1
 */
public class CustomAdapter extends ArrayAdapter<String>{
	private static final Activity getActivity = null;
	/**
	 * @uml.property  name="claimlistmanager"
	 * @uml.associationEnd  
	 */
	private static ClaimListManager claimlistmanager;
	public CustomAdapter(Activity editClaimactivity, int row, ArrayList<Claim> claims) {
		super(editClaimactivity, row);
		
	}
	 @Override
	  public View getDropDownView(int position, View convertView,
	    ViewGroup parent) {
	   // TODO Auto-generated method stub
	   try {
		return getCustomView(position, convertView, parent);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	   // TODO Auto-generated method stub
	   try {
		return getCustomView(position, convertView, parent);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	   
	  }

	  public View getCustomView(int position, View convertView, ViewGroup parent) throws ClassNotFoundException, IOException {
	   // TODO Auto-generated method stub
	   //return super.getView(position, convertView, parent);

	   LayoutInflater inflater= getActivity.getLayoutInflater();
	   View row=inflater.inflate(R.layout.row, parent, false);
	   TextView label=(TextView)row.findViewById(R.id.claim_selected);
	   label.setText((CharSequence) claimlistmanager.loadClaimList().getClaims().get(position));
	   return row;
	  }
}
