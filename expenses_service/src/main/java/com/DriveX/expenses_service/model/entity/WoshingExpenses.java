package com.DriveX.expenses_service.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "base_expense", schema = "drivex_expenses")
@SecondaryTable(name = "washing_expense",pkJoinColumns = @PrimaryKeyJoinColumn(name ="uuid_washing"), schema = "drivex_expenses")
public class WoshingExpenses extends BaseExpenseModel{
    private Long longtitudeWashing;
    private Long latitudeWashinge;
    private String mapScreenPlaceURL;

    public WoshingExpenses() {
    }

    @Column(table = "washing_expense", name = "longtitude_washing")
    public Long getLongtitudeWashing() {
        return longtitudeWashing;
    }

    @Column(table = "washing_expense", name = "latitude_washing")
    public Long getLatitudeWashinge() {
        return latitudeWashinge;
    }

    @Column(table = "washing_expense", name = "screen_place_url")
    public String getMapScreenPlaceURL() {
        return mapScreenPlaceURL;
    }

    public void setLongtitudeWashing(Long longtitudeWashing) {
        this.longtitudeWashing = longtitudeWashing;
    }

    public void setLatitudeWashinge(Long latitudeWashinge) {
        this.latitudeWashinge = latitudeWashinge;
    }

    public void setMapScreenPlaceURL(String mapScreenPlaceURL) {
        this.mapScreenPlaceURL = mapScreenPlaceURL;
    }
}
