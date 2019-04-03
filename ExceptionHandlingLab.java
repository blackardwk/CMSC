import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionHandlingLab {
		
		public static void main(String[] args) throws FileNotFoundException {
		     
		/**************************************************************************
		* Expect the user to enter a file containing numeric month numbers from the command line
		*************************************************************************/
		Scanner in = new Scanner(System.in);

		String inputFileName;
		File inputFile;
		Scanner input = null;
		if (args.length != 0) {
			inputFileName = args[0];
			inputFile = new File(inputFileName);
			input = new Scanner(inputFile);
			
		}
		else {
	         System.out.println("Enter an input file");
	         inputFileName = in.next();
	         boolean fileWorks = false;
	         while(!fileWorks) {
	        	 try {
	        		 inputFile = new File(inputFileName);
	        		 input = new Scanner(inputFile);
	        		 fileWorks = true;
	        	 }
	        	 catch(FileNotFoundException e){
	        		 System.out.println("Enter an input file");
	        	 }
	         }
		}

		/***************************************************************************
		* loop through the file taking a month and a year and determining the days for that month
		****************************************************************************/
		while (input.hasNext()) {
			boolean goodNumbers = false;
			int month = 0, year = 0;
			while(!goodNumbers) {
				try {
					month = input.nextInt();
					year = input.nextInt();   
					if(month > 12 || month < 1) {
						System.out.println("Month must be between 1 and 12");
					} else if (year < 0) {
						System.out.println("Year cannot be negative");
					} else {
						goodNumbers = true;
					}
					
				}
				catch(InputMismatchException e) {
					System.out.println("Not an integer");
				}
			}
			
		
		/*************************************************************************
		* determine the number of days in the month
		**************************************************************************/
			int numDays = getDays(month, year);

		/*************************************************************************
		* display number of days in the month
		**************************************************************************/
			System.out.println("There are " + numDays + " days in this month.");
		}// end while loop   
		input.close();
	}// end main
			   
		/************************************************************
		* method to determine the days for the given month and year
		************************************************************/
		private static int getDays(int mon, int yr) {
			int numDays = 0;
			     
			switch(mon) {
			case 2: // February
			numDays = 28;
			if (yr % 4 == 0) {
			numDays = 29;
			if (yr % 100 == 0 && yr % 400 != 0)
			numDays = 28;
		}
		break;
			         
			       case 4:   //April
			       case 6:   // June
			       case 9:   // September
			       case 11:  // November
			         numDays = 30;
			         break;
			         
			       default: numDays = 31;  // all the rest
			     }
			     return numDays;
			   }

	

	}
