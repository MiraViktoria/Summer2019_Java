package day08_shorthandoperators;

public class logicalOperators {
	
	
	public static void main(String[] args) {
		/*
		 &&: And logic true && true ==> true, both true-  return true. orthewise it will return false 
		 || : or logic     true || false ==> true
		                   true || true  ==> true
		                   false||false ==> false
		                   
		                   both conditions must be false to return false. 
		                   If one of them true it will return true.
		 */
		//&&:
		boolean ResultA = 9 ==0 && "muhtar" == "good";
		System.out.println(ResultA);
		boolean ResultB = 8>5 && 7 == (8-2+1);
		
		System.out.println(ResultB);
		boolean ResultC = !false !=true &&  !false ==! (!true);
		//                true!= true && true ==! false
		//                false       && true ==> false
		
		System.out.println(ResultC );
		
		// ||:
		  boolean A  = "Monday" == "Fun-day" || 6==6;
		  
		  //                   false || true ==> true
		  System.out.println(A);
		
		boolean B = true || false; //==> true
		System.out.println(B);
		 
		boolean C = ! (8>5) || ! ("Today"  != "friday") ;
		//            true  || true
		
		// false             || false 
		System.out.println(C);
		
		// ||&&:
		boolean D = true && true || false;
		//              true     || false
		System.out.println(D);
		
		boolean E = !(7>5 && 6 !=5) && (9>5 || 10>4);
		
	//                !true         &&   true
		//           false           && true  if one is false return is false. 
		System.out.println(E);
	}
}
