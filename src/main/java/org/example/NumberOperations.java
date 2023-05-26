package org.example;

import java.util.Scanner;

public class NumberOperations {
    Scanner scanner = new Scanner(System.in);


    int a = scanner.nextInt();
    int b = scanner.nextInt();
     private int sum = a + b;

     public String getSum() {
         return "The sum of the Integers is " + sum;
     }

      public  String  operation() {
         String multiplication = "The multiplication of the integer is " + (a * b);
         String division = "The division of the integer is " + (double)(b / a);
         String remainder = "The remainder is " + (b % a);
         return division;
     }
}
