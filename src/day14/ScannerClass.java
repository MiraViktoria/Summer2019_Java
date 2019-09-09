package day14;

import java.util.Scanner;
// everything in scanner is imported

// import java.util.Scanner.*;
// imports all classes from java

public class ScannerClass {
 
 
	/* 	 
	 Scanner: its a class that provides the methods 
	 	to get user inputs.
	 	Scanner class presented in package "Java.util" package
	  in order to use scanner class, 	the scanner must be imported
	  
	  
	  Declaration of Scanner:
	  Scanner VariableName = new Scanner(System.it);
	  
	  Viriable name: can reference an object of the scanner class
	  
	  new Scanner(System.in): creates the object of the scanner class
	  
	  methods of a scanner class:
	  
	*/
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a Byte value");
			byte byteNum = input.nextByte();
			// only in use to enter byte value
			
			System.out.println(" you have entered:" + byteNum);
			
			System.out.println( "Enter another Byte value2");
			byte byteNum2 = input.nextByte();
			
			System.out.println(" you have entered:" + byteNum2);
			
			System.out.println("Addition is:" + (byteNum + byteNum2));
			
			
			
			
		}

	 
	
}
