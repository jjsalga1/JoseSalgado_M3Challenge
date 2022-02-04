package com.company;

import java.util.Scanner;

public class FizzBuzzFibonacci {
    public static void main(String[] args) {
        // create Scanner and get 2 inputs from user
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstInput = Integer.parseInt(myScanner.nextLine());
        System.out.print("Enter the second number: ");
        int secondInput = Integer.parseInt(myScanner.nextLine());

        // compute FizzBuzz
        System.out.println("\nFizzBuzz\n" + "==========");
        for (int i = 1; i <= firstInput; i++) {
            // check if number is divisible by both 3 and 5 first
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            }
            // check if divisible by 3
            else if ((i % 3) == 0) {
                System.out.println("Fizz");
            }
            // check if divisible by 5
            else if ((i % 5) == 0) {
                System.out.println("Buzz");
            }
            // not divisible by any
            else {
                System.out.println(i);
            }
        }

        // compute Fibonacci
        System.out.println("\nFibonacci\n" + "==========");

        // variables for computing sequence
        int num1 = 0;
        int num2 = 1;
        int nextNum;
        // Start printing sequence with first 2 numbers already given
        System.out.print(num1 + " " + num2);
        // Subtract 2 from second input integer to account for first two numbers in sequence
        for (int i = 0; i < secondInput - 2; i++) {
            // calculate next number in sequence and print it
            nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            // reassign variables for next calculation
            num1 = num2;
            num2 = nextNum;
        }
    }
}
