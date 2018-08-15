package com.siemens.ct.bam.models;

public class User {

    private String personalCode;
    private String firstName;
    private String lastName;
    private String gender;
    private int emittedYearOfDrivingLicense;

    public User() {
    }

    public User(String personalCode, String firstName, String lastName, String gender, int emittedYearOfDrivingLicense) {
        this.personalCode = personalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.emittedYearOfDrivingLicense = emittedYearOfDrivingLicense;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmittedYearOfDrivingLicense() {
        return emittedYearOfDrivingLicense;
    }

    public void setEmittedYearOfDrivingLicense(int emittedYearOfDrivingLicense) {
        this.emittedYearOfDrivingLicense = emittedYearOfDrivingLicense;
    }

    @Override
    public String toString() {
        return "Personal code: " + personalCode + ",first name: " + firstName +
                ", last name: " + lastName +
                ", gender: " + gender + ", emitted year of driving license: " +
                emittedYearOfDrivingLicense + " .";
    }
}
