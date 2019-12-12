package day_50Abstraction;

public class Dog extends Animal{
	
	public Dog(char Gender, byte Age,String color,String Nickname) { // constructor
		super(Gender, Age, color, Nickname);
		
	}

	@Override
	public void Speak(String language) {
		System.out.println(Nickname +" speaks" + language);
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(Nickname +" eats"+  food);
		
	}

	@Override
	public void Sleep(int hours) {
		System.out.println(Nickname+ "sleeps "+ " hours");
		
	}

	@Override
	public void Drink(String drinks) {
	
		System.out.println(Nickname+ "drinks" + drinks);
	}



	
}
