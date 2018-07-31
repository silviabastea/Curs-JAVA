package com.siemens.ct.bam.exercises;

import java.util.List;

public class FifthExercise {

   public static String concatStrings(List<String> receivedList)
   {
       return receivedList.stream().reduce("",(a,b) -> a + b);
   }
}
