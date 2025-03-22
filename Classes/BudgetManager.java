package com.mycompany.personalfinancemanager;

import java.util.Scanner;

public class BudgetManager {

    private double income;
    private double expenses;

    // Constructor
    public BudgetManager(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    // Method to set budget from user input
    public static BudgetManager setBudgetFromUserInput(Scanner scan) {
        System.out.print("Enter total income: ");
        double income = scan.nextDouble();
        scan.nextLine(); // Consume newline

        System.out.print("Enter total expenses: ");
        double expenses = scan.nextDouble();
        scan.nextLine(); // Consume newline

        return new BudgetManager(income, expenses);
    }

    // Getter for income
    public double getIncome() {
        return income;
    }

    // Setter for income
    public void setIncome(double income) {
        this.income = income;
    }

    // Getter for expenses
    public double getExpenses() {
        return expenses;
    }

    // Setter for expenses
    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    // Method to calculate balance
    public double calculateBalance() {
        return income - expenses;
    }

    // Override toString method to display budget details
    @Override
    public String toString() {
        return "Budget{" +
                "income=" + income +
                ", expenses=" + expenses +
                ", balance=" + calculateBalance() +
                '}';
    }
}
