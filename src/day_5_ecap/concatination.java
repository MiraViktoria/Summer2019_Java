package day_5_ecap;

public class concatination {
	/*
	 String: represents sequence of characters. Using for storing text.
	 String values are in a double quote
	 Concatinations: combining, linking string together. ====> creats string value.
	 Using + sign
	  we can cooncate any value to string.
	  
	  String: char sequences, declared within "",
	  for storing texts
	  
	  Concatenation: linking things together, combining. 
	 
	 */
	
	
 public static void main(String[] args) {
	
	  
	String str = "any text goes here";
	System.out.println(str);
	
	String str2 ="1";
	
			System.out.println(str2);
			
	 System.out.println("Hello World");
	 String Hello = "Hello World";
	
	 System.out.println(Hello);
	  String myName = "Cybertek"+ "School";
	  System.out.println(myName);
	  
	  String Year = "This is" + 2019;
	 // Example:
	  String name = " Mira";
	  System.out.println("My Name is" +  name);
	  
	 
	
	/*
	 cucumber is viraible name $
	 Tomato is variable name $
	 */
	 int cucumber = 3; int tomato = 5;
	 System.out.println("cucumber is " + cucumber+'$');
	System.out.println("tomato is "+ tomato+ "$");
	
	
	String newStr = "100" + 10;
	System.out.println(newStr);
	System.out.println( 1 + 2 + 3 ); // 6
	System.out.println("1" +2 +3);  //"12" + 3 ===>123
	
	
//System.out.println("1"+1 -3); // "11" -3  Will not compile, only if all of them are numbers.
	
	System.out.println("Batch12"+1+2); // "Batch 121"+2 ====> batch 1212
	
	System.out.println(2-1+1+"4"); // 1+1+"4" = 2+"4 => 24
	
	System.out.println("Batch12"+(1+2)); // "Batch12"  + 3=> Batch123
	
	System.out.println(1+"123" +4+5); //1123+4+5 => 112345
	
	System.out.println("123"+ (4+5)); //1239
	
	System.out.println(1+("1"+2)); // 1+"12" => 112
	
	// texts can not be added only, concatenated 
	
	System.out.println(1+"123" + (4+5));//  1123+9 => 11239
	System.out.println( 4+3- (9+3)); // 7- 12 => -5
	
	
	//System.out.println((1+2)-"3");
// Can't subtract text from number
	
	String BookName ="I like the book called \'Game of Thones\'";
	System.out.println(BookName);
	
	String MyInfo= "My Name is: \n\tCybertek";
	System.out.println(MyInfo);
	
	System.out.println(('3'+3));
	// 51 +3 => 54, single quote represents number not text. 
	System.out.println("3"+'3'); // 3+'3'
	// "3" + 51   if we concate char to the string, char is stays as a character.
	System.out.println(12+ '3'); //12+51 = 63
	 // if we concate char to number, represented number of char will be concated.
	
	System.out.println('7'+3); // 55+3= 68
	
	System.out.println('7'+ "3"); // 73
	
	
}
	
	
 	
	
	
	
	
	
	
	
	
}
