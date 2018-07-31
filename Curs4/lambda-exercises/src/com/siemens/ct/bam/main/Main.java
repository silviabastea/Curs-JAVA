package com.siemens.ct.bam.main;

import com.siemens.ct.bam.exercises.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> parameters = Arrays.asList("acE", "aac", "aabbcc", "eaE");
        List<String> shortWords = FirstExercise.allMatches(parameters, s -> s.length() >= 3);
        System.out.println("Short words are: " + shortWords + " .");

        List<String> wordsWithB = FirstExercise.allMatches(parameters, s -> s.contains("b"));
        System.out.println("Words with 'b' are: " + wordsWithB + " .");

        List<String> lengthWords = FirstExercise.allMatches(parameters, s -> (s.length() % 2) == 0);
        System.out.println("Length words are: " + lengthWords + " .");

        List<String> exclamationWords = SecondExercise.transformedList(parameters, s -> s + "!");
        System.out.println("Exclamation string is: " + exclamationWords);

        List<String> eyeWords = SecondExercise.transformedList(parameters, s -> s.replace("i", "eye"));
        System.out.println("Replaced string is: " + eyeWords + " .");

        List<String> upperCaseWords = SecondExercise.transformedList(parameters, String::toUpperCase);
        System.out.println("Upper string is: " + upperCaseWords + " .");


        String exercise3 = ThirdExercise.thirdExercise(parameters);
        System.out.println("The word which pass all the conditions from exercise 3 is: " + exercise3 + " .");

        String[] exercise4 = FourthExercise.fourthdExercise(parameters);
        System.out.println("The words which pass all the conditions from exercise 3 are: " + exercise4 + " .");

        String exercise5 = FifthExercise.concatStrings(parameters);
        System.out.println("Concatenated words are: " + exercise5 + " .");
    }


}
