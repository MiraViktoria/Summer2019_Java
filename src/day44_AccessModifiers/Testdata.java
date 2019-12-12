package day44_AccessModifiers;

public class Testdata {
	
	public static String Name = "Lucia";
	public static String ID = "007";
	public static String SchoolName = "Cybertek";
	
	private static String Password = "cybertek";
	static int age = 20; // access modifier is Default
	protected double number =123;// protected modifier 
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
}


