package day27_CustomMethods;

public class VoidMethods {
	
	/*
    declaration of method:
    access-modifier   specifier   return-type  methodname() {
                statements;
            }
 */

public static void main(String[] args) {
    
    myFirstMethod();
    
    even1To100();
}

public static void even1To100() {
    for(int i=0; i <= 100; i++) {
        if(i %2 != 0) {
            continue;
        }
        System.out.print(i+" ");
    }
    
}

public static void myFirstMethod() {
    
//  public static void main(String[]) {  }  
            // methods must be decleared within the class
    
    System.out.println("Hello World");
    System.out.println("Hello Cybertek");
    System.out.println("Hello Khurshed");
        
}

}
