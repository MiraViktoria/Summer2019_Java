package day21_whileLoops;

import java.util.Scanner;

public class WhileLoop {
	
	/*
	 while(condition) {
	 statements;
	 } 
	 while loop is a repeating if statement. 
	 
	 Compiler first checks the condition of the while loop,
	  if its true executes the loop, otherwise stops. 
	 
	 */
	
	public static void main(String[] args) {
		
		int a = 9;// a=8
		while (a>8) {
			a--;
			System.out.println("Hello");
			
		}
		/*
		how many times "book" appered in my string
		 */
		
		String sentence ="I like book, I read book";
		// String sentence1 =sentence - will keep original value
		//                "I like,I read book"
		//                "I like, I read"
		
		int count =0;
		while(sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book","");
			// can make condition false, eventually
			
		}
		System.out.println(count);
		System.out.println(sentence);// changes the value of original value
		/*
		 break statement forcefully exits the switch statement and loop
		 */
		
		while(true) {
			System.out.println("hello");
			break;
		}
		
		int i = 0; //Int should be out of loop
		
		while(true) {
			
			i++;
			System.out.println("Hello: "+i);
			if (i==5) {
				break;
			}
			// Any for loop can always be converted to while loop
			// initialization placed outside of loop, 
			/*
			   initialization;
			   while(condition){
			   statements;
			   iterator;
			   
			 */
		}
	
		/*
		   use while loop to print all even numbers between 1-100
		  */
		for(int z=1; z<=100; z++) {
			if(z%2 == 0) {
				System.out.println(z+" ");
			}
		}
		/*
		   initialization;
		   while(condition){
		   statements;
		   iterator;
		   
		 */
		
	int x =1;
	while(x<=100) {
		if(x%2==0) {
			System.out.println(x+" ");	
		}
		x++;
		
	}
	System.out.println();  
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Starting number");
	int start = scan.nextInt();
	 
	System.out.println("Ending number");
	int end = scan.nextInt();
	
	
	for(int j = start; j < end; j++) {
		if (j%2==0) {
			System.out.println(j+" ");
		}
	}
	
	// convert to while loop
	
	int j = start;
	while(j < end) {
		if (j%2==0) {
			System.out.println((j+" "));
		}
		j++;
	}
	
	}

}
