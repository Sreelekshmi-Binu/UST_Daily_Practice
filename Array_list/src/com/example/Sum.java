package com.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Sum {
public static void main(String[] args) {
	ArrayList<Integer>al = new ArrayList<>();
	System.out.println("Enter the marks");
	Scanner sc = new Scanner(System.in);
	for(int i =0;i<3;i++)
	{
	 int marks = sc.nextInt();
	 al.add(marks);
	}
	System.out.println("The marks are..");
	for(int o:al)
	{
		System.out.println(o);
	}
}
}