package day30_WrapperClass_ArrayList;
import java.util.Arrays;
public class WrapperClass {
	 /*
    primitives                     wrapper-class : classes that are dedicated to primitives
      byte                            Byte            null
      short      Auto-boxing          Short           null
      int        ==========>           Integer         null
      long                            Long            null
      float                           Float           null
      double       un-boxing          Double          null
      boolean    <===========          Boolean         null
      char                            Character       null  
      
   default values of primitives:  
              byte, short, int, long ==>0;
              double, float ==> 0.0
              boolean ==> false
              char ==> space
              
      default value of wrapper class:  null
      
if we do not give any objects to class (reference) null will be given by defualt
      
      String's default value is also null
*/
public static void main(String[] args) {
  int  numInt = 10;
  Integer numInteger = 10;
  
  double numdouble = 5.5;
  Double numDouble = 5.5;
  
  long longnum  = 20L;
  Long Longnum = longnum;   // Auto-Boxing
  
  System.out.println(longnum);
  System.out.println(Longnum);
  
  
  Boolean  BooleanResult = false;
  boolean booleanResult = BooleanResult;  // unboxing
  
  
  char ch1 = 'L';
  Character ch2 = ch1;  //  Auto-boxing
  
  char ch3 = ch1;  // none
  
  char ch4 = ch2;   // un-boxing
  
  Character ch5 = ch2;  // none
  
  System.out.println(ch1);
  System.out.println(ch2);
  System.out.println(ch3);
  System.out.println(ch4);
  System.out.println(ch5);
  
  Boolean[] arr =new Boolean[3];  // [0, 0, 0]
  System.out.println(Arrays.toString(arr));
  
  int num1 = 10;
  // num1.method();  primitves does not have methods, variable num1 is not a reference of an object
  
  Integer num2 =20;
  int x = num2.MAX_VALUE;  
}
/*
Topics: Wrapper class,  
        ArrayList class,  
        Array vs ArrayList 
Package: day30_WrapperClass_ArrayList
WarmUp:  
    1. write a return method that accepts a String and removes duplicate values from the String
    Ex:
        RemoveDuplicate("aaabbbccc") ==> "abc"
    2. write a return method that accepts String and returns the unique values from the String
    Ex: 
            Unique("AABBCDEEE")  ==> "CD"
wrapper classes: 
        every primitives in java has a class that's designed to it
        primitives: byte, short, int, long, float, double, boolean, char
        wrapper classes: Byte, Short, Integer, Long, Float, Double, Boolean, Character
        all wrapper class presented in "java.lang" package
        String class is also presented in "java.lang" package
        All classes in package "java.lang" Imported by default
    Auto-boxing: converting primitive values to Wrapper class
    Unboxing: converting wrapper class value to primitives
    default values of primitives:  
                    byte, short, int, long ==>0;
                    double, float ==> 0.0
                    boolean ==> false
                    char ==> space
                    
    default value of wrapper class:  null
            
     if we do not give any objects to class (reference) null will be given by defualt
            
        String's default value is also null
useful methods of Wrapper class: 
                Max_Value
                Min_Value
                parse methods
                ValueOfmethods
*/
}
