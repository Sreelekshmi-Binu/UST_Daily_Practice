package com.collection;

import java.util.Scanner;
import java.util.TreeSet;

public class City implements Comparable<City> {
    String City_name;
    String City_code;
    String City_population;

    @Override
    public String toString() {
        return "City_name=" + City_name + ", City_code=" + City_code + ", City_population=" + City_population;
    }

    @Override
    public int compareTo(City o) {
        // Compare by City_name 
        return this.City_name.compareToIgnoreCase(o.City_name);
    }

    public static void main(String[] args) {
        
        TreeSet<City> tc = new TreeSet<>(); 
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        
        while (running) {
            System.out.println("Enter an operation to perform:\n1.add\n2.view\n3.exit");
            int op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    
                    for (int i = 0; i < 2; i++) {
                        City c = new City();
                        System.out.println("Enter city name:");
                        c.City_name = sc.nextLine();
                        System.out.println("Enter City code:");
                        c.City_code = sc.nextLine();
                        System.out.println("Enter city population:");
                        c.City_population = sc.nextLine();
                        tc.add(c);
                    }
                    break;
                
                case 2:
                    
                    for (City c : tc) {
                        System.out.println(c);
                    }
                    break;
                
                case 3:
                    running = false; 
                    break;
            }
        }
    }
}
