package ca.ualberta.cs.miguel1_travel;


import java.io.Serializable;
import java.math.BigDecimal;


import java.util.Currency;
import java.util.HashMap;
/*stores information about a claim, including its particular expens*/
public class Claim implements Serializable {
	
	
		/**
	 * claim serializable ID
	 */
	    private static final long serialVersionUID = -4158131948304673343L;
		protected String claimname;
		protected String destination="";
		protected String reason="";
		protected String from="";
		protected String to ="";
		protected Claimstatus status;
		private ExpList expenses;
		
		Claim(String name, String destination, String reason, String from, String to){
			this.claimname= name;
			this.destination=destination;
			this.reason=reason;
			this.from=from;
			this.to=to;
			this.status= Claimstatus.IN_PROGRESS;
			this.expenses=new ExpList();
			
						
		}
		
		
		public Claim(String claimname ){
			this.claimname=claimname;
			
		}
		public String getName(){
			return this.claimname;
		}
		public String toString(){
			return getName();
		}
	
		public String getDestination() {
			
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
		public String outputEmailString(){
			//add adapter
			String toEmail = null;
			return toEmail;
		}
		
		public Claimstatus getStatus(){
			return status;
		}
		
		public void setStatus(Claimstatus status){
			this.status=status;
		}
		
		public boolean equals(Claim compareclaim){//
			if (compareclaim==null){
				return false;
			}
			return getName().equals(compareclaim.getName());
		}
		
		public int hashCode(){//
			return ("Claim"+getName()).hashCode();
		}
		
		public boolean equals(Object compareclaim){
			if(compareclaim==null){
				return false;
			}
			
			if (compareclaim.getClass()==this.getClass()){
				return this.equals((Claim)compareclaim);
			}else{
			return false;
			}
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