package day11;

public class warmup {
	
	public static void main(String[] args) {
		
		/*
		  1. declare an int varaible "year"
		  write java to chek if it leap yer
		  
		  if it can be devided by 4 ==> leap
		  do not use single if statement
		   2. grade calculator
		   
		     A => 90~100
		     B => 80~89
		     C => 70~79
		     D => 60~69
		     F => 0~59
		     
		     
		     
		     if else  - \only if 2 possibilities 
		     else if  if more than 2 possibilities 
		     
		     3. Nested if:   
		     
		 */
		
		int Year = 2000; // leap
		boolean LeapYear = Year % 4 ==0;
		
		if (LeapYear) {
			System.out.println("Year " + Year + " is leap year");
		}
			else {
				System.out.println("Year" + Year + "  is not leap year");
			}
		
		//2 : Grade calculator
		
		int grade =-10;
		boolean A = grade >= 90 && grade <= 100;
		boolean B = grade >= 80 && grade <=89;
		boolean C = grade>= 70 && grade <= 79;
		boolean D = grade >=60 && grade <= 69;
		boolean ValidGrade = grade >= 0 && grade <= 100;
		
if (ValidGrade) { 
			// if order  to multi-branch if get executed, first  need ValidGrade.
		 
		     if (A ) {
			System.out.println("You have A");
		 
		} 
		     else if(B) {// {90> grade >= 80
			System.out.println( "You have B");
		     }
		     else if (C) { // 80> grade >=70
			System.out.println("You made C");
		}
		       else if (D) {//70> grade >= 60
			System.out.println("You have D");
		}
 
		   else { // 0<=grade <60
			System.out.println( "You have F");
		   }
 
	}
	 
	 
else { 
	System.out.println("Invalid grade");
	}
 
	 
 

/*
  declere viribable called Age
  declare a boolean viriable "Good person"
  if good person is false
  
  
  age >= 18 => sigar 
  age >= 21 => hookah 
   age >= 25 => milk
    age <18 => milk 
    
    else 
    //bad for you health
 */
 
 int age = 30;
 boolean GoodPerson = true;
 
  
	 
  
  if (age >= 18 ) { 
	  System.out.println( "Alcohol is bad for your health");
  }
  else {
	  System.out.println( "you can buy sigarets");
	  
  }
  if (age >=21)
  {
	  System.out.println( "you can buy hookah");
	  if (age >=25) {
		  System.out.println("you can buy alcohol");
	  }
	  else {
		  System.out.println("buy milk");
		  
	  }
	  
	  /*
	   *  write program that can find the number of days in a month.
	    (feb has 28 days)
	    
	     int month  = 0~ 12;
	      must use nested if
	      28 days : month 2 
	      30 days : month 4,6,9,11
	     31 days :  month 1,3,5,7,8,10,12
	     
	     even numbers of 30: 4 &6
	     odd numbers of 30 days: 9 &11;
	     
	     even numbers of 31 days: 8,10,12;
	     odd numbers of 31 days : 1,3,5,7
	     
	     
	   * */
	  
	  int month = 5;
	  if (month >0 && month<13) {
		  
		  if(month==1 ) {
			  // before Aug all even numbers have 30 days, all odd numbers have 31 days
			  System.out.println("31");
			 	  
		  }
		  else if (month ==2) {
			  System.out.println("28 days");
		  }
		  else if (month==3) {
			  System.out.println("31 days");
		  }
		  else if (month==4) {
			  System.out.println("30 days");
		  }
		  else if ( month==5) {
			  System.out.println("31 days");
		  }
		  else if (month==6) {
			  System.out.println("30 days");
		  }
		  else if (month ==7) {
			  System.out.println("31 days");
		  }
			  else if (month %2 ==0) {
				  System.out.println( "31 days");
			  }else {
				  System.out.println("30 days");
					  
				  }
			  }
		  }
		  
	  else {
		  System.out.println( "Invalid Entry");
	  }
	  
	  // second choice
	  int Month2 =5;
	  int year =2000; // if a year a leap year 
	  
if (Month2>0 && Month2 <13)	  { 
	  
	  if (Month2 == 2) {
		  System.out.println("28 days");
		  if (year %4 == 0) { // leap year
			  System.out.println("29 days");
		  }
		 // else { // regular year
			  System.out.println(" 28 days");
		  
		 }
		 
		 
	   
	  else if (Month2 ==4 || Month2 ==6) {
		  System.out.println("30 days");
	  }
	  else if ( Month2 ==9 || Month2 ==11) {
		  System.out.println("30 days");
	  }
	 // else { System.out.println("31 days");
	 
	 
	  
	  
	 
 
else {
	System.out.println( "Invalid Entry");
 
	 
	  
}
}
	}
}
	  
	 	  
	 
  
 
 
 
 
 

  


 
 	 
	 
		 
		 
	 

 

        
	
 
	 
		
		 
		 
		
	
	
	
	
	
	
 
	
	
	
	
 
