package com.siemens.ct.bam.main;


import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Circle> circles = new TreeSet<>();
        Random random = new Random();
        Double radius = 10.0;
        Double circleArea;
        int maxValue = 10;
        int minValue = 1;


        while(radius > 2) {
            radius = random.nextDouble() * ((maxValue - minValue) + minValue);
            Circle circle = new Circle(radius);
            circles.add(circle);
        }

        for(Circle circlesFromSet : circles) {

            circleArea = circlesFromSet.area();

            System.out.println(circlesFromSet);
            System.out.println("Circle area : " + circleArea);
        }

    }
}
