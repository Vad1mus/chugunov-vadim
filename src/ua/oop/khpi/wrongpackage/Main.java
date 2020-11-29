package ua.oop.khpi.wrongpackage;

import ua.oop.khpi.wrongpackage.TaskContainer.TaskIterator;

public class Main {
	
    /**
     * The main method.
     * 
     * @param args - arguments of main method
     */
    public static void main(final String[] args) {
        // Container
    	TaskContainer TestContainer1 = new TaskContainer();
    	String word2 = "Task to count";
        String word1 =  "Task to count words";
        
       //Arrays of our splitting strings
        String[] array = TestHelper.SplitString(word1); // split method
        String[] array2 = TestHelper.SplitString(word2);
        
        // Our Values to ADD ("Task to count words")
    	TestContainer1.addElemOfArray(array);
        
        // Create OUR Iterator
        TaskIterator iter = TestContainer1.iterator();
        System.out.println("\n================================================");
        
        // For Each loop printing values
        System.out.print("For each loop:\t\t   ");
        for (String s : TestContainer1) {
            System.out.print(s + " ");
        }
        System.out.println("|");
        System.out.println();
        
        System.out.print("While loop:\t\t\t   ");
        // While loop printing values
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println("|");
        System.out.println();
        
        //  toString() method
        System.out.println("Method toString():\t   " + TestContainer1.toString()+"|");
        
        // The second container
        TaskContainer TestContainer2 = new TaskContainer();
        // Adding values to container ("count words")
        TestContainer2.addElemOfArray(array2);                     
       
        System.out.println("\n================================================");
        System.out.println("The Method that returns bollean (TRUE/FALSE):");

        // ContainsAll() method
        System.out.println("Answer is "+TestContainer1.containsAll(TestContainer2));
        // Contains() method
        System.out.println("Answer is "+TestContainer2.contains("count"));
        TestContainer2.add("words");
        System.out.println("Answer is "+TestContainer1.containsAll(TestContainer2));
        // Remove() methods
        TestContainer2.remove("words");
        
        
        System.out.println("\n================================================");
       
        // Second iterator
        TaskIterator iter2 = TestContainer2.iterator();
        //  Iterator's methods
        for (String s : TestContainer2) {
            System.out.print(s + ' ');
        }
        System.out.println();
        if (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        iter2.remove();
        for (String s : TestContainer2) {
            System.out.print(s + ' ');
        }
        System.out.println();
        if (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        iter2.remove();
        for (String s : TestContainer2) {
            System.out.print(s + ' ');
        }
        if(iter2.hasNext()) {
        	System.out.print("\nYEAH!!!Have next!");
        } else {
        	System.out.print("\nNOPE!!!Haven't next!");
        }
        System.out.println("\n================================================");
       
    }

}
