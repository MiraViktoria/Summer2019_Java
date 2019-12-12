package day17_StringClass;

public class StringMethods2 {
	public static void main(String[] args) {
		
		/*
		   replace (old char, new char):
		   replaces all old char value
		    with the given new char value in the string 
		    and returns as a new String value
 */
		String str1 = "Java is Fun Programming Language";
		str1 = str1.replace('a', 'e');
		System.out.println(str1);
		
		/*
		 replace(old str, new str):
		 replace all the old str values with the given
		 str values and returns as New str value 
		 */
		
		String str2 ="Today is going to be great day to learn Java";
		
		str2 = str2.replace("Today", "Tomorrow");
		
		System.out.println(str2);
		
		str2 = str2.replace("Java", " ");
		System.out.println(str2);
		/*
		replaceFirst(old str, new str): 
		 replaces first occyes
		 yes
		 ured old string with the 
		 new str and returns it with new str value
		 */
		String s1 ="Java is fun, Java is good";
		s1 =s1.replaceFirst("Java", "Python");
				System.out.println(s1);
				 
		s1 =s1.replace('s', 'S');
		s1 =s1.replace('g', 'G');
		System.out.println(s1);
		
		s1 =s1.replace("is good", "is Good");
		 
		System.out.println(s1);
		
		String s2 ="Java is programming language, Java is Java";
		s2 = s2.replace("Java", "C#");
		System.out.println(s2);
		//String s2 ="Java is programming language, Java is Java";
		//s2 = s2.replaceFirst("Java", "C#"); or  ("Java is J", "C# is j");
		//System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
