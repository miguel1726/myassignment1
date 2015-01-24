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

	public Claim chooseClaims(Claim choosen) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size(){
			return claimList.size();
	}
	
	public boolean contains(Claim testClaim){
		return claimList.contains(testClaim);
	}
	
	public Claim editClaim(Claim edited){
	}
	
	public Claim mailClaim(Claim mailed){
		
	}
	
	public Claim submitClaim(Claim submited){
    }
	
	
}