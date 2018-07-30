package com.siemens.ct.bam.structures;
enum DaysOfWeek{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
   private DaysOfWeek() {
        System.out.println("new DaysOfWeek created.");
    }
    }


public class TestEnums {
    public static void main(String[] args) {
        //DaysOfWeek dos = new DaysOfWeek();

        DaysOfWeek[] days = DaysOfWeek.values();
        for (int i = 0; i < days.length; i++)
        {
            System.out.println(days[i]);
        }
    }

}
