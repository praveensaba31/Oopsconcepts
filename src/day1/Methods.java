package day1;

public class Methods {
	
	

	public void sumOfThreeNumber() 
	{
		System.out.println("the sum of 3 numbers");
	}
	
	
	public static void sumOfFourNumber() 
	{
		System.out.println("the sum of 4 numbers");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("I Am Main Method");
		
		sumOfFourNumber();
		
		Methods obj = new Methods();
		
		obj.sumOfThreeNumber();
		
		sumOfFourNumber();
	}
	
}
