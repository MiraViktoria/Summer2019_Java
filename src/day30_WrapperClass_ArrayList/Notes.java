package day30_WrapperClass_ArrayList;

public class Notes {
	
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
                Max_Value: returns the maximum value
                Min_Value: retuns the minimum value
                parse methods: converts string values to primitve values, and it's not case sensitive
                ValueOf methods: converts String values to Wrapper class values, and it's not case sensitive
ArrayList class: 
            1. presented in "java.util" package
                    import java.util.ArrayList;
            2. ArrayList does not support primitves
            3. in ArrayList we store Objects ONLY, all the values in ArrayList are objects (none primitives)
            4. ArrayList' size is automatically adjusted (dynamic)
            5. ArrayList is ordered (index numbers)
    Decleration of arrayList:
        1. ArrayList<ClassType> variableName = new ArrayList<>();
        2. ArrayList<ClassType> variableName = new ArrayList<ClassType>()
    methods of arrayList:
            add(value):  adds values to arrayList. if the value is primitive, will converts to wrapper class
            get(indexNum): gets the specific values from arrayList and retuns it
            size(): retunrs the length ( total number of values) from the arrayList
            clear(): clears the array, removes all the values out from the arrayList
sorting Array:
    Arrays.sort(variableName);
sorting the ArrayList:
        Collections.sort(VariableName);
    collections class is presented in "java.util" package
ArrayList vs Array:
        1. Array's size fixed, ArrayList' size is dynamic
        2. Array supports primitive and non-primitives, ArrayList does not support primitives
	 */
	

}
