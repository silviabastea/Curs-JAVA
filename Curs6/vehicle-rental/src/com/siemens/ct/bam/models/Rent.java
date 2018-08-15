package com.siemens.ct.bam.models;

public class Rent {

    private String startDate;
    private String endDate;
    private int numberOfKilometers;
    private String personalCode;
    private String carNumber;

    public Rent() {
    }

    public Rent(String startDate, String endDate, int numberOfKilometers, String personalCode, String carNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfKilometers = numberOfKilometers;
        this.personalCode = personalCode;
        this.carNumber = carNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfKilometers() {
        return numberOfKilometers;
    }

    public void setNumberOfKilometers(int numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
/*
    @Override
    public String toString() {
        return "Start date: " + startDate + ", end date: " + endDate + ", Number of kilometers: " +
                numberOfKilometers + ", personal code: " + personalCode + ", car number: " + carNumber + " .";
    }
    */

    @Override
    public String toString() {
        return startDate + ", " + endDate + ", " + numberOfKilometers + ", " + personalCode + ", " + carNumber;
    }
}
