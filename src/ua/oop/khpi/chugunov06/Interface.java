package ua.oop.khpi.chugunov06;
import java.util.Scanner;

public class Interface {
    static int choice;
    private static Scanner scan = new Scanner(System.in);

    static void mainMenu() {
        System.out.format("%n1. Enter values.%n");
        System.out.format("2. Print values.%n");
        System.out.format("3. Task completion.%n");
        System.out.format("4. Print result.%n");
        System.out.format("0. Exit.%n");
        System.out.format("Enter your choose: ");
    }

    static void getChoice() {
        choice = scan.nextInt();
        scan.nextLine();
    }

    static String getText() {
        System.out.format("%nEnter text: ");
        return scan.nextLine();
    }





}
