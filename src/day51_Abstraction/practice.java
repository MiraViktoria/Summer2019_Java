package day51_Abstraction;


abstract class Test{
	public Test() {  // constructor
		
	}
	
abstract void m();
    
    protected abstract void m(int a);
    
    public static void main(String[] args) {
        
    }
        
}
public class practice extends Test{
    
    // abstract void m();
    
    @Override
    void m() {
        practice obj = new practice();
    }
    
    @Override
    public void m(int a) {
        
    }
    
        final int num2 = 30;
        final static int num3 = 40;
    
    public static void main(String[] args) {
        final int num;  // constant
            num = 10;   
        System.out.println(num);
        
        
    }
}
final class A{
    
}
// class B extends A{}  final class cannot be super class
abstract class C{
    
    int num;
    static int num2;
    
    public static void main(String[] args) {
        
    }
    
    static {
        
    }
    
    {
        
    }
    
    abstract void absmethod();
    
}
abstract class D extends C{
    /*
    @Override
    void absmethod() {
        
    }
    */
}

