package day47_JavaReview;


	
	class A {
		public String name1 = "Ayaz";
		//super.name1 ="H"; super keyWord must be used in subclass only
		
	}
	class B extends A {
		public String name2 = "Sukran";
		public String name3 = "Erhan";
		// public String name = "Ayaz";
		
		public void method1() {
			super.name1 ="Faride"; //calling from superslass 
			this.name1 ="Faride";  // calling from class itself.
		}
	}
	
	public class Inheritance extends B {	
		
		public String name4 = "Mehmet";
		public String name5 = "Mahribana";
		//public String name2 = "Sukran";
		//public String name3 = "Erhan";
		// public String name = "Ayaz";
		
		
		public static void main(String[] args) {
			
			Inheritance obj = new Inheritance();
			
			System.out.println(obj.name1 );
			System.out.println(obj.name2 );
			System.out.println(obj.name3 );
			System.out.println(obj.name4 );
			System.out.println(obj.name5 );
			
			System.out.println("========================");
			
			B obj2 = new B(); 
			
			System.out.println(obj2.name1 );
			System.out.println(obj2.name2 );
			System.out.println(obj2.name3 );
			//System.out.println(obj2.name4 ); // can't be inherited from sub class its not in B
			//System.out.println(obj2.name5 ); 
			
			System.out.println("========================");
			
			A obj3 = new  A();
			
			System.out.println(obj3.name1 );
			//System.out.println(obj3.name2 );//// can't be inherited from sub class its not in B
			//System.out.println(obj3.name3 );
			//System.out.println(obj3.name4 );
			//System.out.println(obj3.name5 );
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
}
