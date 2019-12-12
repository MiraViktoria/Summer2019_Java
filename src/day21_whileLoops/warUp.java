package day21_whileLoops;

public class warUp {
	
	public static void main(String[] args) {
		
		String sentence ="O like books, I have books, I need book";
		//index:                 i, i+4 ==> book
		int count = 0;
		for(int i=0; i < sentence.length()-3; i++) {
			//       16       17
			if(sentence.substring(i,i+4).equals("book")) {
				//substring(0,4)
				count++;
				
			}
		}
		System.out.println(count);
		
		String words ="Cybertek is school, Cybertek is great, I love Cybertek";
		//             i, i+7
		// ending index is excluded in substring
		
		int nTimes = 0;
		for(int i = 0; i< words.length()-7; i++) {
			if(words.substring(i , i+8).equals("Cybertek")) {
				nTimes++; 
			}
		}
System.out.println(nTimes);
/*
		 remove duplicate
		 input: aabbcc
		 output: abc
		 */
		String s1 ="aabbcc";
		String result =""; //abc, to store new string 
		                    //value that doesnt have duplicates
		
		
		for(int i=0; i < s1.length(); i++) {
			if(!result.contains(s1.substring(i,i+1) )) {
				//if(!result.contains(""+s1.charAt(i) add empty string ( for all letters
				result += s1.substring(i, i+1);
				
			}
		}
		System.out.println(result);
		
		
	}

}
