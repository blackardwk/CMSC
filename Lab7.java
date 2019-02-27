import java.util.Scanner;

public class Lab7 {
		
		// TODO Auto-generated method stub
		  
		   public static void main(String[] args) {
		     // variable declarations for part 1
		     String title;
		     String firstName;
		     String lastName;
		     Scanner in = new Scanner(System.in);
		     
		     // prompt for input for part 1
		     System.out.print("Enter a title:");
		     title = in.next();
		     System.out.print("Enter your first name:");
		     firstName = in.next();     
		     System.out.print("Enter a your last name:");
		     lastName = in.next();
		     
		     // call the method for part 1
		     greeting(title, firstName, lastName);
		     
		     // variable declarations for part 2
		     int number1;
		     int number2;
		     
		     // user prompts for part 2
		     System.out.print("Enter first number:");
		     number1 = in.nextInt();
		     System.out.print("Enter second number:");
		     number2 = in.nextInt();
		     
		     // call the methods max and sumTo inside the println statement
		     System.out.println("The largest number is " + max(number1, number2));
		     System.out.println("The sum of the numbers is " + sumTo(number1, number2));
		 }
		   // end of main method
		   
		 /******************** greeting method goes here*********************/
		  
		 public static void greeting(String title, String firstName, String lastName) {
			 System.out.println();
			 System.out.println("Dear " + title + " " + firstName + " " + lastName + ",");
			 System.out.println();
		 }
		 
		 
		  
		  
		  
		  /***********************end of method*************************/
		  
		  /******************** max method goes here*********************/
		  
		  public static int max(int num1, int num2) {
			  if (num1 > num2) {
				  return num1;
			  }
			  if (num2 > num1) {
				  return num2;
			  }
			  else {
				  return num1;
			  }
			  }

		  
		  
		  /***********************end of method*************************/
		   
		  /******************** sumTo method goes here*********************/
		  
		  
		  public static int sumTo(int num1, int num2) {
			  int findMax;
			  int findMin;
			  if (num1 > num2) {
				  findMax = num1;
				  findMin = num2;
				
			  }
			  else if (num2 > num1) {
				  findMax = num2;
				  findMin = num1;
			
			  }
			  else {
				  return num1; 
			
			  }
			  
			  int findSum = 0;
			  for (int i = findMin; i <= findMax; i++) {	  
				  findSum += i;
			  }
			  return findSum;
			  }
				  
		  
		  
		  /***********************end of method*************************/
		}
	


