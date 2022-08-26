package com.DriveX.expenses_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParckingExpenseDao extends JpaRepository<ParckingExpenseDao, UUID> {
}
