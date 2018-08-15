package com.siemens.ct.bam.main;

import com.siemens.ct.bam.methods.rent.RentService;
import com.siemens.ct.bam.models.User;
import com.siemens.ct.bam.models.Vehicle;

import java.util.ArrayList;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        RentService rs = new RentService();
        for (Map.Entry<User, ArrayList<Vehicle>> map : rs.getHistoric().entrySet()) {
            System.out.println(map.getKey());
            for (Vehicle vehicle : map.getValue())
                System.out.println(vehicle);
        }

    }

}
