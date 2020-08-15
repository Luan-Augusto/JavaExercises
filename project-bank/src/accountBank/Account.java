package accountBank;

public class Account {

	public String holder;
	private double balance;

	public Account(String holder, double balance) {
		super();
		this.holder = holder;
		this.balance = balance;
	}

	public Account(String holder) {
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public Account(double balance) {
		this.balance = balance;
	}

	void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdrawMoney(double value) {
		this.balance -= value;
	}

	public void transfer(double value, Account otherAccount) {

		if (value > this.balance) {
			System.out.println("Operation not performed. Insufficient money.");
		} else {
			this.withdrawMoney(value);
			otherAccount.deposit(value);
		}
	}
	
	public String toString() {
		return this.getHolder() + " - $ " + this.getBalance();
	}

}