/* Filename Robot.java
 *
 * Purpose: Defines Robot Class and associated methods
 *            The following methods are defined:
 *            1. Charge
 *            2. currentSpeed
 *            3. moveForward
 *            4. estTimeHome 
 *           
 *
 * Last Modified 2016 Oct 16
 * 
 * Written by Michael Kohn
 * Homework 3, Problem 2 Robot Class
 */

public class Robot 
{
	//Create variables
	private int distanceTraveled;
	private double batteryLevel;
	
	//Constructor to initialize variables
	public Robot()
	{
		//Initialize distance traveled and battery level
		distanceTraveled = 0;
		batteryLevel = 3.0;
	}
	
	//Define charging method for Robot Class
	public double Charge (int battIncrease)
	{
		//Method adds parameter battIncrease to current battery level
		return batteryLevel += battIncrease;
	}
	
	//Define method to calculate current speed
	public double currentSpeed()
	{
		//Returns speed which is (batteryLevel^2) * 2
		return (batteryLevel * batteryLevel) * 2;
	}
	
	//Instructions in HW are incorrect. Input param must be double or 
	//distance/(distance + 1) will equal zero
	public void moveForward (double distance)
	{
		//Adds distance input parameter to current distance
		distanceTraveled += distance;
		
		//Reduces battery level based on distance traveled
		batteryLevel = batteryLevel * (1 - distance/(distance + 1));
	}
	
	//Defines estimated time home method
	public double estTimeHome()
	{
		//Estimates travel time home based on distance traveled and current speed
		return distanceTraveled/(batteryLevel * batteryLevel *2);
	}
	
}//end Robot class
