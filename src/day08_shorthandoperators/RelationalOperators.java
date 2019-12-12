package day08_shorthandoperators;

public class RelationalOperators {
	/*
	 * relational operators: return boolean expression. 
	 * 
	  >:
	  >=:
	  <:
	  <=:
	  ==: equal
	  =: assign
	  !=:not equal
	  ! : means the logical opposite. NOT
	    
	 */

	
	public static void main(String[] args) {
		System.out.println( 10>9); // 
		boolean resultA = 10>9;
		System.out.println(resultA);
		
		System.out.println( 10>=9);
		boolean resultB = 10>=9;
		System.out.println(resultB);
		
		boolean resultC = 10<=9;
		System.out.println(resultC);
		
		boolean resultD =1100<1200;
		System.out.println(resultD);
		
		boolean resultE = 1000<1000;
		System.out.println(resultE);
		
		boolean resultF = 1000<=1000;
		System.out.println(resultF);
		
		
		// ==  equal
		
		boolean resultG = 19==19; //equal
		System.out.println(resultG);
		
		
		// ! NOT
		boolean resultH = 20 != 20;
		System.out.println(resultH);
		
		boolean A =!false; //true
		System.out.println(A);
		
		Boolean B =! true; //false
		
		/*
		 *  in Java true ==true, false ==false.
		 *  
		 *  !false equal to true, true equals to false
		 *  so
		 *  false does not ! true
		 */
		
		boolean C  = ! false!= !true;
		System.out.println(C);
		
		 boolean D = true == ! false;
		 System.out.println(D);
		 
		 boolean E = ! (!true);
		 System.out.println(E);
		 boolean F = 10 > 9 == 9 < 10;
		 System.out.println(F);
		 
		 
		 
		 //practice ! not
		 
		 boolean g = false;
		 System.out.println(!g); //true
		 
		 System.out.println(!true == false);
		 
		                    //false ==> false ==> true
		 boolean h = "batch12" == "Batch13"; // false
		 System.out.println(h);
		 
		 System.out.println( "batch12" == "Batch12"); //key sensitive 
		 System.out.println( "cybertek"!= "club"); //true
		 System.out.println( "Kuzzat" == "bad guy");//false
		 
	 
		
		int num =198;
		System.out.println(num %=2); //even number
		
		byte ByteNum =30;
		//int Inum = Inum +=ByteNum; muts give value to loval variable. Inum.
		
		
		
		
		
		
		
		
		
		
	}
}
