package com.DriveX.expenses_service.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "vahicle",schema = "drivex_expenses")
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

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    @Column(name = "model")
    public String getModel() {
        return model;
    }

    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    @Column(name = "type_fuel")
    public String getTypeFuel() {
        return typeFuel;
    }

    @Column(name = "on_city_consumption")
    public String getOnCityConsumption() {
        return onCityConsumption;
    }

    @Column(name = "off_city_consumption")
    public String getOffCityConsumption() {
        return offCityConsumption;
    }

    @Column(name = "max_fuel_volume")
    public String getMaxFuelVolume() {
        return maxFuelVolume;
    }

    @Column(name = "logo_url")
    public String getLogoURL() {
        return logoURL;
    }

    @Column(name = "current_mileage")
    public String getCurrentMileage() {
        return currentMileage;
    }

    @Column(name = "dt_creat")
    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    @Column(name = "dt_update")
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
