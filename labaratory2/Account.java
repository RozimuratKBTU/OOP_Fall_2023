package lab2;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance=0.0;
		setAccNumber(a);
	}
	
	
	public void deposit(double sum) {
		if(sum>0) balance+=sum;
		else System.out.print("Use positive number please");
	}
	
	public void withDraw(double sum) {
		if(sum>balance) balance-=sum;
		else System.out.print("There are no enough money");
	}
	
	public void transfer(double amount,  Account other) {
		balance -= amount;
		other.balance += amount;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public String toString() {
		return "This is just account with number  " + getAccNumber()+ "  with  "+ getBalance();
	}
	
	public final void print() {
		
		System.out.println(toString());
	}
	
}
