package com.DriveX.expenses_service.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "base_expense", schema = "drivex_expenses")
@SecondaryTable(name = "parking_expense",pkJoinColumns = @PrimaryKeyJoinColumn(name ="uuid_parking"), schema = "drivex_expenses")
public class ParkingExpense extends BaseExpenseModel{
   private Long longtitudeParkingPlace;
   private Long latitudeParkingPlace;
   private String timeParkingPeriod;
   private String mapScreenPlaceURL;

   public ParkingExpense() {
   }

   @Column(table = "parking_expense", name = "longtitude_parking_place")
   public Long getLongtitudeParkingPlace() {
      return longtitudeParkingPlace;
   }

   @Column(table = "parking_expense", name = "latitude_parking_place")
   public Long getLatitudeParkingPlace() {
      return latitudeParkingPlace;
   }

   @Column(table = "parking_expense", name = "time_parking_period")
   public String getTimeParkingPeriod() {
      return timeParkingPeriod;
   }
   @Column(table = "parking_expense", name = "map_screen_place_url")
   public String getMapScreenPlaceURL() {
      return mapScreenPlaceURL;
   }

   public void setLongtitudeParkingPlace(Long longtitudeParkingPlace) {
      this.longtitudeParkingPlace = longtitudeParkingPlace;
   }

   public void setLatitudeParkingPlace(Long latitudeParkingPlace) {
      this.latitudeParkingPlace = latitudeParkingPlace;
   }

   public void setTimeParkingPeriod(String timeParkingPeriod) {
      this.timeParkingPeriod = timeParkingPeriod;
   }

   public void setMapScreenPlaceURL(String mapScreenPlaceURL) {
      this.mapScreenPlaceURL = mapScreenPlaceURL;
   }
}
