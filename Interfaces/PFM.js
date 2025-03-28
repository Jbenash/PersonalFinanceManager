document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("addIncomeBtn").addEventListener("click", addIncome);
    document.getElementById("addExpenseBtn").addEventListener("click", addExpense);
    document.getElementById("generateReportBtn").addEventListener("click", generateReport);
});

let incomes = [];
let expenses = [];

function addIncome() {
    let source = document.getElementById("incomeSource").value;
    let amount = parseFloat(document.getElementById("incomeAmount").value);
    let date = document.getElementById("incomeDate").value;

    if (source && amount && date) {
        let income = { source, amount, date };
        incomes.push(income);
        displayIncomes();
    }
}

function addExpense() {
    let category = document.getElementById("expenseCategory").value;
    let amount = parseFloat(document.getElementById("expenseAmount").value);
    let date = document.getElementById("expenseDate").value;

    if (category && amount && date) {
        let expense = { category, amount, date };
        expenses.push(expense);
        displayExpenses();
    }
}

function displayIncomes() {
    let incomeList = document.getElementById("incomeList");
    incomeList.innerHTML = "";
    incomes.forEach(income => {
        let li = document.createElement("li");
        li.textContent = `${income.date} - ${income.source}: Rs${income.amount}`;
        incomeList.appendChild(li);
    });
}

function displayExpenses() {
    let expenseList = document.getElementById("expenseList");
    expenseList.innerHTML = "";
    expenses.forEach(expense => {
        let li = document.createElement("li");
        li.textContent = `${expense.date} - ${expense.category}: Rs${expense.amount}`;
        expenseList.appendChild(li);
    });
}

function generateReport() {
    let totalIncome = incomes.reduce((sum, income) => sum + income.amount, 0);
    let totalExpenses = expenses.reduce((sum, expense) => sum + expense.amount, 0);
    let balance = totalIncome - totalExpenses;

    document.getElementById("report").innerHTML = `
        <h3>Financial Report</h3>
        <p>Total Income: Rs${totalIncome}</p>
        <p>Total Expenses: Rs${totalExpenses}</p>
        <p>Net Balance: Rs${balance}</p>
    `;
}
