package com.example.money_manager.Repository;

import com.example.money_manager.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(Long userId);
}
