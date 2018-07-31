package com.siemens.ct.bam.exercises;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondExercise {

    public static List<String> transformedList(List<String> arrayReceived, Function<String,String> functionApplied){
        return arrayReceived.stream()
                            .map(functionApplied)
                            .collect(Collectors.toList());
    }


}
