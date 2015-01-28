package ca.ualberta.cs.miguel1_travel;

import java.math.BigDecimal;
import java.util.Currency;
//import java.util.Currency;

import android.widget.Spinner;

public class ExpenseListController {
	private static ExpList expenses=null;
	
	public static ExpList getExpenseList(){
		if (expenses == null){
			expenses=new ExpList();
		}
		return expenses;
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
		
		
		Expense expense= expenses.getExp(exp.getSelectedItemPosition());
		expense.setCategory(category.getSelectedItem().toString());
		expense.setDate(date);
		expense.setAmount(new BigDecimal(amount));
		Currency cur= Currency.getInstance(currency.getSelectedItem().toString());
		expense.setType(cur);
		
		
	}

	public void deleteClaim(Spinner exp) {
		// TODO Auto-generated method stub
		getExpenseList().deleteExp(expenses.getExp(exp.getSelectedItemPosition()));
		
		
	}
	
	
	
	
}
