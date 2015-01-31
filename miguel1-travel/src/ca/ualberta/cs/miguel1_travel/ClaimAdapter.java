package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

//http://www.ezzylearning.com/tutorial/customizing-android-listview-items-with-custom-arrayadapter
//accessed 1/29/15
//code for custom array adapter


//adapter used to display an arraylist of claims

/**
 * @author  miguel1
 */
public class ClaimAdapter extends ArrayAdapter<Claim> {
      protected ArrayList<Claim> claims;
      protected Context context;
      protected LayoutInflater inflater;
      /**
	 * @uml.property  name="listcontroller"
	 * @uml.associationEnd  
	 */
    public ClaimListController listcontroller;
      
    //constructor of claim adapter
       public ClaimAdapter(Context context, int textViewResourceId, ArrayList<Claim> claims) {
    	   super(context, textViewResourceId, claims);
    	   this.claims =claims;
		}
       
      
       public View getView(int position, View convertV, ViewGroup parent){
		View view= convertV;
		
		
		if(convertV==null){
			LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view=inflater.inflate(R.layout.add_claim, null);
		}
		Claim claim=claims.get(position);
		
		
		//setting claim name
		TextView nameInText=(TextView) view.findViewById(R.id.insert_claim_name);
		if (nameInText !=null){
			int strID= Claimstatus.getNameID(claim.getStatus());
			nameInText.setText(claim.getName()+"["+getContext().getString(strID)+"]");
			
			
		}
		
		//setting claim total
		TextView destText= (TextView) view.findViewById(R.id.new_exp_dest_ins);
		if (destText !=null){
			destText.setText(ClaimAid.getFullString(claim, getContext()));
		}
		
		return view;
    	   
       }
       
}

