package com.example;

public class Dog {
	static String food ="dog food";
	public static void main(String[] args) {
		Dog d = new Dog();
		//Dog d2 = new Dog();
		//d2.food = "no food"; changes food for all objects!.
		System.out.println("the food is "+d.food);
		System.out.println("the food is " +Dog.food);
		
	}

}
