package com.example.money_manager.Service;

import com.example.money_manager.Entity.Transaction;
import com.example.money_manager.Repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;

    public List<Transaction> findById(Long userId) {
        return transactionRepo.findByUserId(userId);
    }

    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepo.deleteById(id);
    }
}
