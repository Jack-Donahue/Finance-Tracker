package com.example.money_manager.Repository;

import com.example.money_manager.Entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Month;
import java.util.List;

public interface BudgetRepo extends JpaRepository<Budget, Long> {
    List<Budget> findByUser_IdAndYearAndMonth(Long userId, int year, Month month);
}
