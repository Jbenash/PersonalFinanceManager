package com.mycompany.personalfinancemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize lists to store income and expenses
        List<Income> incomeList = new ArrayList<>();
        List<Expense> expenseList = new ArrayList<>();

        // User authentication
        UserAuthentication auth = new UserAuthentication();
        if (authenticateUser(auth)) {
            // Main menu loop
            boolean running = true;
            while (running) {
                System.out.println("\nPersonal Finance Manager");
                System.out.println("1. Add Income");
                System.out.println("2. Add Expense");
                System.out.println("3. Set Budget");
                System.out.println("4. Set Savings Goal");
                System.out.println("5. Generate Report");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");

                int choice = scan.nextInt();
                scan.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        Income income = Income.createIncomeFromUserInput(scan);
                        incomeList.add(income);
                        break;
                    case 2:
                        Expense expense = Expense.createExpenseFromUserInput(scan);
                        expenseList.add(expense);
                        break;
                    case 3:
                        BudgetManager.setBudgetFromUserInput(scan);
                        break;
                    case 4:
                        SavingsGoal.setSavingsGoalFromUserInput(scan);
                        break;
                    case 5:
                        ReportGenerator.generateReport(incomeList, expenseList);
                        ReportGenerator.generateDetailedReport(incomeList, expenseList);
                        break;
                    case 6:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Authentication failed. Exiting...");
        }
    }

    private static boolean authenticateUser(UserAuthentication auth) {
        return auth.login();
    }
}
