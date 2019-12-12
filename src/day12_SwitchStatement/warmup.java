package day12_SwitchStatement;

public class warmup {
	public static void main(String[] args) {
		
		       int n1 = 3, n2 = 9, n3 =5;
		        if (n1 == n2 && n2 ==n3) {
		            System.out.println("All of them are equal.");
		        }
		        else if (n1 == n2) {
		            System.out.println("n1 and n2 are equal.");
		        }
		        else if (n2 == n3) {
		            System.out.println( " n2 and n3 are equal.");
		        }
		        else if (n3 == n1) {
		            System.out.println("n3 and n1 are equal.");
		        }
		        else {
		        	System.out.println("None of them are equal");
		        }
		// nested if condition:
		         
		        int A = 3, B = 9, C=5;
		        if (A == B && B ==C) {
		            System.out.println("All of them are equal.");
		        }
		        else if (A== B) {
		            System.out.println("n1 and n2 are equal.");
		        }
		        else if (B == C) {
		            System.out.println( " n2 and n3 are equal.");
		        }
		        else if (A == C) {
		            System.out.println("n3 and n1 are equal.");
		        }
		        else {
		        	System.out.println("None of them are equal");
		        }
		        /*
		        60~70 => D
		         70~80 => C
		         80~80 => B
		         90~100=> A  
		          grade must be: 0~100  
		         */
		        int grade =101;
		    if(grade>=0 && grade <=100) {
		        if (grade>=60) {
		        	if(grade>=90) {
		        		System.out.println("A");
		        	}
		        	else if(grade >= 80) {
		        		System.out.println("B");
		        	}
		        	else if(grade>=70) {
		        		System.out.println("C");
		        	}else {
		        		System.out.println("Failed");
		        	}
		        }
		        }       
	}

}
