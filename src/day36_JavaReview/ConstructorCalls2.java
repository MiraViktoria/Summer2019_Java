package day36_JavaReview;

public class ConstructorCalls2 {
/*
	 constructor calls: 
        1. only a constructor can call another constructor
        2. constructor cannot called by constructor name
        3. we use "this()" keyword to call the constructor in current class
        4. constructor call MUST be the first step in a constructor
        5. one constructor can only call one constructor (cannot call more than 1)
this keyword: used for calling object instances (anything that belongs to the object)
 */
	public ConstructorCalls2() {
        //   this();   // constructor cannot call it self
        
        this(true);  // constructor cannot contain it self
        
        System.out.println("default");
     }
    
    public ConstructorCalls2(boolean a) {
        // this( true );  // constructor cannot call it self
        
    //  this();
    //  this(false);   // constructor cannot call it self
        
        System.out.println("boolean");
    }
    
    
    public ConstructorCalls2(String name) {
    //  this("Hello");    constructor cannot call itself
        
        this('A');  // boolean   default   char
        
        // ConstructorCalls2();  // constructor canno be called by constructorName
        System.out.println("String");     // String
        
    }
    
    public ConstructorCalls2(char ch) {
        this();  //  boolean  default
    //  this("Hello");  // constructor cannot contain it self
        System.out.println("Char");
    }
    
     public static void main(String[] args) {
        
        ConstructorCalls2 obj = new ConstructorCalls2( "Hello");
   }
}
