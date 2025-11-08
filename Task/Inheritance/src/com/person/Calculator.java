package com.person;

//METHOD OVERLOADING

class Cal {

  int add(int a, int b) {

    return a + b;

  }



  int add(int a, int b, int c) {

    return a + b + c;

  }



  double add(double a, double b) {

    return a + b;

  }

}

public class Calculator {

  public static void main(String[] args) {

    Cal calc = new Cal();



    System.out.println(calc.add(5, 10));     

    System.out.println(calc.add(5, 10, 15));   

    System.out.println(calc.add(5.5, 4.5));    

  }

}