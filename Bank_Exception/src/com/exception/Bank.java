package com.exception;

import java.util.Scanner;

public class Bank {
	private int amount;
	private static int balance=0;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	boolean running = true;
	while(running)
	{
		System.out.println("Choose one operation:\n1.Deposit\n2.Withdraw\n3.Balance\n4.exit" );
		String op = sc.next();
		switch(op)
		{
		case "1": System.out.println("Enter amount to deposit");
		  			int new_amount = sc.nextInt();
		  			balance= balance + new_amount;}
	}
}}