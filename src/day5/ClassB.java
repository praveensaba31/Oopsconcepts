package day5;

public class ClassB extends ClassA{

	
	public void getMobileNo(String no)
	{
		System.out.println("+91 "+no);
	}
	
	public static void main(String[] args) {
		
		ClassB objB = new ClassB();
		objB.getMobileNo("94859386");
	}
}
