package com.siemens.ct.bam.main;

public class Circle implements Comparable<Circle>{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public int compareTo(Circle o) {

        if (this.radius == o.getRadius())
            return 0;
        else
            if(this.radius < o.getRadius())
                return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + " .";
    }
}
