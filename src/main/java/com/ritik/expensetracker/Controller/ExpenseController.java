package com.ritik.expensetracker.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritik.expensetracker.Entity.ExpenseEntity;
import com.ritik.expensetracker.Service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
	
	private final ExpenseService expenseService;

	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@GetMapping
	public List<ExpenseEntity> findAllEmployee(){
		return expenseService.findAllEmployee();
	}
	
	@PostMapping
	public ExpenseEntity addExpense(@RequestBody ExpenseEntity expense) {
		return expenseService.addExpense(expense);
	}
	
	
	
}
