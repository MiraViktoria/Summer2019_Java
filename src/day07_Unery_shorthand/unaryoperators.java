package day07_Unery_shorthand;

public class unaryoperators {
public static void main(String[] args) {
	 /*
	   +:positive
	   -: negative
	   ++: increment
	   --:decrement
	    
	  */
	
	int a =10;
	int b = -10;
	System.out.println(b);
	
 //increment increases value by 1
	//1. pre  increment. ; operator placed before the viriable.
	int num1 = 100; 
	
	++num1; //101
	 //System.out.println(++Num1);
	
	//post increment : placed after the viraible
	
	//decrement decreases value by 1
	
	
	int IntNum =100;
	System.out.println(IntNum++); //100
	System.out.println(IntNum);
	
	
	int IntNum2 =IntNum ++; //IntNum101
	//IntNum2 =101
	
	System.out.println(IntNum2);
	System.out.println(IntNum);
	//102
	
	
	
	int x =100;
	int y = -1;
 
			
			
			//decrement : 
			//predecrement, decreases immidiatly 
			
			//postdecrement
			
			
			
			
			
			int Z =100;
	//System.out.println(--Z; );//99
			//post decrement: operator post after the viriable. 
			//will pass curent value and then decrease 
			int Y =95;
			System.out.println(Y--); //95
			
			System.out.println(Y);//94
			
			
			int T =25;
			System.out.println(++T);//26
			System.out.println(--T);//25
			
		int P = 50;// 49
		P =--P + P++ + P-- + P++;
		// pre  post   post  post
		//49 + 49    + 50   + 49
		System.out.println(P);
		
			
			
}
}
