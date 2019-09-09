package day13;

public class switchexpression {
	public static void main(String[] args) {
		
 int num = 5;
 switch ( num ) {
 case 7: 
	 System.out.println("Sunday");
	 break; // case closed, dismissed
	 // its used for exiting switch 
	 // statement after the case is executed
	 // 7 not = 5
	 default:
		 System.out.println("Invalid Entry");
		 break; // exits the switch statement
		 
	 case 10-5:
		System.out.println("Friday");
		break;
		
 }
 
 
	 
	String days ="Tuesday";
	 switch ( days) {
	 
	 case "Monday": System.out.println("Monday is fun day");
      break;
	 
	 case "Tuesday": System.out.println("Tuesday is great day");
	 break;
	 
	 case "Wednesday": System.out.println( "Wednesday is day off");
	 break;
	 
	 default: System.out.println( "Invalid");
	 break;
	 
	  
	 }
	 
	 // switch statement expressions must be evaluated to a single value
	 //(character, digit or text) 
	  
	 // therefore 4 data type are not accepted:
	 // double a =10L, 10D; 
	 // float a =10F, 10f;
	 // long a= 10, 10L, 10l;
	 // boolean = true, false, 10>9
	 
	 // examples of compile error:----------------------------------
	 
	long N1 =(byte)10;// 10L
	 //  switch (N1) { }
	
	float N2 = 100; // 100.0F
	//switch (N2) {}  error 
	
	double N3 = 10;
	// switch (N3) {} error
	
	boolean N4 = true; // 9<8 
	//switch (N4) {} error 
	//-----------------------------------------------------------------
	
	 
	// or logic:
	
	char grade = 'B';
	if (grade == 'A'  || grade == 'B') {
		System.out.println("Passed the exam");	
			
	} else {
		System.out.println( "failed");
		
	}
	
		switch (grade) {
		case 'A':  // like OR logic
		case 'B':
			System.out.println("passed the exam");
			break;
			
			default:
				System.out.println("failed exam");
		}
		
	//-------------------------------------------
		
		String US = "USA";
		if (US == "USA" || US =="America" || US == "US") {    // 3 OR
			System.out.println( "American");
			
		}else {
			System.out.println("Not American");
		}
		 switch (US) {
		 case "US":
		 case "USA":                   // 3 cases
		 case "American":
			 System.out.println( "American");
			 break;
			 
			 default:
				 System.out.println("Not American");
		 }
		 
		 //-----------------------------------------------------
	
	// Whenever you are writing code and checking if some variable equals different values.
       //  1) You can use multi branch if statements
       //  2) Switch statement
	
	
	
	 
	 
 
	
	
	
	
	
	
	
	
	
	
	
	}

}
