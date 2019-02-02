public class TechnicalSupportStaff extends Person
{
private String technicalArea;
private boolean hourlyPaid;
private double hourlyRate;
private double  monthly_salary;

public TechnicalSupportStaff(String fName, String lName, String ta, boolean hp, double ms, double hr)
{

     super(fName, lName);
	 hourlyPaid = hp;
	 monthly_salary = ms;
     hourlyRate = hr;
     technicalArea = ta;

}
public void viewTechnicalSupportStaff()
{
		  super.view();
		  System.out.println("Technical Area:" + technicalArea);
		  if(hourlyPaid)
		   System.out.println("Hourly Rate:" + hourlyRate);
		  else
	      System.out.println("Monthly Salary:" + monthly_salary);
}

}
