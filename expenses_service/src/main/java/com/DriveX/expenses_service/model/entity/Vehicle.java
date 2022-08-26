package com.DriveX.expenses_service.model.entity;

import java.time.LocalDateTime;

public class Vehicle {
    private String uuid;
    private String model;
    private String brand;
    private String typeFuel;
    private String onCityConsumption;
    private String offCityConsumption;
    private String maxFuelVolume;
    private String logoURL;
    private String currentMileage;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;

    public Vehicle() {
    }

    public String getUuid() {
        return uuid;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public String getOnCityConsumption() {
        return onCityConsumption;
    }

    public String getOffCityConsumption() {
        return offCityConsumption;
    }

    public String getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public String getCurrentMileage() {
        return currentMileage;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public void setOnCityConsumption(String onCityConsumption) {
        this.onCityConsumption = onCityConsumption;
    }

    public void setOffCityConsumption(String offCityConsumption) {
        this.offCityConsumption = offCityConsumption;
    }

    public void setMaxFuelVolume(String maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public void setCurrentMileage(String currentMileage) {
        this.currentMileage = currentMileage;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }
}
