Q2) write a program in Java using nested if else for leap year where user will
enter the year.

Ans.
package com.org.gen.Day1;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("is a leap year " + year);
        } else if (year % 100 == 0) {
            System.out.println("is not a leap year " + year);
        } else if (year % 4 == 0) {
            System.out.println("is a leap year " + year);
        } else {
            System.out.println("is not a leap year " + year);
        }
    }
}