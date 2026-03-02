package com.mtumminia.financetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<model.Transaction> getTransactionsForUser(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    public model.Transaction addTransaction(model.Transaction t) {
        return transactionRepository.save(t);
    }
}

