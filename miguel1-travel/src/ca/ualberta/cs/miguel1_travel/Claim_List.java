package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;


	

public class Claim_List {
	
	protected ArrayList<Claim> claimList=null;
	
	public Claim_List() {
		claimList=new ArrayList<Claim>();
		
	}

	public ArrayList<Claim> getClaims() {
		// TODO Auto-generated method stub
		return claimList;
	}

	public void addClaim(Claim claim) {
		// TODO Auto-generated method stub
		claimList.add(claim);
	}

	public void deleteClaim(Claim claim) {
		claimList.remove(claim);
		
	}

	public Claim getClaim(Integer index) {
		// TODO Auto-generated method stub
		return claimList.get(index);
	}

	public int size(){
			return claimList.size();
	}
	
	public boolean contains(Claim claim){
		return claimList.contains(claim);
	}
	

	
	/*public Claim editClaim(Claim edited){
	}
	
	public Claim mailClaim(Claim mailed){
		
	}
	
	public Claim submitClaim(Claim submited){
    }*/
	
	
}