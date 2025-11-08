package com.Int.ust.dao;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
import com.Int.ust.bean.DoctorBean;
import com.Int.ust.service.Administrator;

public class AdministratorDao implements Administrator {
    
   
    public static ArrayList<DoctorBean> db = new ArrayList<DoctorBean>();
    
    public AdministratorDao() {
        
    }
    @Override
    public String add(DoctorBean doctorbean) {
        
        String doctorID = JOptionPane.showInputDialog("Enter Doctor ID:");
        String doctorName = JOptionPane.showInputDialog("Enter Doctor Name:");
        String gender = JOptionPane.showInputDialog("Enter Doctor Gender (Male/Female/Other):");
        String qualification = JOptionPane.showInputDialog("Enter Doctor Qualification:");
        String specialization = JOptionPane.showInputDialog("Enter Doctor Specialization:");
        String street = JOptionPane.showInputDialog("Enter Doctor Street:");
        String location = JOptionPane.showInputDialog("Enter Doctor Location:");
        String city = JOptionPane.showInputDialog("Enter Doctor City:");
        String state = JOptionPane.showInputDialog("Enter Doctor State:");
        String pincode = JOptionPane.showInputDialog("Enter Doctor Pincode:");
        String contactNumber = JOptionPane.showInputDialog("Enter Doctor Contact Number:");
        String emailID = JOptionPane.showInputDialog("Enter Doctor Email ID:");
        int yearsOfExperience = Integer.parseInt(JOptionPane.showInputDialog("Enter Doctor Years of Experience:"));
        String dob = JOptionPane.showInputDialog("Enter Doctor Date of Birth (dd/MM/yyyy):");
        String doj = JOptionPane.showInputDialog("Enter Doctor Date of Joining (dd/MM/yyyy):");
        DoctorBean newDoctor = new DoctorBean(
        	    doctorID, doctorName, dob, doj, gender, qualification, specialization, 
        	    yearsOfExperience, street, location, city, state, pincode, contactNumber, emailID
        	);
        db.add(newDoctor);
		return "SUCESSS";
		
    }

                @Override
                public ArrayList<DoctorBean> viewALLDoctor() {
            
                    if (db != null && !db.isEmpty()) {
                        for (DoctorBean doctor : db) {
                           
                            System.out.println(doctor);
                        	
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No doctors available.");
                    }
                    return db;  
                }

                public int removeDoctor(String doctorID) {
                    Iterator<DoctorBean> iterator = db.iterator();
                    while (iterator.hasNext()) {
                        DoctorBean doctor = iterator.next();
                        if (doctor.getDoctorID().equals(doctorID)) {
                            iterator.remove();  
                            return 1; 
                        }
                    }
                    return 0; 
                }

				@Override
				public Boolean modifyDoctor(DoctorBean doctorBean) {
				    String op = JOptionPane.showInputDialog("Enter which data to modify (only enter number):\n1. Doctor Name\n2. Date of Birth\n3. Specialization\n4. Experience");
				    
				    String id = JOptionPane.showInputDialog("Enter Doctor ID:");
				    boolean doctorFound = false;

				    for (DoctorBean doctor : db) {
				      
				        if (doctor.getDoctorID().equals(id)) {
				            doctorFound = true; 
				            switch (op) {
				                case "1": // Modify Doctor Name
				                    String name = JOptionPane.showInputDialog("Enter new name");
				                    doctor.setDoctorName(name);
				                    JOptionPane.showMessageDialog(null, "Doctor name updated successfully!");
				                    break;
				                
				                case "2": // Modify Date of Birth
				                    String dob = JOptionPane.showInputDialog("Enter new Date of Birth (dd/MM/yyyy)");
				                    doctor.setDateOfBirth(dob);
				                    JOptionPane.showMessageDialog(null, "Doctor's Date of Birth updated successfully!");
				                    break;
				                
				                case "3": // Modify Specialization
				                    String spec = JOptionPane.showInputDialog("Enter new Specialization");
				                    doctor.setSpecialization(spec);
				                    JOptionPane.showMessageDialog(null, "Doctor's Specialization updated successfully!");
				                    break;
				                
				                case "4": // Modify Experience
				                    String ex = JOptionPane.showInputDialog("Enter new Experience (in years)");
				                    doctor.setYearsOfExperience(Integer.parseInt(ex));  // Convert to int
				                    JOptionPane.showMessageDialog(null, "Doctor's Experience updated successfully!");
				                    break;
				                
				                default:
				                    JOptionPane.showMessageDialog(null, "Invalid choice");
				                    break;
				            }
				            break; 
				        }
				    }
				    
				   
				    if (!doctorFound) {
				        JOptionPane.showMessageDialog(null, "Doctor with ID " + id + " not found.");
				        return false;  
				    }

				    return true;
				}

                
    }