package com.siemens.ct.bam.strings;

public class RotateString {

    public static boolean isRotateString(String receivedString)
    {
        String  rotatedString = "";

        for (int index = receivedString.length() - 1 ; index >= 0; index--)
        {
            rotatedString = rotatedString + receivedString.charAt(index);
        }
        if (rotatedString.equals(receivedString))
            return true;
        return false;
    }
}
