package com.awe.kz.data.repository;

import com.awe.kz.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
}
