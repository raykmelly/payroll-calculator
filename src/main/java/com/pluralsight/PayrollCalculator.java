package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Ask for hours worked
        System.out.println("Enter your hours worked:");
        double hoursWorked = scanner.nextDouble();

        // Ask for pay rate
        System.out.println("Enter your pay rate:");
        double payRate = scanner.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * payRate;

        // Display employee name and gross pay
        System.out.printf("[Employee]: %s%n[Gross pay]: %.2f",name,grossPay);
    }
}