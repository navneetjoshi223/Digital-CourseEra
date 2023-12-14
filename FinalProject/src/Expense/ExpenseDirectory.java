/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expense;

import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */
public class ExpenseDirectory {
    private ArrayList<Expense> expenses;

    public ExpenseDirectory() {
        this.expenses = new ArrayList<>();
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }

    public Expense addNewExpense() {
        Expense newExpense = new Expense();
        expenses.add(newExpense);
        return newExpense;
    }

   

   
}
