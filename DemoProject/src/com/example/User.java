package com.example;

import javax.swing.JOptionPane;
import javax.swing.JButton;
public class User {

	public static void main(String[] args) {
		//JButton jb = new JButton("click me");
		//String name = JOptionPane.showInputDialog("Enter your name!");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		JOptionPane.showMessageDialog(null,"The sum is " +(num1+num2));
		//JOptionPane.showMessageDialog(null, "hello, "+name +" Welcome to ust!..");
	}
}
