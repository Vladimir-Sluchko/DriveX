package com.DriveX.expenses_service.service.dto;

import java.time.LocalDateTime;

public class CreateExpensesDto {
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
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private String author;

    public CreateExpensesDto(Long id, String title, String description, Integer mileage,
                             Integer volume, Double totalSum, String date, Integer icon,
                             String photoURI, Long timeForMillis, Integer month, Integer year,
                             Integer reserve1, Integer reserve2, String reserveString,
                             String reserveString2, LocalDateTime dtCreate, LocalDateTime dtUpdate, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.mileage = mileage;
        this.volume = volume;
        this.totalSum = totalSum;
        this.date = date;
        this.icon = icon;
        this.photoURI = photoURI;
        this.timeForMillis = timeForMillis;
        this.month = month;
        this.year = year;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserveString = reserveString;
        this.reserveString2 = reserveString2;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.author = author;
    }

    public CreateExpensesDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Double totalSum) {
        this.totalSum = totalSum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getPhotoURI() {
        return photoURI;
    }

    public void setPhotoURI(String photoURI) {
        this.photoURI = photoURI;
    }

    public Long getTimeForMillis() {
        return timeForMillis;
    }

    public void setTimeForMillis(Long timeForMillis) {
        this.timeForMillis = timeForMillis;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getReserve1() {
        return reserve1;
    }

    public void setReserve1(Integer reserve1) {
        this.reserve1 = reserve1;
    }

    public Integer getReserve2() {
        return reserve2;
    }

    public void setReserve2(Integer reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserveString() {
        return reserveString;
    }

    public void setReserveString(String reserveString) {
        this.reserveString = reserveString;
    }

    public String getReserveString2() {
        return reserveString2;
    }

    public void setReserveString2(String reserveString2) {
        this.reserveString2 = reserveString2;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /*
     * Билдер
     * */
    public static final class Builder {

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
        private LocalDateTime dtCreate;
        private LocalDateTime dtUpdate;
        private String author;


        public Builder() {
        }


        public Builder setId(){
            this.id = id;
            return this;
        }
        public Builder setTitle(){
            this.title = title;
            return this;
        }
        public Builder setDescription(){
            this.description = description;
            return this;
        }
        public Builder setMileage(){
            this.mileage = mileage;
            return this;
        }
        public Builder setVolume(){
            this.volume = volume;
            return this;
        }
        public Builder setTotalSum(){
            this.totalSum = totalSum;
            return this;
        }
        public Builder setDate(){
            this.date = date;
            return this;
        }
        public Builder setIcon(){
            this.icon = icon;
            return this;
        }
        public Builder setPhotoURI(){
            this.photoURI = photoURI;
            return this;
        }
        public Builder setTimeForMillis(){
            this.timeForMillis = timeForMillis;
            return this;
        }
        public Builder setMonth(){
            this.month = month;
            return this;
        }
        public Builder setYear(){
            this.year = year;
            return this;
        }
        public Builder setReserve1(){
            this.reserve1 = reserve1;
            return this;
        }
        public Builder setReserve2(){
            this.reserve2 = reserve2;
            return this;
        }
        public Builder setReserveString(){
            this.reserveString = reserveString;
            return this;
        }
        public Builder setReserveString2(){
            this.reserveString2 = reserveString2;
            return this;
        }
        public Builder setDtCreate(){
            this.dtCreate = dtCreate;
            return this;
        }
        public Builder setDtUpdate(){
            this.dtUpdate = dtUpdate;
            return this;
        }
        public Builder setAuthor(){
            this.author = author;
            return this;
        }

        public static Builder create(){
            return new Builder();
        }

        public CreateExpensesDto build(){
            return new CreateExpensesDto(id, title, description, mileage, volume, totalSum, date, icon, photoURI,
                    timeForMillis, month, year, reserve1, reserve2, reserveString, reserveString2,
                    dtCreate, dtUpdate, author);
        }
    }
}
