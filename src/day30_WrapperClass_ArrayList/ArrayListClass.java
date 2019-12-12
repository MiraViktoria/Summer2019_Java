package day30_WrapperClass_ArrayList;
import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        
        /*
         Declaration of arrayList:
                ArrayList<ClassType> variableName = new ArrayList<>();
                
                ArrayList<ClassType>  variableName = new ArrayList<ClassType>();
                
                
              methods of arrayList:
              
            add(value):  adds values to arrayList. if the value is primitive, will converts to wrapper class
            get(indexNum): gets the specific values from arrayList and retuns it
            size(): retunrs the length ( total number of values) from the arrayList
            clear(): clears the array, removes all the values out from the arrayList
  
         */
                int[] array1 = new int[1];
        
        
            ArrayList<Integer>  list = new ArrayList<>();
            
            ArrayList<Integer>  list2 = new ArrayList<Integer>();
                            list2.add( 10 );  // auto-boxing
                            list2.add( 20 );
                            list2.add( 30 ); 
                            // [10, 20, 30]
            // index:            0   1   2              
                                    
            
            System.out.println( list2 );
            
            
            System.out.println( list2.get(1) ); // 20
        //  System.out.println( list2.get(9) );   // maximum index number is 2
        
            
            System.out.println( list2.size() );  //3
            
            list2.clear();
            System.out.println( list2 );
            
            System.out.println( list2.size() );
  }
}
