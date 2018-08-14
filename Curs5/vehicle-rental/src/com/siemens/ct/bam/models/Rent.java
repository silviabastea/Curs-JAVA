package com.siemens.ct.bam.models;

public class Rent {

    private String startDate;
    private String endDate;
    private long numberOfKilometers;
    private String personalCode;
    private String carNumber;

    public Rent() {
    }

    public Rent(String startDate, String endDate, long numberOfKilometers, String personalCode, String carNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfKilometers = numberOfKilometers;
        this.personalCode = personalCode;
        this.carNumber = carNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public long getNumberOfKilometers() {
        return numberOfKilometers;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setNumberOfKilometers(long numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
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
