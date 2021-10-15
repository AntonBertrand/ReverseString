package com.example.mypackage;

import java.util.Arrays;

//Write a function that reverses a string. The input string is given as an array of characters s.

public class Main {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    // Solution not allocating extra space for another array.
    public static void reverseString(char[] s) {

        int j = s.length-1;

        for (int i = 0; i < (s.length/2) ;i++) {
            char c = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = c;
        }
        System.out.println(Arrays.toString(s));
    }

    // Solution allocating extra space for another array

    /*public static char[] reverseString(char[] s) {
        int length = s.length;

        char[] reversedArr = new char[length];

        int counter = 0;

        for (int i = length-1; i > 0 ; i--) {
            reversedArr[counter] = s[i];
            counter++;
        }

        return reversedArr;
    }*/
}