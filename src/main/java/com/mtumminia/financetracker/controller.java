package com.mtumminia.financetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class controller {
    @Autowired
    private service transactionService;

    @GetMapping("/{userId}")
    public List<model.Transaction> getTransactions(@PathVariable Long userId) {
        return transactionService.getTransactionsForUser(userId);
    }

    @PostMapping
    public model.Transaction createTransaction(@RequestBody model.Transaction t) {
        return transactionService.addTransaction(t);
    }
}
