package day49_Recap;

public abstract class Animal {
	
	public abstract void eat();
	
	public abstract void sleep();
	public static void main(String[] args) {
		
	}
	
}

// concrete:
class Cat extends Animal {
	
	@Override 
	public void eat() {
		System.out.println("cat eats Fish");
		
	}
	public void sleep () {
		System.out.println("cat sleeps 14 hours");
		
	}
}
	
	class KingKong extends Animal {
		
		@Override 
		public void eat() {
			System.out.println("King Kong eats Humans");
			
		}
		public void sleep () {
			System.out.println("King Kong sleeps 10 hours");
			
		}	
	}
	
	class  Test {
		public static void main(String[] args) {
			KingKong obj = new KingKong();
			obj.eat();
			
			Cat obj2 = new Cat();
			obj2.eat();
		}
	
	
	
	
	
	
	
}