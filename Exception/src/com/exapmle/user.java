package com.exapmle;

import java.io.DataInputStream;
import java.io.IOException;

public class user {
	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter your name");
		String name ="";
		try {
			name = dis.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Hai " +name +" Welcome to UST");
	}

}
