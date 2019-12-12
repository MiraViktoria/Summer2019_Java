package day21_whileLoops;

public class do_whileLoop {
	public static void main(String[] args) {
		
		boolean A = false;
		 while(A) {
			 System.out.println("hello");
		 }
		 
		 do {
			 System.out.println("Hello");
		 }while (A);
		 System.out.println(A);
		 System.out.println();
		 
		/*
		  do_while: 
		  
		   do{ 
		        statements;
		        } while(condition);
		        compiler executes the Do block first,
		         and then checks the condition, if condition 
		         is true will keep execute, otherwise exits the loop
		         
		         
		          do_while loop vs while loop
		          
		         do-while loops gets executed at least ones.
		         just while loop never gets executes if condition is false
		  */
		 
		int x =1;
		do {
			if(x%2==0) {
				System.out.println(x+" ");
			}
			
		}while(x <=100);
		
		System.out.println();
		
		
		do {
			System.out.println("hello world");
			break;
			
		}while(true);


	}

}
