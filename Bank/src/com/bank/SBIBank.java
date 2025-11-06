package com.bank;

public class SBIBank implements Loan{

	@Override
	public void interestRate(int amount) {
		float total_amount = (amount * 2)/100;
		System.out.println("The interest amount is " +total_amount);
	}

}
