package day_18_String_Class_Continue;

public class StringMethods_boolean {
	public static void main(String[] args) {
		
		/*
	       isEmpty(): checks if the String is empty, returns boolean expression.
	       
	       empty ==> true, !empty ==> false
	        
	   */
		
		String str ="Cybertek";
		boolean R1 = str.isEmpty();// false
		System.out.println(R1); // false
		
		String str2 ="";
		if (str2.isEmpty()) {
			System.out.println("it's empty string"); // true
		} else {
			System.out.println("it's not empty");
		}
		
   /*
     equals(str): checks if two string VISIBLE text are equal or not.
     
   */
		
		String A1 = "Cybertek"; //  string pool memory
		String A2 = new String("Cybertek"); // heap memory
		System.out.println(A1 ==A2); // false
		
		boolean R2= A1.contentEquals(A2);
		System.out.println(R2);
		
		System.out.println("java".equals("Java") );
		// false,  case sensitivity
		
 /*
  * equalsIgnoreCase(str): checks i two strings Visible 
  * 
  * 
   
  */
		
	String s1 = "Java";
	String s2 = new String ("java");
	System.out.println(s1==s2); // false
	
	System.out.println(s1.contentEquals(s2));	// false, case sensitive
	
	System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		
	/*
	 * contains(str): checks if str is contained in the String or not, than
	 * returns boolean expression.
	 * 
	 * contained ==> true
	 * !contained ==> false
	 * 
	 * 	
	 */
		
		
		String name ="Mira";
		boolean Result = name.contains("good girl"); // false, its not contained in my name
		
		System.out.println(Result);
		
		String name2 ="Crane";
		System.out.println(name2.contains("m")); // false case sensitive 
		
		
	/*
	 * startsWith("str"): checks if the String is started with given str or not,
	 * than returns boolean expression
	 * 
	 *   startedwith ==>true
	 *   
	 *  !startedwith ==> false
	 * 
	 	
	 */
		
		
		String Today ="Java";
		boolean Result2 = Today.startsWith("J"); // true
		System.out.println(Result2);
		
		
		String names ="Cybertek School is great place learn java";
		
		System.out.println(names.startsWith("Cybertek School")); // true
		
		
	/*
	 * endsWith(str): checks if the String is ended with 
	 * the given str or not, and returns boolean expression.
	 * 
	 * 	endedwith ==> true   !endedwith ==> false
	 * 
	 */
		
		
		String B1 ="Crane";
		System.out.println(B1.endsWith("e"));// true
		System.out.println(B1.endsWith("M")); // false
		
	
	}
	

}
