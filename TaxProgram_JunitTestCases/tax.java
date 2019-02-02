import java.util.Scanner;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.*;
import java.util.List;


public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	     int dep;
	     double income;

	     dep=scan.nextInt();
	     income=scan.nextDouble();

	     System.out.println(taxCalculation.calculateTax(income, dep));
	     
	      //Running test cases using JunitCore
	      JUnitCore jUnitCore = new JUnitCore();
	      Result result = jUnitCore.run(testTax.class);
	      System.out.println(result.getFailureCount());
	      
	      List<Failure> failures= result.getFailures();
	      
	      for (Failure each : failures)
	    	  System.out.println(each.toString());
	      
	}

}
