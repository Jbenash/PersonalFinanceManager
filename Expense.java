package com.mycompany.personalfinancemanager;

import java.util.Scanner;

public class Expense {
    private String category;
    private double amount;
    private String date;

    // Constructor
    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    // Static method to create an Expense instance from user input
    public static Expense createExpenseFromUserInput(Scanner scanner) {
        System.out.print("Enter expense category: ");
        String category = scanner.nextLine();
        
        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter expense date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        return new Expense(category, amount, date);
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Override toString method to display expense details
    @Override
    public String toString() {
        return "Expense{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
        // Method to display expense details
    public void displayExpense() {
        System.out.println("Expense Category: " + category);
        System.out.println("Expense Amount: " + amount);
        System.out.println("Expense Date: " + date);
    }
}
