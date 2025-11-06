package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date_eg {
	public static void main(String[] args) throws ParseException {
//		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		String str = sdf.format(d);
//		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date");
		String date = sc.next();
		Date d = sdf.parse(date);
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
	}
}
