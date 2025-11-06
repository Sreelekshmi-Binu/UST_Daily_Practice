package com.example;
class A
{ A()
	{
	System.out.println("A default constructor");
	}
	A(int x)
	{
		System.out.println("The value of x is.. "+x);
	}
}
public class B extends A{
	B()
	{ 
		super(5);
		System.out.println("B class constructor...");
	}
	B(int x)
	{
		super(x);
		System.out.println("B class x value is "+x );
	}
	public static void main(String[] args) {
		B o= new B(22);  //new B(); just this also creates object
	} 

}
