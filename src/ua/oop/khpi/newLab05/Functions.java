package ua.oop.khpi.newLab05;

import java.io.*;
import  java.util.*;

public class Functions {

    public static void chooseMenu() {
        System.out.println("\n\nChoose the right variant:");
        System.out.println("1. Create string");
        System.out.println("2. Show string");
        System.out.println("3. Sorting alphabetically");
        System.out.println("4. Sort by length");
        System.out.println("5. Delete string");
        System.out.println("0. The End");
        System.out.print("Write:");
    }


    static void showString(final String str) {
        System.out.print(str);
    }

    private static String[] differentWords(final String str) {
        int w = 0;
        int begin = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        String[] wordArr = new String[++count];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordArr[w] = str.substring(begin, i);
                w++;
                begin = i + 1;
            }
        }
        wordArr[w] = str.substring(begin, str.length());
        return wordArr;
    }


    public static String initializeStr() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1;
        str1 = scan.nextLine();
        return str1;
    }




}
