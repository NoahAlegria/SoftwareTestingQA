import java.util.*;
public class university
{

  public static void main(String[] args)
  {

     School engSchool = new School("Fulton Schools of Engineering");

	 Student s = new Student("John", "William", "Freshman", "CS/CSE", 3.5);
	 Faculty f = new Faculty("Janaka", "Balasooriya", "CIDSE", "SOA", false, 1000.00, 0);
	 OfficeStaff os= new OfficeStaff("Nancy", "Wilfred", true , 0, 20.00);
	 TechnicalSupportStaff ts = new TechnicalSupportStaff("Chris", "Kevin" , "Database", false, 12000.50, 0);

	 engSchool.addstudent(s);
	 engSchool.addfaculty(f);
	 engSchool.addofficeStaff(os);
	 engSchool.addTSS(ts);

	 engSchool.displaySchoolInfo();



  }

}