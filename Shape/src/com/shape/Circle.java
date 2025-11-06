package com.shape;

public class Circle implements Shape{
	public void draw() {
		System.out.println("Draw Circle....");
		
	}
public static void main(String[] args) {
	Shape c = new Circle();
	c.draw();
}
}
