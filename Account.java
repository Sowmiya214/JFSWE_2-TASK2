package com.java.JFSWE_2.Task2;

public class Account {

	double balance;
	
	 public Account() {
	        this.balance = 0.0;
	    }

	    // Two-argument constructor
	    public Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	            this.balance = 0.0;
	        }
	    }

	    // Method to deposit amount to the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            this.balance += amount;
	            System.out.println(amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid amount. Deposit amount should be greater than 0.");
	        }
	    }

	    // Method to withdraw amount from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= this.balance) {
	            this.balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Withdrawal unsuccessful. Either amount is invalid or insufficient balance.");
	        }
	    }

	    // Method to display the balance
	    public void displayBalance() {
	        System.out.println("Current balance: " + this.balance);
	    }
	
	    public static void main(String[] args) {
	       
	        Account account1 = new Account(); 
	        account1.displayBalance(); 

	        Account account2 = new Account(100.0); 
	        account2.displayBalance(); 

	        account1.deposit(50.0); 
	        account1.displayBalance();

	        account2.withdraw(30.0); 
	        account2.displayBalance(); 
	    }
}
