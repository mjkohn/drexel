/* Filename: evenFinder
 * 
 * Purpose: Find the even numbers and the
 * 		    total count of even numbers
 * 			between a user provided number
 * 			and zero.
 * 
 * Last Modified: 2017 Oct 24
 * 
 */

//Import Scanner
import java.util.Scanner;

public class evenFinder 
{
	//Method prints out the even numbers and returns the total count of numbers
	//to main method
	public static int Evens(int n)
	{
		/* 
		 * Method: Evens
		 * 
		 * Purpose: Recursive method that prints out the even
		 * 		    numbers and returns the total count of 
		 * 		    even numbers
		 * 
		 * Inputs: n - integer 
		 * 
		 * Return: integer - total count of even numbers
		 * 					from initial n to zero
		 */
		//n == 0 is base case
		if (n == 0)
		{
			//This will print out zero and move to new line
			System.out.format(" %d%n", n);
			//Return 1 to add to total count
			return 1;
		} //if
		//Non base case
		else
		{
			//Check if number is even
			if (n % 2 != 0)
			{
				//Number is not even! Subtract 1
				n -= 1;
			}
			
			//Print out even number
			System.out.format(" %d", n);
			
			//Recursive call since this is not base case
			//Subtract 2 to start with even number
			//Adds 1 plus value from recursive call
			return 1 + Evens(n-2);
			
		} //else
		
	}//Evens method
	
	public static void main(String[] args) 
	{
		//Create new Scanner object
		Scanner sc = new Scanner(System.in);
		
		int number;
		//Do loop to get user input.
		do
		{
			//Prompt user for input
			System.out.print("Enter a positive integer of 0 to end: ");
			//Read in number
			number = sc.nextInt();
			
			//Check for less than zero
			if (number < 0)
			{
				//Print error statement
				System.out.println("Error! Please enter a number larger than zero");
			}
			//Check for exit condition
			else if (number == 0)
			{
				System.out.println("Exiting the program");
			}
			//Print the even numbers and get the total evens
			else
			{
				//Print and find number of even integer
				System.out.print("The even integers between 0 and " + number + " are: ");
				
				//Get total number of even numbers
				int result = Evens(number);
				
				//Print results
				System.out.println("There are " + result + " integers between 0 and " + number);
				System.out.println(" ");
			}
			
			
		} while(number != 0); //equal to zero is the exit case
		
		//Close scanner
		sc.close();

	}//main

}//class
