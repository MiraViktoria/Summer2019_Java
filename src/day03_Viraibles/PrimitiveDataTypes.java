package day03_Viraibles;

public class PrimitiveDataTypes {
/*
  byte: we can assign integers thats not a decimals (whole numbers) -128<= byte<=127
  short: we can only assign whole numbers. Must be within -32768<= short <=32767
  int: we can only assign whole numbers. Must be in -2147483648<= 
  long: only whole numbers.-90000000000000000000000000
  
  
  byte< short< int< long
  small can be assign to larger one.
  
  float: we can assign decimals (must have f at he end)
  
  double (used more often): we can assign decimals.
  
  byte, short, int, long can be all assign to float and double.
  
  
 
 * 
 */
	
	
	public static void main(String[] args) {
		byte Lenght = 3;
		System.out.println(Lenght);
		byte Width = 4;
		
		System.out.println(Width);
		//byte 9num=100; variable must start with letters only. Variable must be unique
		
		byte num_and$ = 90;
		//byte lenght = 6 variable is not unique
		byte Public = 10; //variable names can not be java reserved words 
		//byte myNum = -129; out of byte' range
		
		// short num2 =100; only whole numbers 
		//short num3 = 100000; out of range
		int num4 = -10000000;
		int num5 = 1_000_000_000; //easier to read by using underscore not commas, they are not accepted. 
		
		
		long longNumber =10l; //letter L can be used in Long only 
	    int intnum =10;
		
	
	    byte bytenum =10;
	    short shortnum = bytenum;
	    
	    short shortNumber2 =18;
	    //byte byteNumber2 = shortNumber; short is grater than byte
	    
	    int intNumber = -19876;
	    long longnumber2 = intNumber; // long is greater than int
	    	//left side of the = has to be equal or greater than the right side.
	    
	    short shortnumber3 =-30000;
	    		int intnumber3;
	    		
	    		//int exapleNum1 =10.5;
	    		float examplenum2 = 10.5F;
	    		float examplenum3 = 20.5F;
	    		
	    		double doublenum =10.5;
	    		
	    		double doublenum2 = -30.5;
	    		//float floatnumber = doublenum2; 
	    		
	    		byte bnum =10;
	    		short snum =20;
	    		int inum =30;
	    		long lnum =40;
	    		
	    		System.out.println(bnum);
	    		System.out.println(snum);
	    		System.out.println(inum);
	    		System.out.println(lnum);
	    		
	    		
	    		float fnum = bnum;
	    		float fnum2 = snum;
	    		float fnum3 = inum;
	    		float fnum4 = lnum;
	    		
	    		
	    		System.out.println(fnum);
	    		System.out.println(fnum2);
	    		System.out.println(fnum3);
	    		System.out.println(fnum4);
	    		
	    		double dnum = bnum;
	    		double dnum2 = snum;
	    		double dnum3 = inum;
	    		double dnum4  =lnum;
	    		
	    		System.out.println(dnum);
	    		System.out.println(dnum2);
	    		System.out.println(dnum3);
	    		System.out.println(dnum4);
	    		
	    		
	    		
	    
	    
	    
		
	}
}
