package ca.ualberta.cs.miguel1_travel;

import java.util.ArrayList;
import java.util.Collection;



public class ExpList {
	protected ArrayList<Expense> expenses;
	protected ArrayList<Listener> listeners;
	
	public void ExpenseList(){
			expenses=new ArrayList<Expense>();
			listeners= new ArrayList<Listener>();
	}
	
		
	public void addExp(Expense exp){
		expenses.add(exp);
		notifyListeners();
	}

	private void notifyListeners() {
		for (Listener listener : getListeners()) {
		listener.update();
		}
	}
	
	private ArrayList<Listener> getListeners() {
		if (listeners == null ) {
		listeners = new ArrayList<Listener>();
		}
		return listeners;
	}
	public void addListener(Listener l){
		listeners.add(l);
	}
	
	public void removeListener(Listener l){
		listeners.remove(l);
	}
	
	public void deleteExp(Expense exp){
		expenses.remove(exp);
		notifyListeners();
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
	
	public ArrayList<Expense> getExpenses(){
		return expenses;
	}
}
