/***************************************************************************************************
	*This program was made by Kip Blackard and Keerthi Dasoju
	*PhoneSelection.java
	*February 13 2019
	*This program outputs a number that corresponds to a letter on a telephone.
	***************************************************************************************************/
import java.util.Scanner;
public class PhoneSelection {
public static void main(String[] args) {
	
	char userLetter;
	
	/***************************************************************************************************
	*Declare scanner
	***************************************************************************************************/
	
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone: ");
	userLetter = scnr.next().charAt(0);
	
	/***************************************************************************************************
	*Defines algorithm for number-to-letter translation
	***************************************************************************************************/
	
	if ((userLetter == 'A') || (userLetter == 'B') || (userLetter == 'C') || (userLetter == 'a') || (userLetter == 'b') || (userLetter == 'c')) {
		System.out.println("The digit 2 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'D') || (userLetter == 'E') || (userLetter == 'F') || (userLetter == 'd') || (userLetter == 'e') || (userLetter == 'f')) {
		System.out.println("The digit 3 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'G') || (userLetter == 'H') || (userLetter == 'I') || (userLetter == 'g') || (userLetter == 'h') || (userLetter == 'i')) {
		System.out.println("The digit 4 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'J') || (userLetter == 'K') || (userLetter == 'L') || (userLetter == 'j') || (userLetter == 'k') || (userLetter == 'l')) {
		System.out.println("The digit 5 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'M') || (userLetter == 'N') || (userLetter == 'O') || (userLetter == 'm') || (userLetter == 'n') || (userLetter == 'o')) {
		System.out.println("The digit 6 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'P') || (userLetter == 'Q') || (userLetter == 'R') || (userLetter == 'S') || (userLetter == 'p') || (userLetter == 'q') || (userLetter == 'r') || (userLetter == 's')) {
		System.out.println("The digit 7 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'T') || (userLetter == 'U') || (userLetter == 'V') || (userLetter == 't') || (userLetter == 'u') || (userLetter == 'v')) {
		System.out.println("The digit 8 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else if ((userLetter == 'W') || (userLetter == 'X') || (userLetter == 'Y') || (userLetter == 'Z') || (userLetter == 'w') || (userLetter == 'x') || (userLetter == 'y') || (userLetter == 'z')) {
		System.out.println("The digit 9 corresponds to the letter " + userLetter + " on the telephone.");
	}
	else {
		System.out.println("The letter you entered is incorrect.");
	}
}
}