package ca.ualberta.cs.miguel1_travel;

//import java.io.Serializable;
import java.math.BigDecimal;

import java.util.Currency;

/*STORES INFORMATION ABOUT A SINGLE EXPENSE*/

public class Expense /*implements Serializable*/{
	//private static final long serialVersionUID = -2L;
		protected String name;
		private String date;
		private String category;
		private String description;
		private BigDecimal amount;
		private Currency currency;
		
		public Expense(String name){
			this.name=name;
		}
		
		/*public Expense(){
			setDate(date);
			setCategory(category);
			setDescription("");
			setAmount(new BigDecimal(0));
			setType(Currency.getInstance("USD"));
			
			
		}
		public Expense(Expense exp){
			copyFrom(exp);
		}
		public void copyFrom(Expense exp){
			setDate(new String (exp.date));
			setCategory(new String(exp.category));
			setDescription(new String(exp.description));
			setAmount( new BigDecimal(exp.amount.toString()));
			setType(exp.currency);
			
		}*/
		public String getName(){
			return this.name;
		}
		
		public String toString(){
			return getName();
		}

		public void setDate(String date){
			this.date=date;
			
		}
		public String getDate(){
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
		public void setAmount(BigDecimal amount){
			this.amount=amount;
			
			amountUpdate();
		}
		public BigDecimal getAmount(){
			return amount;
		}
		public void setType(Currency currency){
			this.currency=currency;
			
		}
		public Currency getType(){
			return this.currency;
		}
		private void amountUpdate(){
			if(amount==null) return;
			if(currency ==null) return;
			
			amount=amount.setScale(currency.getDefaultFractionDigits(),BigDecimal.ROUND_UP);
			
		}
}
