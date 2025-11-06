package com.example;

public class Hotel implements Non_veg,veg
{
int total_price=0;
	@Override
	public void chicken_curry() {
		int price = 100;
		total_price=total_price+price;
		System.out.println("Cost of chicken is " +price);
		
	}

	@Override
	public void beef() {
		int price = 120;
		total_price =total_price+ price;
		System.out.println("Cost of beef is " +price);
		
	}

	@Override
	public void biriyani() {
		int price = 180;
		total_price = total_price+ price;
		System.out.println("Cost of biriyani is " +price);
		
	}

	@Override
	public void chappathi() {
		int price = 12;
		total_price =total_price + price;
		System.out.println("Cost of chappathi is " +price);
		
	}

	@Override
	public void sambar() {
		int price = 60;
		total_price =total_price + price;
		System.out.println("Cost of sambar is " +price);
		
	}

	@Override
	public void greenpeas() {
		int price = 50;
		total_price =total_price + price;
		System.out.println("Cost of greenpeas is " +price);
		
	}

	@Override
	public void porotta() {
		int price = 15;
		total_price =total_price + price;
		System.out.println("Cost of porotta is " +price);
		
	}
	
	public void Total()
	{
		System.out.println("Total price is " +total_price);
	}
	
}
