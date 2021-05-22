package jala;

class Student // Class signature
{
	int id;
	String name;
	char gender;

	public void result() // method signature
	{
		System.out.println("pass");
	}

	public static void main(String[] args) {
		Student details = new Student();// object creation signature
		System.out.println(details.id = 10);
		System.out.println(details.name = "Raghavendra");
		System.out.println(details.gender = 'F');
		details.result();
	}

}
