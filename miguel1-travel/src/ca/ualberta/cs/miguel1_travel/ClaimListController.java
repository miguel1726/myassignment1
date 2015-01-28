package ca.ualberta.cs.miguel1_travel;

import android.widget.EditText;
import android.widget.Spinner;
/* A singleton class that stores the global Claim list*/

public class ClaimListController {
	
	private static Claim_List claimlist=null;
	
	public static Claim_List getClaimList(){
		if (claimlist == null){
			claimlist=new Claim_List();
		}
		return claimlist;
	}

	public void addClaim(Claim claim, String destination, String datefrom, String dateto, String reason ) {
		// TODO Auto-generated method stub
		claim.setDestination(destination);
		claim.setFrom(datefrom);
		claim.setTo(dateto);
		claim.setReason(reason);
		
		getClaimList().addClaim(claim);
	}
	
	
	public void mailClaim(Spinner spinner, EditText view) {
		// TODO Auto-generated method stub
		
	}

	public void editClaim(Claim claim, String destination, String dateto,
			String datefrom, String reason) {
		// TODO Auto-generated method stub
		claim.setDestination(destination);
		claim.setFrom(datefrom);
		claim.setTo(dateto);
		claim.setReason(reason);
		
		getClaimList().addClaim(claim);
		
	}

	public void deleteClaim(Claim claim) {
		// TODO Auto-generated method stub
		getClaimList().deleteClaim(claim);
	}

	public void submitClaim(Claim claim) {
		// TODO Auto-generated method stub
		
	}
	
}
