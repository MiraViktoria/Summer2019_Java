package day45_Inheritance;

class TestBase{
	static String chromeDriver="Chrome";// default
	
	public static void TakeScreenShot() {
		System.out.println("Took screenshot");
		
	}
	private static void closeBrowser() {
		System.out.println("Browser closed"); // its not visible means not inheritable.
	}
}

public class Inheritance extends TestBase {
         //sub                   //super
	/*
	 * static String chromeDriver;                  //       invisible in this class, inherited from TestBase.
	 * 
	 * public static void TakeScreenShot() {
		System.out.println("Took screenshot");
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println(chromeDriver);
		
		TakeScreenShot();
		
	}
	
	
	
	
}
