package com.example;
class Ar
{
	Ar()
	{
		System.out.println("default Ar");
	}
	Ar(int x)
	{
		System.out.println("va;ue of x in Ar "+x);
	}
}
class Br extends Ar{
	Br()
	{
		
		System.out.println("Default Br");
	 }
	Br(int x)
	{   super(5);
		System.out.println("value of x in Br "+x);
	}
}
class C extends Br
{
	C()
	{
		System.out.println("Default C");
		
	}
	C(String name,int age,int salary)
	{	super(6);
		System.out.println("Employee details are....");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
}
public class Superr extends C {
		Superr()
		{
			System.out.println("default superr");
		}
		Superr(int x)
		{	super("Sreelekshmi",22,35000);
			System.out.println("value of x in Superr" +x);
		}
public static void main(String[] args) {
	new Superr(8);
	Superr s= new Superr();
}
}
