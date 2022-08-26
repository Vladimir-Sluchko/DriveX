package com.DriveX.expenses_service.dao;

import com.DriveX.expenses_service.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NotificationDao extends JpaRepository<Notification, UUID> {
    
}
