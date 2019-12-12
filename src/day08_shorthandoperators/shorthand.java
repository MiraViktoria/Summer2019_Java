package day08_shorthandoperators;

public class shorthand {
	
	/*
	 * 
	 * + =: addition assignment x+=y ===>x+y
	 * - =: subtraction assignment
	 * * = Multiplication assignment  
	 *  /=: devision 
	 * % =: remainder assignment
	 *                            x% =y ===> x= x%y;
	 */
	public static void main(String[] args) {
		int a =9;
		    //a a+3; //12 
		a+=3;
		    System.out.println(a);
		    
		 int b = a+=5;
		 // 12+=5 ==> 12+5 =17
		 System.out.println(b);
		 // a=17, b =17
		 
		 int c = a+=b; //a=34, c=34, b=17
		 //      17+= 17 =34
		 System.out.println(c );
		 
		 int d = a+=c; //a=68. d 68, c=34, b =17
		 //  43+=34
		 System.out.println(d );
		 
		 int e =(d+=b)*2;
		 
		 // (68+17)*2
		 System.out.println(e);
		 System.out.println(d);
		 System.out.println(c);
		 System.out.println(b);
		 
		 
		 //d =85, b=17, e 170, c =34
		 
		 int f =b+=d*2;
		 // b+=170
		 //17+=170 ==> 187
		 System.out.println(f);
		 
		 
		 // -=:
		 int g =101;
		 int h =d-=1;//g =100, h=100
		 //101 -=1  ===>100
		 System.out.println(h);
		 
		 int i =g+=h+5; // g =205, i =205, h =100
		 //100+=100+5 ==>  205
		 System.out.println(i);
		 
		 int j =h+g % i; // h =100, j = 100
		 //     100+= 205 % 205
		 //     100+= 0
		 System.out.println(j);
				 
		 
		 int k =j -= h*2 %5;
		 
		 //      j-= 200%5
		 //     100 -=0
		 System.out.println(k);
		 
		 //*=:
		 
		 int A =100;
		 A*=200;
		 System.out.println(A);
		 //A =20000;
		 
		 int B =100;
		  B*=100/10;
		  // B *=100/10
		  
		System.out.println(B);// 1000
		
		
		B *= B-=1000;
		System.out.println(B);
		
		
		//  /=:
		
		int C =1000;
		C /=5;
		System.out.println(C);
		
		int D =10;
		//   C /= D-10; denominator cant be zero.
		System.out.println(C);
		
		C /= D+10;//  ==> 200/10 =>10 
		System.out.println(C);
		
		//%= :
		
		int z =10%3; // ==> 10/3 =3 .... remainder  10 - 3*3 =1 odd number
		int E =10;
		E %=2 ; // E =10%2
		System.out.println(E);
		
		// remainder can not be negative.
		
		int  F =100;
		F%=2; // F =F%2; ==>0 even number 
		System.out.println(F);
		
		
		System.out.println(-100%3);
		System.out.println(10.5% 3);
		// 10.5 /3 =3 remainder : 10,5 - 3*3 =1.5
		
		int J =300;
		int K = 10;
		
		
		J+= J%K;
		//J+= 0
		//300+=300
		 J += J %=K;System.out.println( J);
		 
		
		
		
		
		
		
		
		 
				 
				 
		 
		    
		    
	}
	
	
	
	
	

}
