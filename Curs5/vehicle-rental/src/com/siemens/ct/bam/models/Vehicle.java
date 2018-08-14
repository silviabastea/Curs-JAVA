package com.siemens.ct.bam.models;

public class Vehicle {

    private String carNumber;
    private int manufacturingYear;
    private String brand;
    private String color;
    private CarType type;

    public Vehicle(String carNumber, CarType type, String brand, int manufacturingYear, String color) {
        this.carNumber = carNumber;
        this.manufacturingYear = manufacturingYear;
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car number: " + carNumber + ", type: " + type
                + ", brand: " + brand + ", manufacturing year: " + manufacturingYear
                + ", color: " + color + " .";
    }

}
