package ArithmaticOperators;

public class day6primitivecasting {
	/*
	 *casting: converting larger primitives to smallersize
	 *datatype variablename = (datatype) value
	 *castings : Explicit &implicit
	 *
	 *explicit - from larger to smaller type.
	 *
	 *primitives: bytes,shorts, int, long, float, double
	 * 
	 * 
	 */
	 
	
	public static void main(String[] args) {
		
		int a = 10;
		byte b = (byte)  a; //explicit casting 
		System.out.println(b);
		
		double DecimalNumber =10.5;
		float FloatNumber =  (int) DecimalNumber; // double> float
		 //FloatNumber = 10;
		System.out.println( FloatNumber);
		
		long LongNum =300L;
		//IntNum =(int)LongNum;
		int IntNum = (int)LongNum;
		System.out.println(IntNum);
		
	  //implicit casting:
		byte ByteNum =100;
		int IntNum2 =ByteNum;
		
		int IntNum3 =(int) ByteNum;
		
		short ShortNum =100;
		long LongNum2 = ShortNum;
		// same with:
	 
		
		// Explicit casting practices:
		
		double LargestNumber = 100.8765;
		byte ByteValue =(byte) LargestNumber;
		 //100
		float FloatValue = (float) LargestNumber;
		// 100.8765f
		
		float FloatValue2 = (int) LargestNumber;
		float FloatValue3 = (byte) LargestNumber;
		float FloatValue4 = (short) LargestNumber;
		float FloatValue5 = (long) LargestNumber;
		
		
		
		System.out.println(ByteValue);
		
		float FloatNumber2 = 500.67f;
		
		int myNumber = (short)FloatNumber2;
		// 500
		
		
		int Num1 =100;
		int Num2 =200;
		int Num3 = 300;
		
		//int Num1 =100, int Num2=200, int Num3 =300; comma helps to do same in one line. 
		
		boolean result;
		System.out.println(); //local variables must be declared
		
		char Character1 ='A';
		System.out.println(Character1);
		
		boolean result1, result2, result3;
		
		
		
		
		
		
		
		
		
		
		
	}

}
