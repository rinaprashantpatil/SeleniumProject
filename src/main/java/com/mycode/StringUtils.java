package com.mycode;

public class StringUtils {

    // Jayesh
    // hseyaj
    public static String reverseString(String input) {
        if(input == null) {
            return "";
        }
        StringBuffer temp = new StringBuffer();
        for (int i = input.length()-1; i >=0 ; i--) {
            temp.append(input.charAt(i));
        }
        return temp.toString();
    }
}
