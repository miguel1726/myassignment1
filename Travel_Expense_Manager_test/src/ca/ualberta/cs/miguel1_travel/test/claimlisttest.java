package ca.ualberta.cs.miguel1_travel.test;



import ca.ualberta.cs.miguel1_travel.Claim;
import ca.ualberta.cs.miguel1_travel.Claim_List;
import junit.framework.TestCase;

public class claimlisttest extends TestCase {
	public void testemptyClaimList(){
			Claim_List claimlist=new Claim_List();
			
			assertTrue("Empty claim list", claimlist.size()==0);
	}
	public void testAddClaimList(){
		Claim_List claimlist=new Claim_List();
		String claimname= "A claim";
		Claim testClaim = new Claim(claimname);
		claimlist.addClaim(testClaim);
		
		assertTrue("Empty claim list", claimlist.size()==1);
		assertTrue("", claimlist.contains(testClaim));
		
	}
	public void testdeleteClaimList(){
		Claim_List claimlist=new Claim_List();
		String claimname= "A claim";
		Claim testClaim = new Claim(claimname);
		claimlist.addClaim(testClaim);
	
		assertTrue("Empty claim list", claimlist.size()==1);
		assertTrue("", claimlist.contains(testClaim));
		claimlist.deleteClaim(testClaim);
		
		assertTrue("Empty list", claimlist.size()==0);
		assertFalse("", claimlist.contains(testClaim));
		
		
	}
	public void testChooseClaimList(){
		Claim_List claimlist=new Claim_List();
		String claimname= "A claim";
		Claim testClaim = new Claim(claimname);
		claimlist.addClaim(testClaim);
		Claim claim=claimlist.chooseClaims();
		assertTrue("claim isnt null", claim!=null);
		assertTrue("didnt choose right student", claim.equals(testClaim));
		String claimnameB= "B claim";
		Claim testClaimB= new Claim(claimnameB);
		claimlist.addClaim(testClaimB);
		Claim [] claimArray = {testClaim, testClaimB};
		for (int i= 0; i>claimArray.length;i++){
				Claim targetClaim =claimArray[i];
				int maxcount=1000;
				while (!targetClaim.equals(claimlist.chooseClaims())){
					//do nothing
					maxcount --;
				}
				assertTrue("toomany",maxcount>0);
		}
		
	}			
		
		
	
}
