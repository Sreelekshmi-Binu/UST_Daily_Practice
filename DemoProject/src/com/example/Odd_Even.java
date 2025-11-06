package com.example;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Odd_Even {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		if(num1%2 == 0)
		{
			JOptionPane.showMessageDialog(null,"The number " +num1 +" is even");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"The number " +num1 +" is odd");
		}
	}

}
