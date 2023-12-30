package lab2;

public class CheckingAccount extends Account {
	private int count;
	private static final int FREE_TRANSACTIONS=0;
	public CheckingAccount(int a) {
		super(a);
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		count++;
		
	}
	
	public void withDraw(double sum) {
		super.withDraw(sum);
		count++;
	}
	
	public void deductFee() {
		setBalance(getBalance()-count*0.02);
		count = 0;
	}

	public int getFREE_TRANSACTIONS() {
		return FREE_TRANSACTIONS;
	}
	
	public String toString() {
		return "This is Checking account with number  " + getAccNumber()+ "  with  "+ getBalance();
	}
	

}
