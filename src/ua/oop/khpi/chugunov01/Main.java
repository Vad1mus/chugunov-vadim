package ua.oop.khpi.chugunov01;

public class Main {
	 /**
     * An entry point - main method.
     *
     * @param args - arguments of main method
     */

			public static void main(String[] args) {

		        final short  bookNum = 0x04A50;
		        final long phoneNum = 380680534032L;
		        final byte binaryPhonePart = 0b100000;
		        final short octalPhonePart = 06550;
		        final byte taskNumber = 24;
		        final char engChar = (char) taskNumber + 65;

		        String StringOfBookNum;
		        String StringOfPhoneNum;
		        String StringOfBinaryPhonePart;
		        String StringOfOctalPhonePart;
		        String StringOfTaskNumber;
		        String StringOfEngChar;

		        StringOfBookNum = Short.toString(bookNum);
		        StringOfPhoneNum = Long.toString(phoneNum);
		        StringOfBinaryPhonePart = Byte.toString(binaryPhonePart);
		        StringOfOctalPhonePart = Short.toString(octalPhonePart);
		        StringOfTaskNumber = Byte.toString(taskNumber);
		        StringOfEngChar =  Integer.toString((int) engChar);

		        Count.CountEvenNumber(StringOfBookNum);
		        Count.CountEvenNumber(StringOfPhoneNum);
		        Count.CountEvenNumber(StringOfBinaryPhonePart);
		        Count.CountEvenNumber(StringOfOctalPhonePart);
		        Count.CountEvenNumber(StringOfTaskNumber);
		        Count.CountEvenNumber(StringOfEngChar);

		        StringOfBookNum = null;
		        StringOfPhoneNum = null;
		        StringOfBinaryPhonePart = null;
		        StringOfOctalPhonePart = null;
		        StringOfTaskNumber = null;
		        StringOfEngChar =  null;

		        StringOfBookNum = Integer.toBinaryString(bookNum);
		        StringOfPhoneNum = Long.toBinaryString(phoneNum);
		        StringOfBinaryPhonePart = Integer.toBinaryString(binaryPhonePart);
		        StringOfOctalPhonePart = Integer.toBinaryString(octalPhonePart);
		        StringOfTaskNumber = Integer.toBinaryString(taskNumber);
		        StringOfEngChar =  Integer.toBinaryString((int) engChar);

		        Count.CountOfBinaryNumber(StringOfBookNum);
		        Count.CountOfBinaryNumber(StringOfPhoneNum);
		        Count.CountOfBinaryNumber(StringOfBinaryPhonePart);
		        Count.CountOfBinaryNumber(StringOfOctalPhonePart);
		        Count.CountOfBinaryNumber(StringOfTaskNumber);
		        Count.CountOfBinaryNumber(StringOfEngChar);

			}
		}


class Count
{

    static byte odd = 0;
    static byte even  = 0;
    static byte oneCount = 0;
/**
 * 
 * @param number - a number that checks for oddness and evenness
 */
	public static void CountEvenNumber ( String number)
	{
		System.out.println("Number: " + number);

		 for (byte i = 0; i < number.length(); i++) {
	            if (number.charAt(i) % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	        }

		 System.out.println("Odd: " + odd);
		 System.out.println("Even: " + even);
		 System.out.println("\n ");


	}
/**
 * 
 * @param number - (args) in this number we are looking for the number of units
 */
	public static void CountOfBinaryNumber(String number)
	{

		for (byte i = 0; i < number.length(); i++)
		{
            if (number.charAt(i) == '1')
            {
                oneCount++;
	        }
        }
		System.out.println("Number in Binary Number System: " + number);
		System.out.println("Count Of (1) Numbers: " + oneCount);
		 System.out.println("\n ");
	}
}

	
	
	
	
	
	
	
		
		

	
	
	
	



