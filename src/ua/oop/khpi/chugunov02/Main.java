package ua.oop.khpi.chugunov02;

import java.util.Random;

public class Main {
	
	/**
     * An entry point - main method.
     *
     * @param args - arguments of main method
     */
	public static void main(String[] args)
	{
			Random rand = new Random();
	       
	        final int numOfIters = 10;
	        
	        System.out.println("------------------------------------");
	        System.out.println("|Number\t\t |"+"\t"+"Is Natural |");
	        System.out.println("------------------------------------");
	        for (int i = 0; i < numOfIters; i++)
	        { 
	        	int chislo = rand.nextInt(100);
	        	IsSimple(chislo);
	        	
	        
	        	printIsItNaturalNumber(IsSimple(chislo),chislo);
	        }   
	        System.out.println("------------------------------------");
	}
	
	/**
	 * The method that checking our number for a Prime number
	 * 
	 * @param value - number that we will check for Simple or Not
	 * @return -  is number simple (true or false)
	 */
	
	 public static boolean IsSimple(int value)  
	    {
		 if(value==1)
		 {
			 return false;
		 }
			  
	        for (int i = 2; i < value; i++)  
	        {
	            if (value % i == 0)  
	            {
	                return false;  
	            }
	        }
	        return true;  
	    }
	
	
	/**
	 * A print of number and check it for simplicity method
	 * 
	 * @param natural - (boolean) number is simple or not
	 * @param n       - number that we checked and printing
	 */
	private static void printIsItNaturalNumber(boolean natural, int n) {
		
	    if (natural) {
	        System.out.println("|"+n+"\t\t |" +"\t"+ "True  \t   "+"|");
	    } else {
	        System.out.println("|"+n+"\t\t |" +"\t"+ "False\t   "+"|");
	    }
	}

}
