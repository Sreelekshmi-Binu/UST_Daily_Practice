package com.student;

import java.util.ArrayList;

public class Students {
	private  int marks;
	private String name;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		ArrayList<Students> s = new ArrayList<Students>();
		Students s1 = new Students();
		s1.setName("Sreelekshmi");
		s1.setMarks(25);
		Students s2 = new Students();
		s2.setName("Rohit");
		s2.setMarks(20);
		s.add(s2);
		s.add(s1);
		for(Students o:s)
		{
			System.out.println(o);
		}
		
	}
	@Override
	public String toString() {
		return "Students marks=" + marks + ", name=" + name ;
	}
	
}
