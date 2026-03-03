package com.mtumminia.financetracker.service;

import com.mtumminia.financetracker.TransactionRepository;
import com.mtumminia.financetracker.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getTransactionsForUser(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    public Transaction addTransaction(Transaction t) {
        return transactionRepository.save(t);
    }
}