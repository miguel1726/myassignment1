package ca.ualberta.cs.miguel1_travel;

import java.math.BigDecimal;
import java.util.Currency;
//import java.util.Currency;

import android.widget.Spinner;

/**
 * Controller in charge of main functions of the expenselist: add, edit
 * @author  miguel1
 */
public class ExpenseListController {
	/**
	 * @uml.property  name="expenselist"
	 * @uml.associationEnd  
	 */
	private static ExpList expenselist=null;
	
	
	public static ExpList getExpenseList(){
		if (expenselist == null){
			expenselist=new ExpList();
		}
		return expenselist;
	}

	public void addExp(String name, String date, Spinner category, String description,
			String amount, Spinner currency) {
		// TODO Auto-generated method stub
		Expense expense= new Expense(name);
		expense.setCategory(category.getSelectedItem().toString());
		expense.setDate(date);
		expense.setAmount(new BigDecimal(amount));
		Currency cur= Currency.getInstance(currency.getSelectedItem().toString());
		expense.setType(cur);
		
		getExpenseList().addExp(expense);
		
				
		
	}

	public void editExp(Spinner exp, String date, Spinner category,
			String description, String amount, Spinner currency) {
		// TODO Auto-generated method stub
		
		
		Expense expense= expenselist.getExp(exp.getSelectedItemPosition());
		expense.setCategory(category.getSelectedItem().toString());
		expense.setDate(date);
		expense.setAmount(new BigDecimal(amount));
		Currency cur= Currency.getInstance(currency.getSelectedItem().toString());
		expense.setType(cur);
		
		
	}


	
	
	
	
	
}
