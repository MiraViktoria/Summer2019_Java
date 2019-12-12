package day29_ReturnMethods;
public class ReturnStatment {
	public static void main(String[] args) {
	        System.out.println("Hello");
	        /*
	        if(true) {
	            return;
	        }
	        */
	        System.out.println("Hola");  // once return statement is executed, it exits the method
	       for(int i=0; i < 5; i++) {
	            if(i == 3) {
	                return;
	            }
	        System.out.println(i);
	        }
	        System.out.println("Completed");
	    //  return "text";
	}
	/*
	 09/30/2019
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
Method declaration: 
    access-modifier specifier  returnType name(parameter){}
         public       static     void 
    return-Type: void or other data-types (int, String..)
            if the return is not void, it MUST be primitive or non primitives.
            there can only be one return-type
    if the return-type is void, the method does not return any value
    if the retun-Type is not void: the method MUST return a value
return statement: it's used for exiting the method, we can also use return statement to retun a vlue from the method
continue statement: skips the current iteration of the loop
break statement: exits from  loop or switch statement
System.exit(0): java stops all the execution
return method:
            1. does not have "void" as return Type
            2. MUSt return a Value
            3. the returning value MUST macth with the return-Type of the method
            4. the method body Must be closed with return statement
optional task:
    1. write a method that accepts String array, and returns the longest String value form the array
void method VS return method:
            void methoddoesnt return any value
            return method MUST return a value
	 * */
}
