package ca.ualberta.cs.miguel1_travel;

//import java.io.Serializable;
import java.util.Calendar;
import java.util.Currency;

/*STORES INFORMATION ABOUT A SINGLE EXPENSE*/

public class Expense /*implements Serializable*/{
	//private static final long serialVersionUID = -2L;
		
		private Calendar date;
		private String category;
		private String description;
		private Integer amount;
		private Currency currency;
		
		public Expense(){
			setDate(Calendar.getInstance());
			setCategory(category);
			setDescription("");
			setAmount(amount);
			setType(Currency.getInstance("USD"));
			
			
		}
		

		public void setDate(Calendar date){
			this.date=date;
			
		}
		public Calendar getDate(){
			return this.date;
			
		}
		public void setCategory(String category){
			this.category=category;
			
		}
		public String getCategory(){
			return this.category;
		}
		public void setDescription(String description){
			this.description=description;
			
		}
		public String getDescription(){
			return this.description;
			
		}
		public void setAmount(Integer amount){
			this.amount=amount;
		}
		public Integer getAmount(){
			return this.amount;
		}
		public void setType(Currency currency){
			this.currency=currency;
			
		}
		public Currency getType(){
			return this.currency;
		}
}
