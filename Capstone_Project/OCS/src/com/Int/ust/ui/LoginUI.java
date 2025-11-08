package com.Int.ust.ui;
import javax.swing.JOptionPane;
import com.Int.ust.bean.CredentialsBean;
import com.Int.ust.bean.DoctorBean;
import com.Int.ust.dao.AdministratorDao;

public class LoginUI {

    public static void main(String[] args) {
    	AdministratorDao.db.add(new DoctorBean("D001", "Dr. John Doe","01/01/1980","01/01/1980", "Male", "MBBS", "Cardiology", 10, "Street 1", "Location 1", "City 1", "State 1", "10001", "1234567890", "john.doe@example.com"));
        boolean running = true;
        while (running) {
            String userName = JOptionPane.showInputDialog("Enter Username:");
            String password = JOptionPane.showInputDialog("Enter Password:");

            CredentialsBean cb = new CredentialsBean();
            if (CredentialsBean.isValidCredentials(userName, password)) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
                String role = getUserRole(userName);
                AdministratorDao adminDao = new AdministratorDao();
               
                switch (role) {
                    case "Add":
                      
                        adminDao.add(null);  
                        break;
                    case "View":
                       
                        adminDao.viewALLDoctor();
                        break;
                    case "Modify":
                        			Boolean result = adminDao.modifyDoctor(null);
                        			if(result==true)
                        			{
                        				adminDao.viewALLDoctor();
                        			}
                        			break;
                    case "Delete":
                    	 	 String id = JOptionPane.showInputDialog("Enter Doctor id");
                    	 	 int result1 = adminDao.removeDoctor(id);
                    	 	 if(result1==1)
                    	 	 {
                    	 		 JOptionPane.showMessageDialog(null,"Doctor deleted succesfull");
                    	 		 adminDao.viewALLDoctor();
                    	 	
                    	 	 }
                    	 	 else
                    	 	 {
                    	 		 JOptionPane.showMessageDialog(null,"No Matching Doctor id found");
                    	 	 }
                    	 	 
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No Permissions for this role.");
                        break;
                }
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to log in again?", "Continue", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.NO_OPTION) {
                    running = false; 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                break; 
            }
        }
    }

    public static String getUserRole(String userName) {
        switch (userName) {
            case "AD-001":
                return "Add"; 
            case "AD-002":
                return "View";  
            case "AD-003":
                return "Modify";  
            case "AD-004":
                return "Delete";   
            default:
                return "No Permissions";  
        }
    }
}
