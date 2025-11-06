package com.example;
import java.util.Scanner;
public class Mark {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark = sc.nextInt();
		if(mark>=0 && mark<40)
		{
			System.out.println("Fail....");
		}
		else if(mark>=40 && mark <60)
		{
			System.out.println("Pass....");
		}
		else if(mark>=60 && mark <70)
		{
			System.out.println("second class...");
		}
		else if(mark>=70 && mark<80)
		{
			System.out.println("First Class....");
		}
		else if(mark>=80 && mark<90)
		{
			System.out.println("first class...");
		}
		else if(mark>=90 && mark<=100)
		{
			System.out.println("Distinction");
		}
		else {
			System.out.println("invalid mark");
		}
	}

}
