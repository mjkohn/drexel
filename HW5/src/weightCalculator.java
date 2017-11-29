/* Filename: weightCalculator
 * 
 * Purpose: Calculate a persons weight on all or a given planet.
 * 		    Asks user for weight input on Earth and calculates
 * 			weight using gravity factors for each planet. Then
 * 			displays calculated values to screen.
 * 
 * Last Modified: 2017 November 07
 */
import java.util.Scanner;

public class weightCalculator 
{
	public static int getInput(Scanner sc)
	{
		
		System.out.println("Enter 1 to find your weight on a given planet.");
		System.out.println("Enter 2 to see your weight on all planets.");
		System.out.println("Enter 3 to display all planets gravity factors.");
		System.out.println("Enter 4 to see this menu again.");
		System.out.println("Enter any other number to end the program.");
		
		System.out.print("Your choice: ");
		int ans = sc.nextInt();
				
		return ans;
		
	}
	
	public static double getWeight(Scanner sc)
	{
		double weight;
		
		do
		{
			System.out.print("Enter your weight on Earth, in pounds: ");
			weight = sc.nextDouble();
		
		if ( weight <= 0)
		{
			System.out.println("Please enter a weight greater than zero!");
		}
		
		} while( weight <= 0 );
		
		return weight;
	}
	
	public static void main(String[] args) 
	{
		
		//Create new Scanner object
		Scanner sc = new Scanner(System.in);
		
		String[] planets = {
							"Mars",
							"Venus",
							"Earth",
							"Mars",
							"Jupiter",
							"Saturn",
							"Uranus",
							"Neptune",
							"Pluto"
						   };
		
		double[] gravity = {
							0.39,
							0.91,
							1.00,
							0.38,
							2.87,
							1.32,
							0.93,
							1.23,
							0.03
						   };
		
		int answer;
		double weight;
		int idx;
		
		System.out.println("Welcome to the Planet weight calculator!");
		System.out.println(" -------------------------------------- ");
		
		do 
		{
			
			answer = getInput(sc);
			
			switch(answer) 
			{
			case 1:
				int planetNum;
				
				weight = getWeight(sc);
				
				do 
				{
					System.out.print("Please enter the number of planet you desire: ");
					planetNum = sc.nextInt();
					
					if (planetNum < 0 || planetNum > 8)
					{
						System.out.println("Error! Please enter a number 0 - 8");
					}
				} while (planetNum < 0 || planetNum > 8);
				
				System.out.println("Your weight on " + planets[planetNum] + " is " + weight * gravity[planetNum] + " pounds.");
				
				break;
			case 2:
				
				weight = getWeight(sc);
				
				System.out.format("%-10s%-10s%n", "Planets", "Weight");
				System.out.println("--------------------");
				for (idx = 0; idx < planets.length; idx++)
				{
					System.out.format("%-10s%-10.2f%n", planets[idx], gravity[idx] * weight);
				}
				break;
			case 3:
				System.out.format("%-10s%-20s%n", "Planets", "Gravity Factor");
				System.out.println("------------------------------");
				for (idx = 0; idx < planets.length; idx++)
				{
					System.out.format("%-10s%-20.2f%n", planets[idx], gravity[idx]);
				}
				break;
			case 4:
				//Do nothing. It will reprint the instructions
				break;
			default:
				System.out.println("Exiting the program!");
				break;
			}
			
		} while(answer >= 1 && answer <= 4);
		
		sc.close();
	}

}
