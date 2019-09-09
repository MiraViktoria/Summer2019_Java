package day_10_if_statement;

public class Single_if_statement {
	
	public static void main(String[] args) {
		 //Review
		// if statement by itself:
		 // if (condition ) {codes}
		// codes gets executed if condition is True.
		
		/*
		 single if: 
		 if (boolean expression) { A
		                  } 
		 */
		
		if ( 9>8) { 
			System.out.println(" 9 is greater than 8");
			
		}
		 if (9 < 8) {
			 System.out.println(" 8 is greater than 9");
			 
		 }
		 System.out.println("Test Completed"); // does not belong to any if blocks
		 
		 
		 //task 01:
		 
		 int num1 = 100;
		 int num2 = 300;
		 int max = 0;
		 if (num1 > num2) {
			 // max = num1;
			 max +=num1;
			  
		 }
		 if (num2 >num1) {
			 max = num2;
			 
		 }
		 System.out.println("Maximum number between " +num1 + " and" + num2 +" ");
		 
		 
		 // task 03
		 
		 int n1 =100, n2=200, n3=700;
		 int maximum = 0;
		 /*
		    in order to n1 to be max: n1 > n2 && n1 > n3
		    n2 to be max            : n2> n1 && n2> n3
		    n3 to be max            : n3 > n1 && n3 > n2
		  */
		 
		if (n1 > n2 && n1 > n3) {
			maximum = n1;
			
		}
		if (n2> n1 && n2> n3) {
			maximum = n2;
			
		}
		
		if (n3 > n1 && n3 > n2) {
			maximum = n3;
			
		}
		String result = "maximum number between " + n1 + ", " +n2+  ", "  +n3+  " is:" +maximum ;
		
		System.out.println(result );
		
	}
	
	
	  
		
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
