package com.DriveX.expenses_service.dao;

import com.DriveX.expenses_service.model.entity.RefuelExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RefuelExpenseDao extends JpaRepository<RefuelExpense, UUID> {
}
