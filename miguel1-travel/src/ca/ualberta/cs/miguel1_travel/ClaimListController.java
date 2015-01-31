package ca.ualberta.cs.miguel1_travel;

import java.io.IOException;

import android.content.Context;
import android.widget.EditText;
import android.widget.Spinner;
/* A singleton class that stores the global Claim list*/

/**
 * @author  miguel1
 */
public class ClaimListController {
	
	/**
	 * @uml.property  name="claimlist"
	 * @uml.associationEnd  
	 */
	private static Claim_List claimlist=null;
	
	Context context=null;
	
	
	
	
	//gets global claim
	public static Claim_List getClaimList(){
		if (claimlist == null){
			try {
				claimlist= ClaimListManager.getManager().loadClaimList();
				claimlist.addListener(new Listener(){
					public void update(){
						saveClaimList();
						
					}
				});
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("Could not deserialize claimlist from claimlistmanager");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("Could not deserialize claimlist from claimlistmanager");
			}
		}
		return claimlist;
	}
	
	static public void saveClaimList(){
		try{
			ClaimListManager.getManager().saveClaimList(getClaimList());
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Could not deserialize claimlist from claimlistmanager");
		}
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

	

	public void submitClaim(Claim claim) {
		// TODO Auto-generated method stub
		
	}

	
}
