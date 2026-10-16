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
        System.out.printf("[Employee]: %s%n[Gross pay]: %.2f%n",name,grossPay);

        // Overtime pay calculation
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (payRate * 1.5);
            System.out.printf("[Overtime hours]: %.2f%n[Overtime pay]: %.2f%n",overtimeHours,overtimePay);
        }
    }
}