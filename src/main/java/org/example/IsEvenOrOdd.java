package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsEvenOrOdd {
    public String isEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number followed by the Enter Key: ");
        try{
            int number = scanner.nextInt();
            return (number % 2 == 0) ? "Number " + "(" + number + ") is  Even" : "Number " + "(" + number + ") is  Odd";
        } catch (InputMismatchException ime) {
            return  "BAD USER DATA";
        }

    }
}
