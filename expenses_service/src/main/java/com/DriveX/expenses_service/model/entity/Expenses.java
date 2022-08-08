package com.DriveX.expenses_service.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "expenses", schema = "drivex_expenses")
public class Expenses {
    private Long id;
    private String title;
    private String description;
    private Integer mileage;
    private Integer volume;
    private Double totalSum;
    private String date;
    private Integer icon;
    private String photoURI;
    private Long timeForMillis;
    private Integer month;
    private Integer year;
    private Integer reserve1;
    private Integer reserve2;
    private String reserveString;
    private String reserveString2;



    ///добавленые поля
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private String author;


    public Expenses() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }
    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }
    @Column(name = "mileage")
    public Integer getMileage() {
        return mileage;
    }
    @Column(name = "volume")
    public Integer getVolume() {
        return volume;
    }
    @Column(name = "total_sum")
    public Double getTotalSum() {
        return totalSum;
    }
    @Column(name = "date")
    public String getDate() {
        return date;
    }
    @Column(name = "icon")
    public Integer getIcon() {
        return icon;
    }
    @Column(name = "photo_URI")
    public String getPhotoURI() {
        return photoURI;
    }
    @Column(name = "time_for_millis")
    public Long getTimeForMillis() {
        return timeForMillis;
    }
    @Column(name = "month")
    public Integer getMonth() {
        return month;
    }
    @Column(name = "year")
    public Integer getYear() {
        return year;
    }
    @Column(name = "reserve_1" )
    public Integer getReserve1() {
        return reserve1;
    }
    @Column(name = "reserve_2" )
    public Integer getReserve2() {
        return reserve1;
    }
    @Column(name = "reserve_string_1")
    public String getReserveString() {
        return reserveString;
    }
    @Column(name = "reserve_string_2")
    public String getReserveString2() {
        return reserveString2;
    }

    @Column(name = "dt_create")
    public LocalDateTime getDtCreate() {
        return dtCreate;
    }
    @Column(name = "dt_update")
    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setTotalSum(Double totalSum) {
        this.totalSum = totalSum;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public void setPhotoURI(String photoURI) {
        this.photoURI = photoURI;
    }

    public void setTimeForMillis(Long timeForMillis) {
        this.timeForMillis = timeForMillis;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setReserve1(Integer reserve1) {
        this.reserve1 = reserve1;
    }
    public void setReserve2(Integer reserve1) {
        this.reserve2 = reserve2;
    }

    public void setReserveString(String reserveString) {
        this.reserveString = reserveString;
    }

    public void setReserveString2(String reserveString2) {
        this.reserveString2 = reserveString2;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
