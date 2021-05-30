import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collections2 {

	public static void main(String[] args) 
	{
		/*Create a HashMap with at least 10 key value pairs of the Student ID and Name
		Insert a Key value mapping into the map
		Fetch the value of a Key
		Create a clone/copy of HashMap
		Check if the given Key is in the Map
		Check if the value is in the Map
		Check if the map is empty*/
		HashMap<Integer,String> hm=new HashMap<>();
		HashMap<Integer,String> hm2=new HashMap<>();
		hm.put(1,"Aravind" );
		hm.put(2, "Vani");
		hm.put(3, "Karthik");
		hm.put(4, "Radha");
		hm.put(5,"Harika");
		hm.put(6, "bhavana");
		hm.put(7, "manasa");
		hm.put(8,"krishna");
		hm.put(9, "sai");
		hm.put(10, "Bhargav");
		for(Map.Entry m : hm.entrySet())
				{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println("----Fetching the value----");
System.out.println(hm.get(1));
System.out.println("----clone the value----");
System.out.println(hm.clone());
System.out.println("----Check if the given Key is in the Map----");
System.out.println(hm.containsKey(8));
System.out.println("----Check if the value is in the Map----");
System.out.println(hm.containsValue("Radha"));
System.out.println("---Check if the map is empty---");
System.out.println(hm.isEmpty());
/*Print the size of the Map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map*/
System.out.println("---Print the size of the Map to the console---");
System.out.println(hm.size());
System.out.println("---Print all the Keys of the map to the console---");
for(Integer i:hm.keySet())
{
System.out.print(i+" ");
}
System.out.println();
for(String s:hm.values())
{
	System.out.print(s+" -- ");
}
System.out.println();
System.out.println("Remove a specific Key-value pair");
System.out.println(hm.remove(5, "Harika"));
for(Integer i:hm.keySet())
{
System.out.print(i+" ");
}
System.out.println();
for(String s:hm.values())
{
	System.out.print(s+" -- ");
}
System.out.println("----Copy all the elements of the Map to another Map----");
hm2.putAll(hm);
System.out.println(hm2);

	}

}
