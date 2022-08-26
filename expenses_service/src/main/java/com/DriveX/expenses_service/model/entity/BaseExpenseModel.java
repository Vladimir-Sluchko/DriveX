package com.DriveX.expenses_service.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public class BaseExpenseModel {
    private UUID uuid;
    private String category;
    private String description;
    private String totalSum;
    private String photoURL;
    private String baseTimeModel;
    private Long timeForMillis;
    private String date;
    private Integer month;
    private Integer year;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;

    public BaseExpenseModel() {
    }
    @Id
    @Column(name = "UUID")
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

    @Column(name = "total_sum")
    public String getTotalSum() {
        return totalSum;
    }

    @Column(name = "photo_url")
    public String getPhotoURL() {
        return photoURL;
    }

    @Column(name = "base_time_model")
    public String getBaseTimeModel() {
        return baseTimeModel;
    }

    @Column(name = "time_for_millis")
    public Long getTimeForMillis() {
        return timeForMillis;
    }

    @Column(name = "date")
    public String getDate() {
        return date;
    }

    @Column(name = "month")
    public Integer getMonth() {
        return month;
    }

    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    @Column(name = "dt_create")
    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    @Column(name = "dt_update")
    public LocalDateTime getDtUpdate() {
        return dtUpdate;
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

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public void setBaseTimeModel(String baseTimeModel) {
        this.baseTimeModel = baseTimeModel;
    }

    public void setTimeForMillis(Long timeForMillis) {
        this.timeForMillis = timeForMillis;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }
}
