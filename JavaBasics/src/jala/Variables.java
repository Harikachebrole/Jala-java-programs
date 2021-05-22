package jala;

public class Variables {

	public int a = 30; // global variable

	public static void main(String[] args) {
		Variables v = new Variables();
		int a = 10; // local variable
		System.out.println("Value of non-static variable is: " + a); // accessing the non-static variable
		System.out.println("Value of static variable is:" + v.a); // accessing the static variable
	}
}