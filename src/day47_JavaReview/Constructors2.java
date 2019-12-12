package day47_JavaReview;

class Cinthia{
	public Cinthia(int a) { // constructor
		System.out.println("A");
	}
	
	public Cinthia(double b) {
		System.out.println("B");
	}
	
	public Cinthia(String str) {
		System.out.println("C");
	}
	/*
	public Cinthia() {  // default constructor
	}
	*/
	
}


public class Constructors2 extends Cinthia {
	public Constructors2() {  // constructor 2
		super("A");            // calling constructor1 Cinthia with argument in another constructor.
	}

	public static void main(String[] args) {
		Constructors2 obj = new Constructors2();
		
	}
	
	
	
	
}
