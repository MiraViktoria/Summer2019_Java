package day15_Scanner_StringClass;

public class StringClass {
	public static void main(String[] args) {
	/*
	 * String class:  
	 * 1. String is an abject. there are 2 way to create object from String class.
	 * 
	 *  string literals
	 *  
	 *  String str = "Cybertek"
	 *  String A ="Cybertek"
	 *  String B ="Cybertek"
	 *  
	 *      string literals
	 *      
	 *      when the object is created by String literals that object will be saved at String Pool (does not take dublicates) 
	  * 
	 *  2. Created by  using "new" keyword  : saved in heap memory outside of String Pool   
	 *   
	 * 	 string str = new Spring("Cybertek ") 
	 * 
	 *  every time "New" is created,  every time new memory is created, even if its same value.
	 */
		         String str = "Cybertek";
				  String A ="Cybertek";
				    String B ="Cybertek";
				    
		System.out.println ( A==B); // literals saved in String pool memory
		
		String str2 = new String ("Cybertek");
		System.out.println( str ==str2); // different memory locations
		
		String str3= new String ("cybertek");
		System.out.println( str2 == str3);
		
		String s1 = "cat";
		String s2 = "cat"
				;
		System.out.println(s1==s2);
		
		String s3 = new String ("Cat");
		String s4 = new String ("Cat");
		System.out.println(s3 == s4);// different memory location
		
		String a = "Batch12";
		String b = "Batch12";
		System.out.println( a==b); // false
		
		String c = new String ("Cybertek");
		String d = new String ("Cybertek");
		System.out.println( c==d); // false, different locations
	}
}
