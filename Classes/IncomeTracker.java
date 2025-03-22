package com.mycompany.personalfinancemanager;
import java.util.ArrayList;
import java.util.List;

public class IncomeTracker {



    private List<Income> incomes = new ArrayList<>();

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public void displayAllIncomes() {
        if (incomes.isEmpty()) {
            System.out.println("No incomes to display.");
            return;
        }

        for (Income income : incomes) {
            income.displayIncome();
        }
    }
}


