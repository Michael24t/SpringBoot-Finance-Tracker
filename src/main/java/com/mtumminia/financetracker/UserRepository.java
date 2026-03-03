// UserRepository.java
package com.mtumminia.financetracker;

import com.mtumminia.financetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);  // Spring writes this SQL for you
    Optional<User> findByEmail(String email);
}