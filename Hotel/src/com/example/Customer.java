package com.example;

public class Customer extends Hotel{
 public static void main(String[] args) {
	Customer c = new Customer();
	Non_veg nv = new Customer();
	veg v = new Customer();
	Hotel h = new Customer();
	c.chappathi();
	c.greenpeas();
	nv.beef();
	nv.chicken_curry();
	c.Total();
}
}
