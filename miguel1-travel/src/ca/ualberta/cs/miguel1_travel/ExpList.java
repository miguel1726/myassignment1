package ca.ualberta.cs.miguel1_travel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;



/**list containing the expenses , functions and listeners
 * @author  miguel1
 */
public class ExpList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2916038907765627881L;
	protected ArrayList<Expense> expenseslist;
	/**
	 * @uml.property  name="listeners"
	 */
	protected ArrayList<Listener> listeners;
	
	public void ExpenseList(){
			expenseslist=new ArrayList<Expense>();
			listeners= new ArrayList<Listener>();
	}
	
		
	public void addExp(Expense exp){
		expenseslist.add(exp);
		notifyListeners();
	}

	private void notifyListeners() {
		for (Listener listener : getListeners()) {
		listener.update();
		}
	}
	
	/**
	 * @return
	 * @uml.property  name="listeners"
	 */
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
		expenseslist.remove(exp);
		notifyListeners();
	}
	
	public int size(){
		return expenseslist.size();
	}
	
	public int indexofExp(Object exp){
		return expenseslist.indexOf(exp);
	}
	
	public boolean contains(Expense exp){
		return expenseslist.contains(exp);
	}
	
	public Expense get(int index){
		return expenseslist.get(index);
		
	}
	
	public Expense getExp(int index){
		return expenseslist.get(index);
	}
	
	public ArrayList<Expense> getExpenses(){
		return expenseslist;
	}
}
