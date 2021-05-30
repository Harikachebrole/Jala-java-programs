import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		/*Create an ArrayList of type String with 10 string elements. Add 10 string elements to
		ArrayList and perform the below operations
		Add an element to the ArrayList
		Iterate through the ArrayList by using Iterator object
		Add an element at a specific index
		Remove an element from the ArrayList, Remove at an index
		*/
		ArrayList<String> al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add(0, "j");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");
		for (String str : al) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("-------After removing elements--------");
		al.remove(2);
		al.remove("E");
		for(String str1:al)
		{
			System.out.print(str1+" ");
		}
		System.out.println();
		/*Update the element at a specific index
		Check the element is present at a particular index
		Get an element at a particular index
		Find out the size of the ArrayList
		Check the given element is present in the ArrayList
		Remove all elements of the ArrayList*/
		al.set(5,"Update element");
		String s=al.get(7);
		System.out.println("-----------After updating------------");
		for(String str2:al)
		{
			System.out.print(str2+" ");
					}
		System.out.println();
		System.out.println("getting value from index-7: "+s);
		System.out.println("size of arraylist:   "+al.size());
		boolean b=al.contains("Update element");
		System.out.println("contains element true/false:   "+b);
		al.clear();
		System.out.println("size of arraylist...."+al.size());
	}

}
