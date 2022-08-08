package com.DriveX.expenses_service.dao;

import com.DriveX.expenses_service.model.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExpenses extends JpaRepository<Long,Expenses> {

}
