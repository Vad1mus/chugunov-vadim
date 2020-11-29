package ua.oop.khpi.chugunov06;

import ua.oop.khpi.chugunov03.Helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    /**
     * An entry point of program
     * @param args
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Kontainer kontain = new Kontainer();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int choose;
        int choose2;
        String str1;
        String str2;
        int temp = 0;

        while (loop) {
            Functions.chooseMenu();
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    str1 = Functions.initializeStr();
                    kontain.aDDBack(str1);
                    break;
                case 2:
                    System.out.println("Your container:");
                    kontain.showArray();
                    break;
                case 3:
                    System.out.println("\nSorting alphabetically:");
                    temp = kontain.getSize();
                    System.out.println("Enter number from 1 to " + temp);
                    choose2 = scan.nextInt();
                    kontain.alphabeticalSorting(choose2 - 1);
                    break;
                case 4:
                    kontain.clearArray();
                    System.out.println("Clear container successfully!");
                    break;
                case 5:
                    System.out.println("Container to String: ");
                    System.out.println(kontain.arrayToStr());
                    break;
                case 6:
                    str2 = Functions.initializeStr();
                    if (kontain.remove(str2)) {
                        System.out.println("Successfully");
                        break;
                    } else {
                        System.out.println("This string is absent");
                        break;
                    }
                case 7:
                    str2 = Functions.initializeStr();
                    if (kontain.contains(str2)) {
                        System.out.println("This string contains in container");
                        break;
                    } else {
                        System.out.println("This string is absent");
                        break;
                    }
                case 8:

                    break;
                case 9:
                    String myTaskString = kontain.arrayToStr();
                    String [] array = Helper.SplitString(myTaskString);
                    Helper.PrintResult(array);
                    System.out.println();
                    break;

                case 10:
                    str2 = Functions.initializeStr();
                    int temper = kontain.search(str2);
                    if (temper == 0) {
                        System.out.println("This element is not abs");
                        break;
                    } else {
                        System.out.print("This elements contains in index: " + (temper - 1));
                        break;
                    }
                case 11:
                    if(kontain.compression()) {
                        System.out.println("Elements are equal");
                        break;
                    } else {
                        System.out.println("Elements are not equal");
                        break;
                    }
                case 12:
                    System.out.println("Saving to file");
                    FileOutputStream file = new FileOutputStream("tempFile.txt");
                    ObjectOutputStream object = new ObjectOutputStream(file);
                    object.writeObject(kontain);
                    object.close();
                    System.out.println("Successfully");
                    break;
                case 13:
                    System.out.println("Read from file");
                    FileInputStream fileInput = new FileInputStream("tempFile.txt");
                    ObjectInputStream objectInput = new ObjectInputStream(fileInput);
                    kontain = (Kontainer) objectInput.readObject();
                    objectInput.close();
                    System.out.println("Successfully");
                    break;
                case 14:
                    System.out.println("\n\nThanks for working!");
                    loop = false;
                    break;
                default:
                    System.out.println("Error. Mistake number!");
                    break;
            }
        }
    }


    }




