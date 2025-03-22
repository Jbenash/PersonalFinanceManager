package com.mycompany.personalfinancemanager;

import java.util.Scanner;

public class Income {
    private String source;
    private double amount;
    private String date;

    // Constructor
    public Income(String source, double amount, String date) {
        this.source = source;
        this.amount = amount;
        this.date = date;
    }
    Scanner scan = new Scanner(System.in);
    // Static method to create an Income instance from user input
    public static Income createIncomeFromUserInput(Scanner scan) {
        System.out.print("Enter income source: ");
        String source = scan.nextLine();
        
        System.out.print("Enter income amount: ");
        double amount = scan.nextDouble();
        scan.nextLine(); // Consume newline

        System.out.print("Enter income date (YYYY-MM-DD): ");
        String date = scan.nextLine();

        return new Income(source, amount, date);
    }

    // Getter for source
    public String getSource() {
        return source;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Override toString method to display income details
    @Override
    public String toString() {
        return "Income{" +
                "source='" + source + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
        // Method to display income details
    public void displayIncome() {
        System.out.println("Income Source: " + source);
        System.out.println("Income Amount: " + amount);
        System.out.println("Income Date: " + date);
    }
}
