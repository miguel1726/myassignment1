package ca.ualberta.cs.miguel1_travel;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;

import android.content.Context;
//creates a string listing of the total of the claim expenses by type
public class ClaimAid {

	public static final String getFullString(Claim claim, Context context) {
		HashMap<Currency, BigDecimal> tots=claim.getTotal();
		
		StringBuilder builtstring= new StringBuilder();
		
		if (claim.getExpenses().size()==0){
			builtstring.append(context.getString(R.string.claim_name));
		}
		
		else{
			for (Currency currency: tots.keySet()){
				BigDecimal amount = tots.get(currency);
				builtstring.append(amount.toPlainString()+" " +currency.getCurrencyCode() + ",");
			}
		}
	return builtstring.toString();	
		
	}
	
}
