import java.util.HashSet;

public class Collection3 {

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("G");
		System.out.println("...print all values...");
		System.out.println(hs);
		for(String s:hs)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("....Remove element....");
		System.out.println(hs.remove("D"));
		for(String s:hs)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("size of hashset is");
		System.out.println(hs.size());
		System.out.println(hs.clone());
		System.out.println(hs.contains("z"));
		System.out.println(hs.isEmpty());
				
	}}