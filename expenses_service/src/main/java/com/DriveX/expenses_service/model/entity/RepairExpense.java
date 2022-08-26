package com.DriveX.expenses_service.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "base_expense", schema = "drivex_expenses")
@SecondaryTable(name = "repair_expense",pkJoinColumns = @PrimaryKeyJoinColumn(name ="uuid_repair"), schema = "drivex_expenses")
public class RepairExpense extends BaseExpenseModel{
    private Long longtitudeSTO;
    private Long latitudeSTO;
    private Integer mileage;
    private List<String> repairTypes = new ArrayList<>();
    private List<String > details = new ArrayList<>();
    private Double costOfWorking;
    private Double costOfDetails;

    public RepairExpense() {
    }

    @Column(table = "repair_expense", name = "logtitudes_sto")
    public Long getLongtitudeSTO() {
        return longtitudeSTO;
    }

    @Column(table = "repair_expense", name = "latitude_sto")
    public Long getLatitudeSTO() {
        return latitudeSTO;
    }

    @Column(table = "repair_expense", name = "mileage")
    public Integer getMileage() {
        return mileage;
    }

    @ElementCollection
    @CollectionTable(name = "repair_type",joinColumns = @JoinColumn(name = "uuid_type"))
    @Column(table = "repair_expense", name = "repair_type")
    public List<String> getRepairTypes() {
        return repairTypes;
    }

    @ElementCollection
    @CollectionTable(name = "details",joinColumns = @JoinColumn(name = "uuid_details"))
    @Column(table = "repair_expense", name = "details")
    public List<String> getDetails() {
        return details;
    }

    @Column(table = "repair_expense", name = "cost_of_working")
    public Double getCostOfWorking() {
        return costOfWorking;
    }

    @Column(table = "repair_expense", name = "cost_of_details")
    public Double getCostOfDetails() {
        return costOfDetails;
    }

    public void setLongtitudeSTO(Long longtitudeSTO) {
        this.longtitudeSTO = longtitudeSTO;
    }

    public void setLatitudeSTO(Long latitudeSTO) {
        this.latitudeSTO = latitudeSTO;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setRepairTypes(List<String> repairTypes) {
        this.repairTypes = repairTypes;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public void setCostOfWorking(Double costOfWorking) {
        this.costOfWorking = costOfWorking;
    }

    public void setCostOfDetails(Double costOfDetails) {
        this.costOfDetails = costOfDetails;
    }
}
