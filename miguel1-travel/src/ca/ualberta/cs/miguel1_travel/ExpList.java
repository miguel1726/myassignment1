package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.Collection;



public class ExpList {
	protected ArrayList<Expense> expenses=null;
	
	public void ExpenseList(){
			expenses=new ArrayList<Expense>();
			
	}
	
		
	public void addExp(Expense exp){
		expenses.add(exp);
	}
	
	public void deleteExp(Expense exp){
		expenses.remove(exp);
	}
	
	public int size(){
		return expenses.size();
	}
	
	public int indexofExp(Object exp){
		return expenses.indexOf(exp);
	}
	
	public boolean contains(Expense exp){
		return expenses.contains(exp);
	}
	
	public Expense get(int index){
		return expenses.get(index);
		
	}
	
	public Expense getExp(int index){
		return expenses.get(index);
	}
	
	public Collection<Expense> getExpenses(){
		return expenses;
	}
}
