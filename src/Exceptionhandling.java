

public class Exceptionhandling {

	
	
	public static void main(String[] args) {
		
		
		try 
		{
			String ages[] = {"23","34","45"};
			for(int i=0; i<ages.length; i++)
			{
				System.out.println(ages[i].toString());
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException :: Please validate the for loop");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception :: Please validate the for loop");
		}
		
		finally 
		{
			System.out.println("Am finally block");
		}
	}
}
