
public class Constructors1 
{
	public Constructors1()
	{
		System.out.println("Default constructor creation..");
	}
	public Constructors1(int x)
	{
		System.out.println("single parameter constructor = "+x);
	}
	public Constructors1(int x,int y)
	{
		System.out.println("Two parameter constructor = "+(x+y));
	}
	
	public static void main(String[] args) 
	{
		
		Constructors1 c1=new Constructors1();
		Constructors1 c2=new Constructors1(2);
		Constructors1 c3=new Constructors1(2,3);
		
	}
	

}
