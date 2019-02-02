public class OfficeStaff extends Person
{
private boolean hourlyPaid;
private double hourlyRate;
private double  monthly_salary;

public OfficeStaff(String fName, String lName, boolean hp, double ms, double hr)
{
	 super(fName, lName);
	 hourlyPaid = hp;
	 monthly_salary = ms;
     hourlyRate = hr;

}
public void viewOfficeStaff(){
	  super.view();
	  if(hourlyPaid)
	   System.out.println("Hourly Rate:" + hourlyRate);
	  else
      System.out.println("Monthly Salary:" + monthly_salary);
	}

}