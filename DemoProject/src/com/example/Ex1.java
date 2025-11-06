package com.example;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter your name");
		//String name = sc.nextLine();
		//String name = sc.next(); doesn't include white spaces
		//System.out.println("Hai " +name+" Welcome");
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter another no");
		int b= sc.nextInt();
		System.out.println("The sum of " +a +" and "+b +" is " +(a+b));
		sc.close();
	}

}
