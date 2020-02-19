package day3;

public class Conditions {

	
	public static void main(String[] args)
	{
		
		for(int i=0;i<10;i++) 
		{
			System.out.println(i);
		}
		
		String [] names = {"Bala","dileep","Praveen"};
		
		for (String name : names) {
			
			System.out.println(name);
			if(name.equals("dileep"))
			{
				break;
			}
			
		}
		/*for(int j=0; j<names.length;j++)
		{
			System.out.println(names[j]);
		}
		*/
		
	}
	
	
	
}
