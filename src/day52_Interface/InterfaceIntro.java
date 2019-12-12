package day52_Interface;


	public interface InterfaceIntro {
	    
	    //public InterfaceIntro() {  }
	    
	    // public void methodB() { }
	    
	    public default void  methodC() {
	        
	    }
	    
	    public abstract void methodA();
	    
	    public static void mm() {
	        
	    }
	    
	    public static void main(String[] args) {
	        InterfaceIntro.mm();
	    }
	    
	    
	}
	interface Data{
	    
	    
	}
	class Test implements InterfaceIntro, Data{
//	    subtype           supertype,     supertype
	    
	    @Override
	    public void methodA() {
	        
	    }
	    
	    
	}
	//class A {
	    

	// class B extends A, Test{  }  a class can only extend one class


