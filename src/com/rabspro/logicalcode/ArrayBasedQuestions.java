package com.rabspro.logicalcode;

public class ArrayBasedQuestions {
    public static void main(String[] args) {
        String input = "pratik";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }


   //Method 1: Using a Loop
    static String reverseString(String strToReverse){
         if (strToReverse == null || strToReverse.isEmpty()) {
                    return strToReverse;
         }
        StringBuilder reversed = new StringBuilder();
        for (int i = strToReverse.length() - 1; i >= 0; i--) {
            reversed.append(strToReverse.charAt(i));
        }
        return reversed.toString();
    }/*
    // Method 2: Using StringBuilder
    static String reverseString(String strToReverse){
        if (strToReverse == null || strToReverse.isEmpty()) {
             return strToReverse;
         }
        return new StringBuilder(strToReverse).reverse().toString();
    }/*
     // Method 3: Using Recursion

    static String reverseString(String strToReverse){
        // Base case: if the string is null or empty, return the string as is
        if (strToReverse == null || strToReverse.length() <= 1) {
            return strToReverse;
        }
        return reverseString(strToReverse.substring(1)) + strToReverse.charAt(0);
    }


    /*
    //Method 4: Using a Character Array
    static String reverseString(String strToReverse){
         if (strToReverse == null || strToReverse.isEmpty()) {
             return strToReverse;
         }
        int left=0;
        int right=strToReverse.length()-1;
        char[] charArray=strToReverse.toCharArray();

        while(left < right){
            char temp = charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
    */
}
