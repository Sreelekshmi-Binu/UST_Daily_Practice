package com.example;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
				int count = 0;
				for(int i=1;i<=num;i++) //for(i=0; i<=Math.sqrt(num);i++)									
				{							//{
					if(num%i == 0)			//if(num%i == 0)
					{						//	System.out.println("not prime);
						count = count + 1;	//return;
					}						//	}
				}								//System.out.println("prime number");
				if(count == 2)
				{
					System.out.println("the number is prime..");
				}
				else
				{
					System.out.println("the number isn't prime..");
				}
	}

}
