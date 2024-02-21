package com.example.bus_project.repositary;

import com.example.bus_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
     User findByEmailAndPassword(String email, String password);
}