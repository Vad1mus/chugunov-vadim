package ua.oop.khpi.chugunov04;

public class ArgumentTaker {
    /** Checking an arguments of command line
     * for is debug mode on or no */
    private String[] arguments;

    private static boolean debug = false;

    static boolean isDebug() {
        return debug;
    }

    ArgumentTaker(final String[] args) {
        this.arguments = args;
    }

    boolean empty() {
        return arguments.length == 0;
    }

    void execute() {
        for (String i : arguments) {
            switch (i) {
                case "-h":
                    System.out.println("\nAuthor: Chugunov Vadim, KIT-119a");
                    System.out.println("Task: Enter text. "
                            + "Insert your text "
                            + "after the program starts searching."
                            + "\nOutput the initial text and result of your task.");
                    System.out.println("-h (-help) : Print info about "
                            + "the task and console commands.");
                    System.out.println("-d (-debug) : "
                            + "Displays additional data values of some variables.");
                    break;
                case "-help":
                    System.out.println("\nAuthor: "
                            + "Chugunov Vadim, KIT-119a");
                    System.out.println("Task: Enter text. "
                            + "Insert your text "
                            + "after the program starts searching. "
                            + "Output the initial text and result of your task.");
                    System.out.println("-h (-help) : Print info about "
                            + "the task and console commands.");
                    System.out.println("-d (-debug) : "
                            + "Displays additional data values of some variables.");
                    break;
                case "-d":
                    debug = true;
                    break;
                case "-debug":
                    debug = true;
                    break;
                default:
                    System.out.format("%n Incorrect command %s.%n", i);
                    System.out.println("-h, -help, -d, -debug "
                            + "is only allowed.");
            }
        }
    }
}
