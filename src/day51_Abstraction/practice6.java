package day51_Abstraction;

import java.util.Arrays;

public class practice6 {
	
	public static void main(String[] args) {
		
		String name = "Madina";
		 for( int i = name.length()-1; i>=0;  i--) {
			 System.out.print(name.charAt(i));
		 }
		 System.out.println();
		 
		 String[]name2 = {"Lucia", "Lua", "Dashka"};
		 for(int i = 0; i< name2.length; i ++){
			System.out.println(name2[i]);
			
			 
			 
		 }
		 
		for( String each: name2 ) {
			System.out.println(each);
		}


	}

}
