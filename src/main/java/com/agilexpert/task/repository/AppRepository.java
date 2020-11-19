package com.agilexpert.task.repository;

import com.agilexpert.task.model.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App, String> {
}
