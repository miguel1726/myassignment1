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
