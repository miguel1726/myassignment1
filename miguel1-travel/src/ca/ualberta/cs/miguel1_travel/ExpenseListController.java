package ca.ualberta.cs.miguel1_travel;

import java.math.BigDecimal;
import java.util.Currency;
//import java.util.Currency;

import android.widget.Spinner;

public class ExpenseListController {
	private static ExpList expenselist=null;
	private static ExpenseListController self=null;
	
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

	public void deleteClaim(Spinner exp) {
		// TODO Auto-generated method stub
		getExpenseList().deleteExp(expenselist.getExp(exp.getSelectedItemPosition()));
		
		
	}

	public static ExpenseListController getController() {
		if(self == null){
			self= new ExpenseListController
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
