package com.DriveX.expenses_service.model.entity;

import org.springframework.web.bind.annotation.CookieValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "statistic",schema = "drivex_expenses")
public class StatisticExpenses {
    private UUID uuid;
    private Double totalSumExpenses;
    private Double refuelExpenses;
    private Double parkingExpenses;
    private Double washingExpenses;
    private Double repairExpenses;
    private Double rinanseExpenses;
    private Double otherExpenses;

    private LocalDateTime dtCreate;

    private LocalDateTime dtUpdate;

    public StatisticExpenses() {
    }

    @Id
    @Column(name = "uuid")
    public UUID getUuid() {
        return uuid;
    }
    @Column(name = "total_sum_expenses")
    public Double getTotalSumExpenses() {
        return totalSumExpenses;
    }

    @Column(name = "refuel_expenses")
    public Double getRefuelExpenses() {
        return refuelExpenses;
    }

    @Column(name = "parking_expeses")
    public Double getParkingExpenses() {
        return parkingExpenses;
    }

    @Column(name = "washing_expenses")
    public Double getWashingExpenses() {
        return washingExpenses;
    }

    @Column(name = "repair_expenses")
    public Double getRepairExpenses() {
        return repairExpenses;
    }

    @Column(name = "rinanse_expenses")
    public Double getRinanseExpenses() {
        return rinanseExpenses;
    }

    @Column(name = "other_expenses")
    public Double getOtherExpenses() {
        return otherExpenses;
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

    public void setTotalSumExpenses(Double totalSumExpenses) {
        this.totalSumExpenses = totalSumExpenses;
    }

    public void setRefuelExpenses(Double refuelExpenses) {
        this.refuelExpenses = refuelExpenses;
    }

    public void setParkingExpenses(Double parkingExpenses) {
        this.parkingExpenses = parkingExpenses;
    }

    public void setWashingExpenses(Double washingExpenses) {
        this.washingExpenses = washingExpenses;
    }

    public void setRepairExpenses(Double repairExpenses) {
        this.repairExpenses = repairExpenses;
    }

    public void setRinanseExpenses(Double rinanseExpenses) {
        this.rinanseExpenses = rinanseExpenses;
    }

    public void setOtherExpenses(Double otherExpenses) {
        this.otherExpenses = otherExpenses;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }
}
