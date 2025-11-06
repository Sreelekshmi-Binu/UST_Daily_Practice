package com.example;

public class Tiger extends Animal {
	int legs=2;
	void eat()
	{
		System.out.println("Animal has "+super.legs +" legs.");
		super.eat();
		System.out.println("Eats only non veg");
	}
	void run()
	{
		System.out.println("Tiger runs...");
	}
public static void main(String[] args) {
	Tiger T = new Tiger();
	T.run();
	T.eat();
	System.out.println("A tiger has "+T.legs +"legs");
}
}
