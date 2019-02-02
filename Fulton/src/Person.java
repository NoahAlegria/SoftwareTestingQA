
public class Person {
private String firstName;
private String lastName;

public Person(String fname, String lname)
{
	firstName = fname;
	lastName = lname;
}

public void view()
{
	 System.out.println();
     System.out.println("First Name:" + firstName);
	 System.out.println("Last Name:" + lastName);
}
}
