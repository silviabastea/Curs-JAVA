package com.siemens.ct.bam.strings;

public class WordsNumber {

    public static int getWordsNumber(String stringReceived)
    {
        int numberOfWords = 0;
        for(String word : stringReceived.split(" "))
            numberOfWords++;

        return numberOfWords;
    }
}
