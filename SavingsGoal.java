package com.mycompany.personalfinancemanager;

import java.util.Scanner;

public class SavingsGoal {

    private String goalName;
    private double targetAmount;
    private double currentAmount;

    // Constructor
    public SavingsGoal(String goalName, double targetAmount, double currentAmount) {
        this.goalName = goalName;
        this.targetAmount = targetAmount;
        this.currentAmount = currentAmount;
    }

    // Method to set savings goal from user input
    public static SavingsGoal setSavingsGoalFromUserInput(Scanner scan) {
        System.out.print("Enter savings goal name: ");
        String goalName = scan.nextLine();

        System.out.print("Enter target amount: ");
        double targetAmount = scan.nextDouble();
        scan.nextLine();  // Consume the newline

        System.out.print("Enter current amount: ");
        double currentAmount = scan.nextDouble();
        scan.nextLine();  // Consume the newline

        return new SavingsGoal(goalName, targetAmount, currentAmount);
    }

    // Getter for goal name
    public String getGoalName() {
        return goalName;
    }

    // Setter for goal name
    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    // Getter for target amount
    public double getTargetAmount() {
        return targetAmount;
    }

    // Setter for target amount
    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    // Getter for current amount
    public double getCurrentAmount() {
        return currentAmount;
    }

    // Setter for current amount
    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    // Method to calculate remaining amount
    public double getRemainingAmount() {
        return targetAmount - currentAmount;
    }

    // Override toString method to display savings goal details
    @Override
    public String toString() {
        return "SavingsGoal{" +
                "goalName='" + goalName + '\'' +
                ", targetAmount=" + targetAmount +
                ", currentAmount=" + currentAmount +
                ", remainingAmount=" + getRemainingAmount() +
                '}';
    }

    // Method to display savings goal details
    public void displaySavingsGoal() {
        System.out.println(this.toString());
    }
}
