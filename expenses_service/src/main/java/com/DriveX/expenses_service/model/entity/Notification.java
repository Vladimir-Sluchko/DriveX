package com.DriveX.expenses_service.model.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "notification", schema = "drivex_expenses")
public class Notification {
    private UUID uuid;
    private String category;
    private String description;
    private Boolean isDone;

    public Notification() {
    }

    @Id
    @Column(name = "uuid")
    public UUID getUuid() {
        return uuid;
    }

    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @Column(name = "done")
    public Boolean getDone() {
        return isDone;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}
