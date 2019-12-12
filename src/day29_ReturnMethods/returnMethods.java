package day29_ReturnMethods;

public class returnMethods {
	/*
    access-modifier specifier  returnType name(parameter){
                   statements;
    }
    */
   
   public static void main(String[] args) {
       
       name();  // this is a String value
   //  "z"
       
       System.out.println( name() ); // return methods are either printed or assigned to the variable
   
       String str = name();
       
       System.out.println( str );
   }
    public static boolean result( ) {
       return 8 >9;
   }
   
   // if return type is void:
       public static void method1() {
           System.out.println("Hello");
           return;
       }
   
   // if the return type of the method is not void:
       public static String name() {
           return "bacth12";
       //  System.out.println();   
           //  once return statement executed it exits the method immedietly
       }
	
	/*
	Topic: Return Methods, Method Overloading, Review String methods
Package: day29_ReturnMethods
Warm up:
1. write a method that can find the frequency of characters in String.
    Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4
        THIS IS A JAVA INTERVEIW QUESTION
 */
}
