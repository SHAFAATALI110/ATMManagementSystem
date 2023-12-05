package BankAccount;

public class Account{
	private long balance;
	public Account(long inicialbalance) {
		this.balance = inicialbalance;
	}
	public long getbalance() {
		return balance;
	}
	public void deposit(long amount) {
		balance += amount;
	}
	public void withdraw(long amount) {
		balance -= amount;
	}
} 