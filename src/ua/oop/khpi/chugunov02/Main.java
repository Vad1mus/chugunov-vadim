package ua.oop.khpi.chugunov02;


import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	/**
	 * An entry point - main method.
	 *
	 * @param args - arguments of main method
	 */
	public static void main(String[] args) {
		Random rand = new Random();

		ArrayList<Integer> minNums = new ArrayList<Integer>();
		System.out.print("\n-----------------------------------------");
		System.out.print("\nInput number\t\tIndex of min numbers|");
		System.out.print("\n-----------------------------------------");
		final int numOfIters = 10;
		for (int i = 0; i < numOfIters; i++) {
			int number = rand.nextInt(100);
			findMinNums(number, minNums);
			printInfo(number, minNums);
			minNums.clear();
		}

	}

	/**
	 * Finds min digits of a number.
	 *
	 * @param num   - number for search of min digits
	 * @param array - an array of min digits
	 */

	private static void findMinNums(final int num, final ArrayList<Integer> array) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int number = num;
		final int constant = 10;
		while (number > 0) {
			arr.add(0, number % constant);
			number /= constant;
		}
		int min = Collections.min(arr);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == min) {
				array.add(i);
			}
		}
	}


	/**
	 * Prints array of min digits.
	 *
	 * @param num   - a source number
	 * @param array - an array of min digits
	 */


	private  static void printInfo(final int num, final ArrayList<Integer> array) {

		System.out.print("\n" + num);
		System.out.print("\t\t\t\t\t\t");
		for (int i : array) {
			System.out.format("%d ", i);

		}
		System.out.print("\t\t\t\t|");
		System.out.print("\n-----------------------------------------");
	}
}