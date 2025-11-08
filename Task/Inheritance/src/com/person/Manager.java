package com.person;
class Person //constructor Chaining
{
	Person()
	{
		System.out.println("Person constructor....");
	}
	Person(String name,int age,int salary)
	{
		System.out.println("Person details are....");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
}
class Employee extends Person{
	Employee()
	{
		
		System.out.println("Employee constructor...");
	 }
	Employee(String name,int age,int salary)
	{   super("Person",22,30000);
	System.out.println("Employee details are....");
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Salary: "+salary);
	}
}

public class Manager extends Employee{
		Manager()
		{
			System.out.println("Manager constructor....");
		}
		Manager(String name,int age,int salary)
		{	super("Employee",22,35000);
		System.out.println("Manager details are....");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		}
public static void main(String[] args) {
	new Manager("Manager",22,30000);
	Manager m= new Manager();
}
}
