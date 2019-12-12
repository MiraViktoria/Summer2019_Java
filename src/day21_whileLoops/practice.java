package day21_whileLoops;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
	do {	
		System.out.println(" Enter first number");
		int a = scan.nextInt();
		
		System.out.println("Enter second number");
		int b =scan.nextInt(); 
		
		System.out.println("addition is: "+(a+a));
		
		System.out.println(("Do you want to continue?"));
		String answer = scan.next();
	     
		if(answer.equalsIgnoreCase("no")); {
			break;
			
		} 
			
	} while(true);
	
	}
	
}
