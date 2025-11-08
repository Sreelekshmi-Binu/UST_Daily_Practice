package com.exapmle;

public class Finally {
public static void div(int x,int y) {
	try
	{
		System.out.println("Division of "+x+"/"+y +" is "+(x/y));
	}
	finally
	{
		System.out.println("Closing a resourse");
	}
	
}
public static void main(String[] args) {
	int x =22;
	int y=0;
	Finally.div(x, y);
	System.out.println("Exception Handling..");
}
}
