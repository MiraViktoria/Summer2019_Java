package day09;

public class If_Statment {
	
	/*   if statements:
	 *                single If statement:
	 *                if ( boolean expression    )  {  codes to run}
	 *   "if block" only gets executed if condition is true. 
	  */
public static void main(String[] args) {
	
	if (true) {
		 System.out.println("Hello");
		 System.out.println("happy Friday");
		 System.out.println("tomorrow is day off");
	}
	//it will be executed because its true, if not true no output.
	int a = 1000;
	if (a++ == 1001);
	// 1000 == 1001 ==> false 
	
	    a = 2000;
	    System.out.println(" a is increased");
	System.out.println(a+ "\n\n\n");
	
	int X = 987654320;
	if (X%2==0) { 
		//true
		System.out.println(X);
		System.out.println("its an even number");
	}
	if (X%2 != 0) { 
		//false, doesn't get executed 
		System.out.println(X);
		System.out.println("its an odd number");
	}
	
	int Y =23456780;
	if (Y%5 ==0 ) {
	System.out.println(Y+ "can be devided by 5\n\n");
	}
	if  ( Y % 5 != 0) { 
		System.out.println(Y + "can't be devided by 5\n\n");
 }
	String CEO = "Main Boss";
     String Kuzzat = "Main Boss";
     System.out.println(CEO == Kuzzat); //true
     if (Kuzzat == CEO) {
    	 System.out.println("great person in the world");
    	 System.out.println( "first");
    	 
    	 if (Kuzzat != CEO) {
    		 System.out.println("great person in the world");
    		 System.out.println("second");
    	 }
    	double TotalNumber = 100; //600
    	boolean Cybertek = true;
    	boolean BestSchool = true;
    	
    	if (Cybertek == BestSchool) {
    		TotalNumber += 500;// totalNumber =600
    		// true
    	 }
    	if (Cybertek != BestSchool)  {
    		// false
    		TotalNumber -= 50; // TotalNumber =50;
    	}
    		System.out.println( TotalNumber); 
    		/*
    		  1. declaer variable, and initialize user age.
    		  2. write program if the user eligible to vote for D.T. 
    		   vote age: 18
    		 */
    	byte PersonAge = 78;
    	byte voteAge = 18;
    	
    	if ( PersonAge >= voteAge) {
    		// true
    		System.out.println("Yes you are eligable to vote");
    		System.out.println("have fun with building the wall");
    		System.out.println( "MAGA");
    	}
    	if (PersonAge < voteAge ) {
    		// false
    		System.out.println("you are not eligable to vote, grow up");
    	}
  }
	
} 
}