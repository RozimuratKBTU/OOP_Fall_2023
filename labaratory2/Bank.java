package lab2;
import java.util.Iterator;
import java.util.Vector;
public class Bank {
	Vector<Account> accounts = new Vector<Account>();
	
	
	public Bank() {
		
	}
	void addAccount(Account account) {
		accounts.add(account);
	}
	
	void closeAccount(Account account) {
		accounts.remove(account); 
	}
	
	public void update(double money) {
		
		Iterator<Account> value = accounts.iterator() ; 
		  
	    while (value.hasNext()) { 
	    	
	        Account cur = value.next() ;
	        System.out.print("before: " + cur.toString()+'\n');
	        cur.deposit(money);
	        
	        if(cur instanceof SavingAccount) {
	        	SavingAccount s= (SavingAccount)cur;
	        	s.addInterest();
	        }
	        else if(cur instanceof CheckingAccount) {
	        	CheckingAccount c = (CheckingAccount)cur;
	        	c.deductFee();	
	        }
	        System.out.print("after: "+cur.toString()+'\n');
	        
	    } 
	}
	
	public String accsInfo() {
		Iterator<Account> value = accounts.iterator() ; 
		String s="";
	    while (value.hasNext()) { 
	    	
	        Account cur = value.next() ;
	        s+=cur.toString()+'\n';
	        
	    } 
	    return s;
	}
	
	
	public String toString() {
		return "Welcome to the Bank. We have  " + accounts.size()+ ". They are :\n"+ accsInfo() ;
	}
	
	
}
