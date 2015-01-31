package ca.ualberta.cs.miguel1_travel;

//import java.io.Serializable;
import java.io.Serializable;
import java.math.BigDecimal;

import java.util.Currency;

/*STORES INFORMATION ABOUT A SINGLE EXPENSE */

/**
 * @author  miguel1
 */
public class Expense implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1059691818435895507L;
		
		/**
		 * @uml.property  name="name"
		 */
		protected String name;
		/**
		 * @uml.property  name="date"
		 */
		private String date;
		/**
		 * @uml.property  name="category"
		 */
		private String category;
		/**
		 * @uml.property  name="description"
		 */
		private String description;
		/**
		 * @uml.property  name="amount"
		 */
		private BigDecimal amount;
		private Currency currency;
		
		public Expense(String name){
			this.name=name;
		}
		
		/**
		 * @return
		 * @uml.property  name="name"
		 */
		public String getName(){
			return this.name;
		}
		
		public String toString(){
			return getName();
		}

		/**
		 * @param date
		 * @uml.property  name="date"
		 */
		public void setDate(String date){
			this.date=date;
			
		}
		/**
		 * @return
		 * @uml.property  name="date"
		 */
		public String getDate(){
			return this.date;
			
		}
		/**
		 * @param category
		 * @uml.property  name="category"
		 */
		public void setCategory(String category){
			this.category=category;
			
		}
		/**
		 * @return
		 * @uml.property  name="category"
		 */
		public String getCategory(){
			return this.category;
		}
		/**
		 * @param description
		 * @uml.property  name="description"
		 */
		public void setDescription(String description){
			this.description=description;
			
		}
		/**
		 * @return
		 * @uml.property  name="description"
		 */
		public String getDescription(){
			return this.description;
			
		}
		/**
		 * @param amount
		 * @uml.property  name="amount"
		 */
		public void setAmount(BigDecimal amount){
			this.amount=amount;
			
			amountUpdate();
		}
		/**
		 * @return
		 * @uml.property  name="amount"
		 */
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
