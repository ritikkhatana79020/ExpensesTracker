package com.ritik.expensetracker.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ritik.expensetracker.Entity.ExpenseEntity;
import com.ritik.expensetracker.Repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	private final ExpenseRepository expenseRepo;
	
	public ExpenseServiceImpl(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}

	@Override
	public List<ExpenseEntity> findAllEmployee() {
		// TODO Auto-generated method stub
		return expenseRepo.findAll();
	}

	@Override
	public ExpenseEntity addExpense(ExpenseEntity expense) {
		// TODO Auto-generated method stub
		return expenseRepo.save(expense);
	}


}
