package com.mtumminia.financetracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<model.Transaction, Long> {
    List<model.Transaction> findByUserId(Long userId);
}
