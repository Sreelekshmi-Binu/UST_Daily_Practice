package com.demo;

public class Bat implements Animal,Birds {

	@Override
	public void fly() {
		System.out.println("Flies Fast");
		
	}

	@Override
	public void run() {
		System.out.println("Runs slow");
		
	}

	@Override
	public void eat() {
		System.out.println("Eats insects.");
	}
public static void main(String[] args) {
	Bat b = new Bat();
	b.eat();
	b.run();
	b.fly();
}
}
