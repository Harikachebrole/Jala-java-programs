
public class Constructor2 extends Constructors1
{
public Constructor2()
{
	System.out.println("default construtor is created");
}
public Constructor2(String s)
{
	System.out.println("parameter constructor is createds "+s);
}
	public static void main(String[] args) 
	{
		Constructors1 c21=new Constructors1();
		Constructors1 c22=new Constructors1(2);
		Constructors1 c23=new Constructors1(2,3);
		Constructor2 c4=new Constructor2();
		Constructor2 c5=new Constructor2("Java Programming");
		
	}

}
