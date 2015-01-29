package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;


	

public class Claim_List {
	
	protected ArrayList<Claim> claimList;
	protected ArrayList<Listener> listeners;
	public Claim_List() {
		claimList=new ArrayList<Claim>();
		listeners= new ArrayList<Listener>();
	}

	public ArrayList<Claim> getClaims() {
		// TODO Auto-generated method stub
		return claimList;
	}

	public void addClaim(Claim claim) {
		// TODO Auto-generated method stub
		claimList.add(claim);
		notifyListeners();
	}

	public void removeClaim(Claim claim) {
		claimList.remove(claim);
		notifyListeners();
		
	}

	private void notifyListeners() {
		for (Listener listener : getListeners()) {
		listener.update();
		}
	}
	private ArrayList<Listener> getListeners() {
		if (listeners == null ) {
		listeners = new ArrayList<Listener>();
		}
		return listeners;
	}
	
	public void addListener(Listener l){
		listeners.add(l);
	}
	public void removeListener(Listener l){
		listeners.remove(l);
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
	

	
	
	
	
}