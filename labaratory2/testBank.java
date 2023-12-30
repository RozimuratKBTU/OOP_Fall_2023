package lab2;

public class testBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount(new Account(1));
		bank.addAccount(new SavingAccount(2,100));
		bank.addAccount(new CheckingAccount(3));
		bank.update(1000);
		

	}

}
