package com.bank;

public class ICICIBank implements Loan{

	@Override
	public void interestRate(int amount) {
		float total_amount = (amount * 3)/100;
		System.out.println("The interest amount is " +total_amount);
	}

}
