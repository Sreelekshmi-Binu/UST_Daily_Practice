package com.bank;

public class Customer1 extends Theater1 {
	void customer()
	{
		System.out.println("method inside customer");
	}
	public static void main(String[] args) {
		
	Customer1 c1 = new Customer1();
	Theater1 t = new Customer1();
	t.Thudarum();
	t.Lucifer();
	//t.customer(); error occurs since we creating reference of another class..
}
}
