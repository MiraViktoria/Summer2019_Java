package Day4_Viriables;

 

public class PrimitivDataTypes2 {
	/*
	
	Primitives: byte, short, int, long, float, boolean, char
	
	boolean: takes only true or false results 
	
	ASCII table is an  universal "alphabet" of all computers. ASCII have corresponding number to represent it.
	
	
	char: declared within a single quote ''; single character only. '' is a must when you give character values.
	char value can be assigned to: byte, short, int, long, float, double
	byte a ='a';
	short b ='b';
	int c = 'c';
	long d = 'd';
	float f ='f';
	double e ="e';
	result will correspond with numbers from ASCII.
	
	*/
	
public static void main(String[] args) {
	boolean result = true;
	boolean result2 = false;
	boolean result3 = 9 > 3; // boolean expressions and returns are true or false. true or false can be boolean 
 

	
	System.out.println(result);
	System.out.println(result2);
	System.out.println(result3);
	
	
	//char: single character only.
	char char1 ='a'; // prints it as it is
	System.out.println(char1);
	char char2 = '9';
	char char3 = '*';
	
	System.out.println("\n\n" );
	
	//char with numbers
	char char4 = 67; //will print character of this corresponding number
	System.out.println(char4);
	
	char char6 ='{';
	char char7 = 123;
	System.out.println(char7);// character from corresponding number 123. 
	
	// initializing char to other primitives; byte, short, int, float, long, double. 
	
	char MyChar1 = 'b';
	
	int MyInt ='b'; // the number that represents b is initialized to int.
	System.out.println(MyInt); // 98 from ASCII table represents b 
	
	//byte MyByte = MyChar1; // char =2 bytes of memory, but byte takes 1 bytes. thats why there is compiling mistake.
	byte MyByte2 ='b'; // 'b' corresponding number is 98.
	 
	//short ShortNumber = MyChar1; // char memory could be bigger than short, range is greater. 
	short ShortNum2 = 'b'; // 'b' corresponding number is 98 from ASCII
	System.out.println(ShortNum2);
	
	long LongNum = MyChar1; // long memory is 8 bytes
	long LongNum2 = 'b';// 98
	
	System.out.println(LongNum);
	
	float floatNum = MyChar1;
	float floatNum2 = 'b';
	System.out.println(floatNum2);
	
	double doubleNum = MyChar1;
	double doubleNum2 = 'b';
	System.out.println(doubleNum2); //98.0 
	
	
	 //Java is case sensitive 
	
	char mycharValue = 36000;
	System.out.println(mycharValue);
	
	int    i = 100;                   //line 1

	float  f = 200f;             //line 2

	double d = 300L;      //line 3

	 
 
	
	
	
	
	
	
		 
	
	
	
}
	
	
	
	

}
