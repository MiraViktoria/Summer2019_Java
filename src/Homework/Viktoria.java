package Homework;

import java.util.ArrayList;
import java.util.Arrays;
public class Viktoria {
    
    int a = 10;   //instance variable;   belongs to the object;    every object has its own copy
    
    
    static int b = 20;   //static variable;  belongs to the class;    no object needed;   only one copy;
    
    public static void main(String[] args) {
        int a = 10;   //local variable
        final String name5;
        name5 = "";
        System.out.println(name5);
        
        Viktoria obj = new Viktoria();
        obj.a = 20;
        obj.b = 50;
        
        Viktoria obj2 = new Viktoria();
        obj2.a = 100;
        obj2.b = 500;
        
        System.out.println(obj.a + " "+ obj.b);  // 20 500
        System.out.println(obj2.a + " "+obj2.b); // 100 500
        method5();
        
        
        
        System.out.println(obj.isError("error is a nice girl"));
        
        
        }
    
    
    
// 1:   public;        default;        private;       protected;       final;
//      universal        package          class         Inheritance      immutable;
//                                                  package 
// 2:   static;    instance;    
    
    
// 3:    void;    primitive;   wrapper class;    String class;
    
// 4:    name;
// 5:    (arguments);   (parameters);
    
    
    //wordList1 :   Madina, Suna
    //wordList2 :   Viktoria, Lucia
    
      public static boolean isError(String line) {
        
    if(line.startsWith("error")) {
              return true;
          }
          return false;
           }
    
        
    
    
    public static void method5() {
        
    }
    
    public String method6() {
        return name;
        
    }
    
    protected Integer method7(ArrayList<Integer> nums) {
        Integer num = null;
        return num;
    }
    
    
    
    
    
  public String name;
  String name1;
  private String name2;
  protected String name3;
  final String name4 = "";
 
}
