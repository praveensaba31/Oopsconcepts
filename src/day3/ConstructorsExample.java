package day3;

public class ConstructorsExample {

	
	public ConstructorsExample() 
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorsExample(String name) 
	{
		System.out.println("My name is ::" +name);
	}
	
	
	public void test() 
	{
		System.out.println("class method test");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method called");
		
		ConstructorsExample obj = new ConstructorsExample("Bala");
		
		obj.test();
		
		
	}
	
	
}
