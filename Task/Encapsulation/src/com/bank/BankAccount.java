package com.bank;

import java.util.Scanner;

public class BankAccount {
	private String AccountNo;
	private int Pin = 2314;
	private float Balance=0;
	//int currentbalance=0;
	public String getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your pin");
		int p = sc.nextInt(); 
		BankAccount account = new BankAccount();
		if(p== account.getPin())
		{
			boolean running = true;
			while(running) {
				System.out.println("choose an operation: 1.Deposit, 2.Withdrwal, 3.Balance ,4.Exit");
				String c = sc.next();
		switch(c)
		{
		case "1":
		    System.out.println("Enter amount to deposit:");
		    int amount1 = sc.nextInt();
		    float newBalance = account.getBalance() + amount1;
		    account.setBalance(newBalance);
		    System.out.println("Deposit successful. New balance: ₹" + account.getBalance());
		    break;

		case "2":
		    System.out.println("Enter amount to withdraw:");
		    int amount2 = sc.nextInt();
		    if (amount2 <= account.getBalance()) {
		        account.setBalance(account.getBalance() - amount2);
		        System.out.println("Withdrawal successful. Remaining balance: ₹" + account.getBalance());
		    } else {
		        System.out.println("Insufficient balance.");
		    }
		case "3":
				System.out.println("Your balance is: "+account.getBalance());
		    break;
		case "4": System.out.println("Thank you");
					running = false;
					break;
		
		}
	}
		}
	else
	{
	System.out.println("Incorrect password");	
	}
		}
}
