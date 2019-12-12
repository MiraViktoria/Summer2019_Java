package Homework;

import java.util.Scanner;

public class august25 {
	
    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your street");
        String yourStreet = scan.nextLine();
        System.out.println("Enter your city");
        String yourCity = scan.nextLine();
        System.out.println("Enter your state");
        String yourState = scan.nextLine();
        System.out.println("Enter your zip code");
        int yourZip = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhone = scan.nextLong();
        System.out.println("Enter your email");
        String yourEmail = scan.nextLine();
        System.out.println("Enter your age");
       int yourAge = scan.nextInt();
        System.out.println("Enter your height");
       double yourHeight = scan.nextDouble();
        System.out.println("Enter your weight");
        double yourWeight =   scan.nextDouble();
        System.out.println("Are you married?");
        boolean result  = scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Full name: "+ firstName+", "+lastName);
        System.out.println("Address: "+ yourStreet+", "+yourCity+", "+yourState+", "+yourZip);
        System.out.println("Contact: work phone number - " + workPhone+ ", "
                + "personal phone number - "+personalPhone+", email: "+yourEmail );
        System.out.println("Age: "+yourAge);
        System.out.println("Height: "+yourHeight);
        System.out.println("Weight: "+yourWeight);
        System.out.println("Married?: "+result);
       
    
    }
}
    

