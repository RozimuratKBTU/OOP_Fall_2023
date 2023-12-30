package lab2;

public class SavingAccount extends Account{
	protected double interest;
	
	
	public SavingAccount(int a,double interest) {
		super(a);
		this.interest = interest;
	}
	
	public void addInterest() {
		setBalance(getBalance()*(1+ interest/100));
	}
	
	public String toString() {
		return "This is Saving account with number  " + getAccNumber()+ "  with  "+ getBalance();
	}
	

	
	

}
