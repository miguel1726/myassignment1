package ca.ualberta.cs.miguel1_travel;

//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
/*stores information about a claim, including its particular expens*/
public class Claim /*implements Serializable*/ {
	/*http://www.mkyong.com/java/how-to-generate-serialversionuid/ 1-26-2015 */
	//private static final long serialVersionUID = -1L;
		
		protected Integer claimnumber=0;
		protected String destination="";
		protected String reason="";
		protected Calendar from=Calendar.getInstance();
		protected Calendar to=Calendar.getInstance();
		private ArrayList<Expense> expenses= new ArrayList<Expense>();
		
	
		public void setidClaim(Integer claimnumber) {
		// TODO Auto-generated constructor stub
			this.claimnumber=claimnumber+1;
		}
		public Integer getidClaim(){
			return this.claimnumber;
		}
	
		public String getDestination() {
			// TODO Auto-generated method stub
			return this.destination;
		}
		public void setDestination(String destination){
			this.destination=destination;
			
		}
		public void setFrom(Calendar from){
			this.from=from;
					
		}
		public Calendar getFrom(){
			return this.from;
		}
		public void setTo(Calendar to){
			this.to=to;
		}
		public Calendar getTo(){
			return this.to;
		}
		public String getReason(){
			return this.reason;
		}
		public void setReason(String reason){
			this.reason=reason;
						
		}
		public ArrayList<Expense>  getExpenses(){
			return expenses;
		}
		
}