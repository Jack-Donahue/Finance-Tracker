package com.example.money_manager.Service;

import com.example.money_manager.Entity.Budget;
import com.example.money_manager.Repository.BudgetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepo budgetRepo;

    public List<Budget> findByIdAndDate(Long userId, int year, Month month) {
        return budgetRepo.findByUser_IdAndYearAndMonth(userId, year, month);
    }

    public Budget saveBudget(Budget budget) {
        return budgetRepo.save(budget);
    }

    public void deleteBudget(Long id) {
        budgetRepo.deleteById(id);
    }
}
