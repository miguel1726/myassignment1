package ca.ualberta.cs.miguel1_travel;

//import java.io.Serializable;
import java.math.BigDecimal;


import java.util.Currency;
import java.util.HashMap;
/*stores information about a claim, including its particular expens*/
public class Claim /*implements Serializable*/ {
	/*http://www.mkyong.com/java/how-to-generate-serialversionuid/ 1-26-2015 */
	//private static final long serialVersionUID = -1L;
		
		protected String claimname;
		protected String destination="";
		protected String reason="";
		protected String from="";
		protected String to ="";
		private ExpList expenses= new ExpList();
		
		public Claim(String claimname ){
			this.claimname=claimname;
			
		}
		
	
	
		public String getDestination() {
			// TODO Auto-generated method stub
			return this.destination;
		}
		public void setDestination(String destination){
			this.destination=destination;
			
		}
		public void setFrom(String from){
			this.from=from;
					
		}
		public String getFrom(){
			return this.from;
		}
		public void setTo(String to){
			this.to=to;
		}
		public String getTo(){
			return this.to;
		}
		public String getReason(){
			return this.reason;
		}
		public void setReason(String reason){
			this.reason=reason;
						
		}
		public ExpList  getExpenses(){
			return expenses;
		}
		//function below gets the total for each type of currency and stores it in a hashmap
		public HashMap<Currency, BigDecimal> getTotal(){
			HashMap<Currency, BigDecimal> tots= new HashMap<Currency, BigDecimal>();
			
			for(Expense expense: getExpenses().getExpenses()){
				
				Currency currency =expense.getType();
				BigDecimal amount =tots.get(currency);
				
				if(amount==null){
					amount=new BigDecimal(expense.getAmount().toString());
					
				}
				else{
					amount=amount.add(expense.getAmount());
				}
				
				tots.put(currency, amount);
			}
			return tots;
		}
		
		
}