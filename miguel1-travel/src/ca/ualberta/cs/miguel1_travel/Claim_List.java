package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.Collection;
	

public class Claim_List {
	
	protected ArrayList<Claim> claimList;
	
	public Claim_List() {
		claimList=new ArrayList<Claim>();
		
	}

	public Collection<Claim> getClaims() {
		// TODO Auto-generated method stub
		return claimList;
	}

	public void addClaim(Claim testClaim) {
		// TODO Auto-generated method stub
		claimList.add(testClaim);
	}

	public void deleteClaim(Claim testClaim) {
		claimList.remove(testClaim);
		
	}


	

}
