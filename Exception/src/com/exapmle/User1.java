package com.exapmle;

import java.util.Scanner;

public class User1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int a = sc.nextInt();
		if(a>=18)
		{
			System.out.println("Valid Age");
		}
		else 
		{
			try
			{
				throw new InvalidAgeException(a);
				
			}
			catch(InvalidAgeException iae)
			{
				System.out.println(iae);
			}
		}
	}

}
