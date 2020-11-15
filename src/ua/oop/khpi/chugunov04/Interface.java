package ua.oop.khpi.chugunov04;
import java.util.Scanner;

public class Interface {
	private Interface() {
	}
    /** Gets values from user. */
    private static Scanner scan = new Scanner(System.in);
    private static int choice;
    static int getChoice() {
        return choice;
    }
    static void mainMenu() {
        System.out.format("%n1. Enter your values.%n");
        System.out.format("2. Print your text.%n");
        System.out.format("3. Do task.%n");
        System.out.format("4. Print the result.%n");
        System.out.format("0. Exit.%n");
        System.out.format("Enter your choice: ");
    }

    static void enterChoice() {
        choice = scan.nextInt();
        scan.nextLine();
    }

    /**
     * The Adding values to the text method
     *
     * @return the text that we have initialized
     */
    public static String AddValues(){
        System.out.println( "Enter the text:");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        return text;

    }

    /**
     * The printing our text method
     *
     * @param text - value which we have initialized
     */
    public static void printValue(String text){
        System.out.println("Your text is :"+ text);
    }
}
