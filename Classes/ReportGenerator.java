package com.mycompany.personalfinancemanager;
import java.util.List;

public class ReportGenerator {

    // Method to generate a report based on income and expenses
    public static void generateReport(List<Income> incomeList, List<Expense> expenseList) {
        double totalIncome = 0;
        double totalExpenses = 0;

        // Calculate total income
        for (Income income : incomeList) {
            totalIncome += income.getAmount();
        }

        // Calculate total expenses
        for (Expense expense : expenseList) {
            totalExpenses += expense.getAmount();
        }

        // Generate and display the report
        System.out.println("Financial Report");
        System.out.println("-----------------");
        System.out.println("Total Income: Rs" + totalIncome);
        System.out.println("Total Expenses: Rs" + totalExpenses);
        System.out.println("Net Income: Rs" + (totalIncome - totalExpenses));
    }

    // Method to generate a detailed report for each category
    public static void generateDetailedReport(List<Income> incomeList, List<Expense> expenseList) {
        System.out.println("Detailed Financial Report");
        System.out.println("-------------------------");

        // Display income details
        System.out.println("Income Details:");
        for (Income income : incomeList) {
            System.out.println(income.toString());
        }

        // Display expense details
        System.out.println("Expense Details:");
        for (Expense expense : expenseList) {
            System.out.println(expense.toString());
        }
    }
}



