package ca.ualberta.cs.miguel1_travel;
/* A singleton class that stores the global Claim list*/

public class ClaimListController {
	
	private static Claim_List claimlist=null;
	
	public static Claim_List getClaimList(){
		if (claimlist == null){
			claimlist=new Claim_List();
		}
		return claimlist;
	}

	public void addClaim(Claim claim) {
		// TODO Auto-generated method stub
		getClaimList().addClaim(claim);
	}
	
	
}
