package com.example.money_manager.Controller;

import com.example.money_manager.Entity.Budget;
import com.example.money_manager.Service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @GetMapping("/user/{userId}/{year}/{month}")
    public List<Budget> getBudgetsByUserIdAndYearAndMonth(
            @PathVariable Long userId, @PathVariable int year, @PathVariable Month month) {
        return budgetService.findByIdAndDate(userId, year, month);
    }

    @PostMapping
    public Budget saveBudget(@RequestBody Budget budget) {
        return budgetService.saveBudget(budget);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
    }
}
