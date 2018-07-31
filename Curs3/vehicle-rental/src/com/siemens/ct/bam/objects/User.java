package com.siemens.ct.bam.objects;

public class User {

    private String personalCode;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private int emittedYearOfDrivingLicense;

    public User() {
    }

    public User(String personalCode, String firstName, String lastName, String dateOfBirth, String gender, int emitedYearOfDrivingLicense) {
        this.personalCode = personalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.emittedYearOfDrivingLicense = emitedYearOfDrivingLicense;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getEmittedYearOfDrivingLicense() {
        return emittedYearOfDrivingLicense;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmittedYearOfDrivingLicense(int emittedYearOfDrivingLicense) {
        this.emittedYearOfDrivingLicense = emittedYearOfDrivingLicense;
    }
}
