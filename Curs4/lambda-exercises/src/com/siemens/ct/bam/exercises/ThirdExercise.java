package com.siemens.ct.bam.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class ThirdExercise {

    public static String thirdExercise(List<String> listReceived){

        return listReceived.stream()
                            .map(String :: toUpperCase)
                            .filter(s -> s.length() < 4)
                            .filter(s -> s.contains("E"))
                            .findFirst()
                            .orElse(null);
    }

}
