package day1;

public class Variables {

	int i =100; //class or instance variable
	static int j =90; //static variable

	static Variables obj = new Variables();

	public void sum() 
	{
		int a =10; //local variable

		System.out.println(obj.i);
	}


	public void show() 
	{
		System.out.println(j);


	}

	public static void main(String[] args) {

		System.out.println(j);



	}

}
