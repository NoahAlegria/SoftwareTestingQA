
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program reads a file with double values, then sort the array, and finally calculate some statistics.
*/
public class dataProcessing
{
   public static double[] main(String[] args) throws FileNotFoundException
   {
      // Read Integer values from a file the data array data[]

      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      console.close();


      double[] data = new double[10];
      double[] returnedArr = new double[5];

      // Construct the Scanner and PrintWriter objects for reading and writing
      File inputFile = new File(inputFileName);
      if (inputFile.exists()) {
    	  Scanner in = new Scanner(inputFile);
      // Read the input and write the output

      //double total = 0;
    //unnecessary use of counter i???
      int i = 0;

      while (in.hasNextDouble())
      {
         data[i] = in.nextDouble();
         i++;
      }

      in.close();


     // Sort the data array
     double temp;
     int length = data.length;
     double med, var, sd, mean, sum, varsum;

     sum = 0.0;
     varsum = 0.0;
     //int size = data.length;
	 	boolean exchanged = true;
	 	for (i = 0; i < length && exchanged; i++)
	 	{
	 		exchanged = false;
	 		for (int j = length - 1; j >= i + 1; j--)
	 		{
	 			if (data[j] < data[j - 1])
	 			{
	 				temp = data[j];
	 				data[j] = data[j - 1];
	 				data[j-1] = temp;
	 				exchanged = true;
	 			}
	 		}
	 		sum += data [ i ];
	 }


	      med   = data [ length / 2 ];
	      mean = sum / (double) length;
	      for (i = 0; i < length; i++)
	      {
	           varsum = varsum  + ((data [ i ] - mean) * (data [ i ] - mean));
	      }
	      var = varsum / ( length - 1 );
	      sd  = Math.sqrt ( var );

	      System.out.println ("length:                   " + length);
	      System.out.println ("mean:                    " + mean);
	      System.out.println ("median:                 " + med);
	      System.out.println ("variance:                " + var);
          System.out.println ("standard deviation: " + sd);
      
          returnedArr[0] = length;
          returnedArr[1] = mean;
          returnedArr[2] = med;
          returnedArr[3] = var;
          returnedArr[4] = sd;
        
      }
      return returnedArr;
   }


}
