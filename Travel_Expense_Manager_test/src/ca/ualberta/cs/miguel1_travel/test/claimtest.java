package ca.ualberta.cs.miguel1_travel.test;

import junit.framework.TestCase;
import ca.ualberta.cs.miguel1_travel.Claim;

public class claimtest extends TestCase {
	public void testClaim() {
		String claimname= "A claim" ;
		Claim claim = new Claim(claimname);
		assertTrue("Claim is not equal", claimname.equals(claim.getDestination()));
	}
}
