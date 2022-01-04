package com.proiect.Coffee_Shop.repository;

import com.proiect.Coffee_Shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
     User findByUsername(String username);
}
