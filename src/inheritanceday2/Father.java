package inheritanceday2;

public class Father extends Grand
{
public void father()
{
	System.out.println("vinu");
}
public static void main(String[] args) {
	Father obj=new Father();
	obj.getGrand();
	System.out.println(obj.Name);
}
}
      