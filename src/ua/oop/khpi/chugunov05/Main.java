package ua.oop.khpi.chugunov05;

import ua.oop.khpi.chugunov05.Kontainer.IteratorMine;

public class Main {
    /**
     * An entry point of program
     *
     * @param args
     */
    public static void main(final String[] args) {
        // Container
        Kontainer kontain = new Kontainer();
        String str1;
        //Initial data of lab. 3
        str1 = Functions.initializeStr();

        System.out.println("--------Initial data of lab #3-------");
        Functions.showString(str1);
        System.out.println("\n-------------------------------------");

        String[] array  = TestHelper.SplitString(str1);
        System.out.println("\nData after work of one helper method:");
        Functions.showStringArray(array);

        kontain.aDDBack(str1);
        kontain.addElemOfArray(array);


        System.out.println("====================Container==================");
        System.out.println("Container contents:");
        kontain.showArray();
        System.out.println("\n\n\n");
        System.out.println("Using container method - to string():");
        System.out.println(kontain.arrayToStr());

        System.out.print("\nWrite with iterator: ");
        IteratorMine iterator = (Kontainer.IteratorMine) kontain.iterator();
        for (String s : kontain) {
            System.out.println(s);
        }
        iterator.next();
        iterator.remove();
        System.out.println();
        kontain.showArray();

        System.out.println("Size array: " + kontain.getSize());
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println("Clear array: ");
        kontain.clearArray();
        kontain.showArray();
    }
}