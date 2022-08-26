package com.DriveX.expenses_service.dao;

import com.DriveX.expenses_service.model.entity.StatisticExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StatisticExpenseDao extends JpaRepository<StatisticExpenses, UUID> {
}
