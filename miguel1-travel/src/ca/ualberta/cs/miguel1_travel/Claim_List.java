package ca.ualberta.cs.miguel1_travel;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;


	

public class Claim_List implements Serializable{
	
	/**
	 * claim list serialization id
	 */
	private static final long serialVersionUID = -6867357258868198199L;
	
	protected ArrayList<Claim> claimList= null;
	
	protected transient ArrayList<Listener> listeners= null;//
	
	
	public Claim_List() {
		claimList=new ArrayList<Claim>();
		listeners= new ArrayList<Listener>();//
	}

	public ArrayList<Claim> getClaims() {
		return claimList;
	}
	
	public void addClaim(Claim claim) {
		claimList.add(claim);
		notifyListeners();//
	}

	public void removeClaim(Claim claim) {
		claimList.remove(claim);
		notifyListeners();//
		
	}

	public Claim getClaim(Integer index) {
		return claimList.get(index);
	}

	public int size(){
			return claimList.size();
	}
	
	public int indexOf(Object object){
		return claimList.indexOf(object);
	}
	
	public boolean contains(Claim claim){
		return claimList.contains(claim);
	}
	
	private ArrayList<Listener> getListeners(){//
		if (listeners ==null){
			listeners = new ArrayList<Listener>();
		}
		return listeners;
	}
	private void notifyListeners() {//
		for (Listener listener : getListeners()) {
		listener.update();
		}
	}
		
	public void addListener(Listener l){//
		getListeners().add(l);
	}
	public void removeListener(Listener l){
		getListeners().remove(l);
	}
	
}