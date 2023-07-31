package com.ritik.expensetracker.Service;

import java.util.List;

import com.ritik.expensetracker.Entity.ExpenseEntity;

public interface ExpenseService {
	
	List<ExpenseEntity> findAllEmployee();

	ExpenseEntity addExpense(ExpenseEntity expense);

}
