package day12_SwitchStatement;

public class switchstement {
	/*switch statement similar with multi branch if statement 
	 swith (epression) {
	 case Value:
	          statement1
	          statement2
	          break 
	   defoult:
	         statement  */
public static void main(String[] args) {
		int score =3;
		if(score ==1) {
			System.out.println("1");
		}
		else if (score ==2) {
			System.out.println("2");
		}
		switch(score) { // must give an expression: data 
		                // can be in different order " if, if else, default ect.
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
	default:
		System.out.println("invalid");
		break; // closing statement same as closing bracket.
		// if no break in switch:  code will continue to run until exits the switch statement. 
		// case order does not matter
		}
		String str ="Java";
		switch (str) {
		     default: // else
		    	 System.out.println("Invalid");
		case "C#":
			System.out.println("C# programming language");
			break;
			//System.out.println("C# programming language") - can't be here
			// after break statement, should be No other statements!
		case "Python":
			System.out.println("Python is programming language");
		}
		char grade ='A';
		switch (grade) {
		case 'B':
			System.out.println("Passed with B");
		case 'C':
			System.out.println("Passed with A");
		default: 
		    System.out.println("Failed");
		}
}
}
