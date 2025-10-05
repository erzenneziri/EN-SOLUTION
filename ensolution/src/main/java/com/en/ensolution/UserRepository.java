package com.en.ensolution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods later if needed, e.g.:
    // Optional<User> findByEmail(String email);
}
