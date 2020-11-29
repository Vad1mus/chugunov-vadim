package ua.oop.khpi.chugunov05;

import  java.util.*;

public class Functions {

    static void showString(final String str) {
        System.out.print(str);
    }

    static  void showStringArray(final String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
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



    private static String reload(final String[] str2) {
        StringBuilder str1 = new StringBuilder("");
        str1 = new StringBuilder(str2[0]);
        str1.append(" ");
        for (int i = 1; i < str2.length; i++) {
            str1.append(str2[i]);
            str1.append(" ");
        }
        str1.deleteCharAt(str1.length() - 1);
        return str1.toString();
    }



}
