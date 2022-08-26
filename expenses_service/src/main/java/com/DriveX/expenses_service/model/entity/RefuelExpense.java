package com.DriveX.expenses_service.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "base_expense", schema = "drivex_expenses")
@SecondaryTable(name = "refuel_expense",pkJoinColumns = @PrimaryKeyJoinColumn(name ="uuid_refuel"), schema = "drivex_expenses")
public class RefuelExpense extends BaseExpenseModel{
    private Integer mileage;
    private Integer volume;
    private String fuelType;
    private Double costOfLitre;
    private Boolean isFuelTank;

    public RefuelExpense() {
    }

    @Column(table = "refuel_expense", name = "mileage")
    public Integer getMileage() {
        return mileage;
    }

    @Column(table = "refuel_expense", name = "volume")
    public Integer getVolume() {
        return volume;
    }

    @Column(table = "refuel_expense", name = "fuel_type")
    public String getFuelType() {
        return fuelType;
    }

    @Column(table = "refuel_expense", name = "cost_of_litre")
    public Double getCostOfLitre() {
        return costOfLitre;
    }

    @Column(table = "refuel_expense", name = "fuel_tank")
    public Boolean getFuelTank() {
        return isFuelTank;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCostOfLitre(Double costOfLitre) {
        this.costOfLitre = costOfLitre;
    }

    public void setFuelTank(Boolean fuelTank) {
        isFuelTank = fuelTank;
    }
}
