package ca.ualberta.cs.miguel1_travel.test;

import java.util.Collection;

import ca.ualberta.cs.miguel1_travel.Claim;
import ca.ualberta.cs.miguel1_travel.Claim_List;
import junit.framework.TestCase;

public class claimlisttest extends TestCase {
	public void testemptyClaimList(){
			Claim_List claimlist=new Claim_List();
			Collection<Claim> claims=claimlist.getClaims();
			assertTrue("Empty claim list", claims.size()==0);
	}
	public void testAddClaimList(){
		Claim_List claimlist=new Claim_List();
		String claimname= "A claim";
		Claim testClaim = new Claim(claimname);
		claimlist.addClaim(testClaim);
		Collection<Claim> claims=claimlist.getClaims();
		assertTrue("Empty claim list", claims.size()==1);
		assertTrue("", claims.contains(testClaim));
		
	}
	public void testdeleteClaimList(){
		Claim_List claimlist=new Claim_List();
		String claimname= "A claim";
		Claim testClaim = new Claim(claimname);
		claimlist.addClaim(testClaim);
		Collection<Claim> claims=claimlist.getClaims();
		assertTrue("Empty claim list", claims.size()==1);
		assertTrue("", claims.contains(testClaim));
		claimlist.deleteClaim(testClaim);
		claims=claimlist.getClaims();
		assertTrue("Empty list", claims.size()==0);
		assertFalse("", claims.contains(testClaim));
		
		
	}
}
