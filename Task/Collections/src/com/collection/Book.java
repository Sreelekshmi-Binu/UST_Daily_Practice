package com.collection;

import java.util.HashMap;
import java.util.Scanner;

public class Book { //HashMap
String book_name;
String book_price;
String author;

@Override
public String toString() {
	return "Book name=" + book_name + ", Book_price=" + book_price + ", Author=" + author ;
}

public static void main(String[] args) {
	HashMap<String,Book> book = new HashMap<String,Book>();
	Scanner sc = new Scanner(System.in);
//	Book b = new Book();
//	b.book_name = "book1";
//	b.book_price="120 Rs";
//	b.author = "abc";
//	book.put(b.book_name, b);
	for(int i=0;i<2;i++)
	{
		Book b = new Book();
		System.out.println("Enter author");
		b.author = sc.nextLine();
		System.out.println("Enter bookname");
		b.book_name = sc.nextLine();
		System.out.println("Enter price");
		b.book_price = sc.nextLine();
		book.put(b.book_name, b);
	}
	System.out.println("Enter a book name to see price:");
	String view_book= sc.nextLine();
	for(int j=0;j<2;j++)
	{
		Book found = book.get(view_book);
		if (found != null) {
            System.out.println("Price: " + found.book_price);
        } else {
            System.out.println("Book not found.");
        }

	}
}


}
