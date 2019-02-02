import java.util.*;
public class School
{

private String schoolName;
private ArrayList <Student> students;
private ArrayList <Faculty> faculty;
private ArrayList <OfficeStaff> o_staff;
private ArrayList <TechnicalSupportStaff> ts_staff;





public School(String name)
{

 schoolName = name;
 students = new ArrayList();
 faculty = new ArrayList();
 o_staff = new ArrayList();
 ts_staff = new ArrayList();

}
public void addstudent(Student s)
{
	students.add(s);
}
public void addfaculty(Faculty f)
{
    faculty.add(f);
}
public void addofficeStaff(OfficeStaff os)
{

	o_staff.add(os);
}
public void addTSS(TechnicalSupportStaff tss)
{
	ts_staff.add(tss);
}

public void displaySchoolInfo()
{
	System.out.println("\t\t"+ schoolName);
    System.out.println("\t\t\t =============");

	for(int i=0; i<students.size(); i++)
	students.get(i).viewStudent();

	for(int i=0; i<faculty.size(); i++)
	faculty.get(i).viewFaculty();

	for(int i=0; i<o_staff.size(); i++)
	o_staff.get(i).viewOfficeStaff();

	for(int i=0; i<ts_staff.size(); i++)
	ts_staff.get(i).viewTechnicalSupportStaff();

}
}