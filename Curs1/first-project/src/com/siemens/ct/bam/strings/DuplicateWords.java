package com.siemens.ct.bam.strings;

import java.util.*;

public class DuplicateWords {

    public static void getDuplicateWords(String stringReceived){
        Integer numberOfOccurrence;
        HashMap<String,Integer> duplicatedWords = new HashMap<String, Integer>();
        for(String word : stringReceived.split(" "))
        {
            if(!duplicatedWords.containsKey(word))
                numberOfOccurrence = 1;
            else
                numberOfOccurrence = duplicatedWords.get(word);

            numberOfOccurrence++;
            duplicatedWords.put(word,numberOfOccurrence);
        }

        for(Map.Entry<String,Integer> entry : duplicatedWords.entrySet())
        {
            if(entry.getValue() == 1)
                duplicatedWords.remove(entry.getKey());
        }
        for(Map.Entry<String,Integer> entry : duplicatedWords.entrySet())
            System.out.println("Word " + entry.getKey() + " appear for " + entry.getValue() + " times.");


    }
}
