package account;

public class Account {
	private String holder;
	private int number;
	private double balance;
	
	
	public Account(String holder, int number, Double balance) {
		super();
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}


	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double value) {
		balance+=value;
	}
	
	public void withdraw(double value) {
		balance-=(value+5.0);
	}

	@Override
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", number, holder, balance);
	}
	
	
}
