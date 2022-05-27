
public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) throws NumberFormatException {
		if(amount < 0)
			throw new NumberFormatException("Negative amount");
		
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) throws NumberFormatException, BalanceException {
		if(amount < 0)
			throw new NumberFormatException("Negative amount");
		else if(amount > balance)
			throw new BalanceException("Insufficient balance");
		
		balance -= amount;
		return balance;
	}
}
