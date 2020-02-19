package oops;

public class Sum {
	int a=10;
	int b =100;
	static int c;

	public void name() { 
		System.out.println(a);

		a=100;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Sum test=new Sum();
	    test.name();
		System.out.println(c=test.b + test.a);
	}
}   

