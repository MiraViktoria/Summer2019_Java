package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name");
		      String firstName = input.nextLine();
		      
		System.out.println("Enter your lastName");      
		String lastName = input.nextLine();
		
		String fullName = lastName + " " + firstName;
		
		System.out.println(("Your full name is:" + fullName));
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
	}
}
