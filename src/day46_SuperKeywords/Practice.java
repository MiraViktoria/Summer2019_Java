package day46_SuperKeywords;


class parent {
	
	public parent (int a) { // constructor //C A
		this("A"); //C
		System.out.println("A"); //A
	}
	
	public parent(String b) { // constructor
		System.out.println("C");
	}
	
}

public class Practice extends parent{
         // sub                // super
	
	
	public Practice() {  // must call constructor and pass argument, call only one
		super(10); //C A
		
	}
	
	public static void main(String[] args) {
		Practice obj = new Practice();
		
		
	}
	
	
	
	
	
}
