package com.agilexpert.task.repository;

import com.agilexpert.task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
