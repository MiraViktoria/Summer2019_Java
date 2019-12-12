package day12_SwitchStatement;

public class if_statment_without_Curlybraces {
	
	public static void main(String[] args) {
		if(true) {
			System.out.println("hello");
			System.out.println("hello");	
		}
		 else {
			System.out.println("world");
		 }
		// without {}, can't use multiple statements without Curly braces
		if(true)
			System.out.println("Hello");
		else
			System.out.println("World");
		if(true) // nested statement without curly braces containing only one statement under.
			if(true)
				System.out.println("Hello World");
			else
				System.out.println("hello Cybertek");
		else System.out.println("Invalid");
		// -------------------------------------
		if(true) {
			if(true) {
				System.out.println("Hello World");
			}else {
				System.out.println("hello Cybertek");
	}}
		//Multi-branch if:
		int grade =80;
		if (grade <= 100 && grade>=0) {
		if (grade>=90) {
			System.out.println("A");
	  }else if (grade>=80) {
			System.out.println("B");
		}else if(grade>=70) {
			System.out.println("C");
		}else {
			System.out.println("Invalid entry");
		}}
if (grade <=100 && grade >=0)	
		if(grade>=90)
			System.out.println("A");
		else if (grade>=80)
			System.out.println("B");
		else if (grade >=70)
			System.out.println("C");
		else 
			System.out.println( ); // this belongs to else if statement
   else // this belongs to precondition
			System.out.println();
	}
}
