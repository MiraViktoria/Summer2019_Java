package day08_shorthandoperators;

public class warmup {
	
	/*
	 * write java program that converts gallons to liters.
	 * 1 gallon = 3.785 litters
	 * i litter = 1/3.785
	 */
	
	
	
	public static void main(String[] args) {
		
		int gallon =100;
		double liters = gallon * 3.785; // convert gallons to liters
		
		String result1 = gallon + "gallons equal to" + liters + "litters";
		
		System.out.println(gallon + "gallons equal to" + liters+ "litters");
		
		double L =100;
		double G = L/3.785; // 100/3.785
		//string result2 = L + " Litters equal to "+ G +" gallons "; 
		
		System.out.println(L + " Litters equal to "+ G +" gallons "); 
		
		
		
	 
		
	}

}
