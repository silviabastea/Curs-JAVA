package com.siemens.ct.bam.exercises;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FirstExercise {

    public static List<String> allMatches(List<String> receivedList, Predicate<String> predicateChosen){

        return receivedList.stream().filter(predicateChosen).collect(Collectors.toList());
    }
}
