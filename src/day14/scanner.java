package day14;

public class scanner {
	/*
    1. write a program that can display the days
           if the day is Monday or Tuesday:
                           Java class days
           if the day is Thursday or Friday:
                           Selenium class days
           if the day is Wednesday or saturday:
                           SQL class days
           otherwise: day off
               (DO NOT use if statement) 
    */
   public static void main(String[] args) {
       //  boolean, float, double,  long
       
       String day  ="Monday";
       
       switch (day) {
           case "Monday":        
           case "Tuesday":
                   System.out.println("Java class");
                   break;
                   
           case "Wednesday":
           case "Saturday":
                   System.out.println("SQL");
                   break;
               
           case "Friday":            
           case "Thursday":
                   System.out.println("Selenium");
                   break;
                               
           default:
               System.out.println("Day off");
       
       }
   }
   
}

 
