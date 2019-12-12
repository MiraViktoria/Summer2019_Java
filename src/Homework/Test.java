package Homework;

 
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the minutes");
		int minutes = scan.nextInt();
		minutes= minutes -1;
		
		
		while(minutes>0) {
			int seconds = 59;
			while(seconds>0 ) {
				System.out.println(minutes + "minutes  and "+ seconds);
			}
			
		}
		
	

	}
	
}

