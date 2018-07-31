package com.siemens.ct.bam.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class FourthExercise {

    public static String[] fourthdExercise(List<String> listReceived){

        return listReceived.stream()
                .map(String :: toUpperCase)
                .filter(s -> s.length() < 4)
                .filter(s -> s.contains("E"))
                .toArray(String[]::new);
    }
}
