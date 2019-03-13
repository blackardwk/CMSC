import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab8
{
   public static void main(String[] args) throws FileNotFoundException
   {
      
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();
 

      File inputFile = new File(inputFileName);
      Scanner scnr = new Scanner(inputFile);
      PrintWriter out = new PrintWriter(outputFileName);


       double total = 0;
	   double shots = 0;
	   int goals =0;
	   int minGoals = 100000; 
	   int maxGoals = 0; 
	   int count = 0;
	   double avgShots = 0;
	   String minTeamName = "";
	   String maxTeamName = "";
	   String teamName = "";

	   scnr.useDelimiter("\t");
	   
	   
	   while (scnr.hasNext()) {
	   
	  
	   teamName = scnr.next();
	   goals = scnr.nextInt();
	 
	   shots = scnr.nextDouble();
		   if (goals > maxGoals) {
			   maxGoals = goals;
			   maxTeamName = teamName;
		   }
		   else if (goals < minGoals) {
			   minGoals = goals;
			   minTeamName = teamName;

		   }
				total += shots; 
				count++; 

   }
   avgShots = total / count;
   out.println("Maximum goals Scored: " + maxTeamName + " " + maxGoals);
   out.println("Minimum goals Scored: " + minTeamName + " " + minGoals);
   out.println("Average shots per game: " + avgShots);
		out.close();
		scnr.close();
   }
	   
}