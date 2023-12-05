package ATM;

import BankAccount.Account;

import java.util.Scanner;
 
public class ATMFunctions{
	Scanner scan;
	private Account account;
	public ATMFunctions(Account account) {
		scan = new Scanner(System.in);
		this.account = account;
	}
	public static void main(String[] args) {
		Account acount = new Account(1000);
		ATMFunctions system = new ATMFunctions(acount);
		system.run();
	}
	public void Display() {
		System.out.println("ATM Manu");
		System.out.println("1: Enter your Deposit amount");
		System.out.println("2: Enter your withdraw amount");
		System.out.println("3: check balance");
		System.out.println("4: Exit");
		System.out.println("Enter your choise");

	}
	private void run() {
		
		boolean running = true;
		while(running) {
			Display();
			int choise = scan.nextInt();
			scan.nextLine();
		switch(choise) {
		case 1:
			deposit();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			balancecheck();
			break;
		case 4:
			running = false;
			System.out.println("Exiting the ATM");
			break;	
			default:
				System.out.println("Invalid choise. please Enter valid choise: ");
			break;
		}
		}
	}
	public void deposit() {
		System.out.println("Enter your Deposit amount:");
		long amount = scan.nextLong();
		if (amount <= 0) {
			System.out.println("Invalid amount for deposit");
		} else {
			account.deposit(amount);
			System.out.println("Deposit successfull: Your current balance is: "+account.getbalance());
		}
		
	}
	public void withdraw() {
		System.out.println("Enter your withdraw amount:");
		long amount = scan.nextLong();
		if (amount <= 0 || amount >= account.getbalance()) {
			System.out.println("Invalid amount for withdraw");
		} else {
			 account.withdraw(amount);
			 System.out.println("Withdraw Successfull: Your current balance is: "+account.getbalance());

		}
	}
	public void balancecheck() {
		
	}
} 