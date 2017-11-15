/* Filename robotTester.java
 *
 * Purpose: This file will test the Robot class by
 * 			creating a robot object and executing the 
 * 			methods within the Robot class
 *          
 *
 * Last Modified 2016 Oct 16
 * 
 * Written by Michael Kohn
 * Homework 3, Problem 2 main function
 */

//Import to enable formatting of Decimals
import java.text.DecimalFormat;

public class robotTester 
{

	public static void main(String[] args) 
	{
		//Create Robot Object named rb
		Robot rb = new Robot();
		//Create new format object HW specifies to print numeric results with 2 decimal places
		DecimalFormat fmt = new DecimalFormat("#.00");
		
		//Print out the purpose of the file
		System.out.println("Testing Robot Class");
		System.out.println(" ");
		
		//Get current speed at start
		System.out.println("Current speed of robot: " + fmt.format(rb.currentSpeed()));
		
		//Move Robot a distance of 9
		rb.moveForward(9);
		
		//Get current speed after moving 9 units
		System.out.println("Current speed of robot: " + fmt.format(rb.currentSpeed()));
		
		//Time to get home
		System.out.println("Time to return home: " + fmt.format(rb.estTimeHome()));
		
		//Charge the robot
		rb.Charge(5);
		
		//Get current speed
		System.out.println("Current speed of robot: " + fmt.format(rb.currentSpeed()));

	}//end main

}//end RobotTester
