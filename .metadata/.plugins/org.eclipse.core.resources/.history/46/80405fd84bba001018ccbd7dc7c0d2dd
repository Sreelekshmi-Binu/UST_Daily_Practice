package com.Int.ust.ui;

import javax.swing.*;

import com.Int.ust.dao.AdministratorDao;

public class LoginUI {
public static void main(String[] args) {
	String Id=JOptionPane.showInputDialog("Enter Username");
	String Password=JOptionPane.showInputDialog("Enter Password");
	if(Id.equals("AD-001") && Password.equals("AD-001"))
	{
		JOptionPane.showMessageDialog(null,"Password is correct");
		AdministratorDao ad = new AdministratorDao();
		String result = ad.addDoctor(null);
		JOptionPane.showMessageDialog(null, result);
	}
	else if(Id.equals("AD-002") && Password.equals("AD-002"))
	{
		JOptionPane.showMessageDialog(null,"Password is correct");
		AdministratorDao ad = new AdministratorDao();
		ad.viewAllDoctor();
	}
	else if(Id.equals("AD-003") && Password.equals("AD-003"))
	{
		
	}
}
}
