
public class Constructoraccss3 {
	
	public Constructoraccss3()
	{
      System.out.println("Using public acess modifier constructor");
	}
	Constructoraccss3(String s)
	{
		System.out.println("Using default acess modifier constructor " +s);	
	}
	private Constructoraccss3(int x)
	{
		System.out.println("Using private acess modifier constructor " + x);
}
protected Constructoraccss3(int x,int y)
{
	System.out.println("Using protected acess modifier constructor "+(x+y));
}
	public static void main(String[] args)
	{
		Constructoraccss3 c31=new Constructoraccss3();
		Constructoraccss3 c32=new Constructoraccss3("java");
		Constructoraccss3 c33=new Constructoraccss3(5);
		Constructoraccss3 c34=new Constructoraccss3(100,100);
	}

}
