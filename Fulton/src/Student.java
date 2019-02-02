public class Student extends Person
{
private String major;
private double gpa;
private String academicLevel;


public Student(String fName, String lName, String al, String m, double gp)
{
  super(fName, lName);
  major = m;
  gpa = gp;
  academicLevel = al;

}
public void viewStudent()
{
	super.view();
	System.out.println("Major:" + major);
	System.out.println("GPA :" + gpa);
	System.out.println("academic Level :" + academicLevel);
}


}
