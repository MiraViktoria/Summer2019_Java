package day_50Abstraction;

public class Zoo {

	public static void main(String[] args) {
	Cat Cleo = new Cat('F', (byte) 5, "White&black", "Cleo");
	//System.out.println("Name is " +Cleo.Nickname);
	//System.out.println("Gender is " +Cleo.Gender);
	//System.out.println("Color is "+Cleo.color);
	//System.out.println("Age is "+Cleo.Age);
	
	
	System.out.println("=============================");
	Cleo.getInfo();
	
	Cat Misha = new Cat( 'F',(byte)6, "White&grey", "Misha");
	Misha.getInfo();
	Misha.Sleep(15);
	Misha.Eat("chiken");
	Misha.Drink("milk");
	Misha.Speak("english");
	
	System.out.println("\n =============================");
	
	Dog Pongo = new Dog('M', (byte)8, "golden","Pongo");
	Pongo.getInfo();
	Pongo.Sleep(15);
	Pongo.Eat("beef");
	Pongo.Drink("wine");
	Pongo.Speak("woof");
	
	System.out.println("\n =============================");
	
	
	
	Dog Tuzik = new Dog('M', (byte)12, "Black", "Tuzik");
	
	Tuzik.getInfo();
	Tuzik.Sleep(15);
	Tuzik.Eat("Hot dog");
	Tuzik.Drink("Red bull");
	Tuzik.Speak("woof");
	
	System.out.println("\n =============================");
	
	
	Dog[] dog = {Pongo, Tuzik};
	Cat[] cat = {Misha, Cleo};
	
	dog[1].getInfo();
	
	
	/*
	 Abstract class: countries
	     data: name, flag, language, population, religion
	     
	      create constructor that can sat all that data.
	     
	     Actions(abstract): export(), import(), economy(), currency()..
	     
	      sub class: South Korea
	                 USA
	                 Kazakhstan
	                 New Zeland
	                 Russia
	                 Turkey
	                 .....
	                 
	                 
	                 abstract method, inheritance, abstract class, method overriding
	 */
	
}
}