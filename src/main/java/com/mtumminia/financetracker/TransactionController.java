package com.mtumminia.financetracker;

import com.mtumminia.financetracker.model.Transaction;
import com.mtumminia.financetracker.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{userId}")
    public List<Transaction> getTransactions(@PathVariable Long userId) {
        return transactionService.getTransactionsForUser(userId);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction t) {
        return transactionService.addTransaction(t);
    }
}