package edu.kit.informatik;

public class Account {
	
	private int accountNumber;
	private int bankCode;
	private int balance;	
	
	public Account(int bankCode, int accountNumber) {
		this.bankCode = bankCode;
		this.balance = 0;
		this.accountNumber = accountCounter++;
	}
	
	public boolean withdraw(int amount) {
		if (balance - amount >= 0) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getBankCode() {
		return bankCode;
	}
	
	public int getBalance() {
		return balance;
	}
}