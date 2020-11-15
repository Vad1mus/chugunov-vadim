package ua.oop.khpi.chugunov03;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the text:");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();


        String[] words = Helper.SplitString(text);
        Helper.PrintResult(words);

    }
}

