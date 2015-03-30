package org.code.tutorials.style;
import java.util.Scanner;


/*
 * This is a class that we made to demonstrate good coding style.
 * It doesn't do anything in particular, but it does compile!
 *
 */
public class GoodExample {

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = scanner.nextLine();
		
		System.out.print("Enter your last name: ");
		lastName = scanner.nextLine();
		
		//say my name 3 times!
		for(int i = 0; i < 3; i++) {
			
			//make a full name
			String fullName = firstName + " " + lastName; 
			print(fullName);
		}
		
		scanner.close();
		
		int theSum = sum(2, 4);
		System.out.println(theSum);
	}
	
	/*
	 * This is a convenience method to  
	 */
	private static void print(String text) {
		System.out.println(text);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

}
