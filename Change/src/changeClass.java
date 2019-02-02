import java.util.Scanner;
import java.lang.Math;

public class changeClass {
	/*public static void main(String[] args)
	  {
	   Scanner scan = new Scanner(System.in);
	   double cost, paidAmount;
	   int[] changes = new int[5];
	   System.out.println("Please enter the cost:");
	   cost = scan.nextDouble();

	   System.out.println("Please enter the paid amount:");
	   paidAmount = scan.nextDouble();

	   changes=changeCalc(paidAmount, cost);

	   for(int i=0; i<5 ; i++)
	   {
		   System.out.println(changes[i]);
	   }


	  }*/

	  public static int[] changeCalc(double paid, double cost)
	  {

	  	 double temp = (double)Math.round(((paid - cost)*100.0));
	  	 int change = (int)temp;
	  	 int dollars=0, quarters=0, dimes=0, nickles=0, pennies=0;
	  	   int[] changes = new int[5];


	  	   if(change > 0)
	  	   {
	  		   dollars=change/100;
	  		   if (dollars > 0)
	  		   {
	  			   changes[0]=dollars;
	  		   }
	  		   
	  		   change = change%100;
	  		   quarters = change/25;
	  		   if (quarters > 0) {
	  			   changes[1]=quarters;
	  		   }
	  		   change = change%25;

	  		   dimes = change/10;
	  		   if (dimes > 0)
	  		   {
	  			   changes[2]=dimes;
	  		   }
	  		   change = change%10;

	  		   nickles = change/5;
	  		   if (nickles > 0) {
	  			   changes[3]=nickles;
	  		   }
	  		   
	  		   pennies = change%5;
	  		   if (pennies > 0) {
	  			   changes[4]=pennies;
	  		   }
	      }

	     return changes;

	}
}
