package day1;

public class ReturnType {


	public void getName() 
	{
		String name ="Bala";	
	}


	public int getAge() 
	{
		int age =100;
		System.out.println(age);
		return age;	
		
	}

	public static void main(String args[]) 
	{
		ReturnType ret=new ReturnType();
	    System.out.println(ret.getAge());
	}
} 
