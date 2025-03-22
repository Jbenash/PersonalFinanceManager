package com.mycompany.personalfinancemanager;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {


    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void displayAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
            return;
        }

        for (Expense expense : expenses) {
            expense.displayExpense();
        }
    }
}
 

