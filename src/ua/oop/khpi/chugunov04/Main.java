package ua.oop.khpi.chugunov04;

public class Main {

		/**
		 * An entry point - main method.
		 * @param args - arguments of main method
		 */
		public static void main(final String[] args) {

			final int exit = 0;
			final int setValues = 1;
			final int getValues = 2;
			final int exec = 3;
			final int printResult = 4;
			String text = null;

			ArgumentTaker argTaker = new ArgumentTaker(args);
			if (!argTaker.empty()) {
				argTaker.execute();

			}

			if (ArgumentTaker.isDebug()) {
				System.out.println("\n~~~~~~~~~~YOU ARE IN DEBUG MODE~~~~~~~~~~");
				System.out.println("\n~The debug mode will help you learning code easier~");
				System.out.format("\n==> Debugging...<==");
			}
			/**
			 * Interface menu to dialog with user
			 */
			do {
				Interface.mainMenu();
				Interface.enterChoice();
				switch (Interface.getChoice()) {
					case exit:
						if (ArgumentTaker.isDebug()) {
							System.out.println("\nYour choice is (0). Exiting...");
							System.out.format("\n==> Debugging...<==");
							System.out.println("\n~~~~~~~~~~DEBUG MODE OFF~~~~~~~~~~");
							
						}
						break;
					case setValues:
						if (ArgumentTaker.isDebug()) {
							System.out.format("\n==> Debugging...<==");
							System.out.println("\nYour choice is (1). Setting values...");
						}
						text = Interface.AddValues();
						break;
					case getValues:
						if (ArgumentTaker.isDebug()) {
							System.out.format("\n==> Debugging...<==");
							System.out.println("\nYour choice is (2). Getting values...");
						}
						if (text != null ) {
							Interface.printValue(text);

						} else {
							System.out.format("%nFirst you need to add values.");
						}
						break;
					case exec:
						if (ArgumentTaker.isDebug()) {
							System.out.format("\n==> Debugging...<==");
							System.out.println("\nYour choice is (3). Executing task...");
						}
						if (text != null) {
							final String[] arr1 = HelpMethods.SplitString(text);

								System.out.println("\nLoading...");
								System.out.println("\nTask completed...");

							if (ArgumentTaker.isDebug()) {
								System.out.format("\n==> Debugging...<==");
							}

						} else {
							System.out.format("%nFirst you need to add values.");
						}
						break;
					case printResult:
						if (ArgumentTaker.isDebug()) {
							System.out.format("\n==> Debugging...<==");
							System.out.format("%nYour choice is (4). " + "Printing out result...%n");
						}
						if (text != null) {
							final String [] arr2 = HelpMethods.SplitString(text);
							HelpMethods.PrintResult(arr2);
							if (ArgumentTaker.isDebug()) {
								System.out.format("\n==> Debugging...<==");
							}

						} else {
							System.out.format("%nERROR!Please, enter your values!.");
							if (ArgumentTaker.isDebug()) {
								System.out.format("\nA text hasn't our value (text = null)");
								System.out.format("\n==> Debugging...<==");
							}
						}
						break;
					default:
						System.out.println("\nERROR!ENTER A CORRECT VALUE!.");
				}
			} while (Interface.getChoice() != 0);
		}
	}