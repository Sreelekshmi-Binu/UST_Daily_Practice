package com.demo;

public class Demo {
public static void main(String[] args) {
	Birds b = new Birds()
			{

				@Override
				public void eat() {
					
					System.out.println("Eats insects");
				}

				@Override
				public void fly() {
					System.out.println("Flies Fast..");
					
				}
		
			};
	b.eat();
	b.fly();
}
}
