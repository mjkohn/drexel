/* Filename:Serengeti
 * 
 * Purpose: Run simulation of gazelle and lion populations
 * 		    in Serengeti National Park.
 * 
 * Last Modified: 2017 Oct 23
*/
//Import Scanner
import java.util.Scanner;


public class Serengeti 
{

	public static void main(String[] args) 
	{
		//Define constants
		//Fractional increase in gazelle population without competition from lions
		final double A = 0.01;
		//Fractional decrease in lion population without gazelle to eat
		final double B = 0.008;
		//Likelihood that a lion will encounter and eat a gazelle
		final double C = 0.00005;
		//Fractional increase in lion population attributed to a devoured gazelle
		final double D = 0.015;
		//Number of days to run the simulation
		final int DAYS = 1000;
		
		//Create new Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Do some initial print outs
		System.out.println("This program simulates the ecological balance between gazelle and lion populations");
		
		//Create gazelleInitial to have scope in and outside do loop
		double gazelleInitial;
		
		//Request user input, use do loop to execute at least once
		do
		{
			System.out.print("Input the initial gazelle population (value greater than zero): ");
			gazelleInitial = sc.nextDouble();
			//Check user input is at greater than zero
			if (gazelleInitial <= 0)
			{
				System.out.println("Please enter a number greater than zero!");
			}
			
		} while(gazelleInitial <= 0); //continue to execute while loop until user enters value greater than zero
		
		double lionInitial;
		//Request user input, use do loop to execute at least once
		do
		{
			System.out.print("Input the initial lion population (value greater than zero): ");
			lionInitial = sc.nextDouble();
			//Check user input is at greater than zero
			if (lionInitial <= 0)
			{
				System.out.println("Please enter a number greater than zero!");
			}
			
		} while(lionInitial <= 0); //continue to execute while loop until user enters value greater than zero
		
		//Print outs before loop
		System.out.println("Gazelle vs. Lion populations over 1000 days");
		System.out.println(" ");
		
		//Initialize vars for tomorrow calc
		double gazelleTomorrow = 0.0;
		double lionTomorrow = 0.0;
		//Initialize vars for summing populations of gazelle/lion
		double sumGazelle = 0.0;
		double sumLion = 0.0;
		//Initialize vars for determining max lion/gazelle population
		double maxGazelle = 0.0;
		double maxLion = 0.0;
		
		//Do some print outs
		System.out.println("Gazelle vs. Lion population at 100 day intervals");
		System.out.println(" ");
		
		//Set up table
		System.out.format("%-8s%10s%10s%n", "Days", "Gazelle", "Lion");
		System.out.println("---------------------------------");
		//Loop over total number of days
		for (int i = 1; i <= DAYS; i++)
		{
			//Calculate populations
			gazelleTomorrow = ((1 + A) * gazelleInitial) - (C * gazelleInitial * lionInitial);
			lionTomorrow = ((1 - B) * lionInitial) + (C * D * gazelleInitial * lionInitial);
			
			//Printout populations every 100 days
			if (i % 100 == 0)
			{
				System.out.format("%-8d%10.2f%10.2f%n", i, gazelleTomorrow, lionTomorrow);
			}
			
			//Sum up total populations
			sumGazelle += gazelleTomorrow;
			sumLion += lionTomorrow;
			
			//Find max population of lions
			if (lionTomorrow > maxLion)
			{
				maxLion = lionTomorrow;
			}
			
			//Find max population of gazelle
			if (gazelleTomorrow > maxGazelle)
			{
				maxGazelle = gazelleTomorrow;
			}
			
			//Set initial values to calculated tomorrow values for next loop
			gazelleInitial = gazelleTomorrow;
			lionInitial = lionTomorrow;
		}
		//End table
		System.out.println("---------------------------------");
		System.out.println(" ");
		
		//Do final print outs
		System.out.format("Averagel number of gazelles: %.2f%n", sumGazelle/DAYS);
		System.out.format("Average number of lions: %.2f%n", sumLion/DAYS);
		System.out.format("Max number of gazelles: %.2f%n", maxGazelle);
		System.out.format("Max number of lions: %.2f%n", maxLion);
		
		//close scanner
		sc.close();
	} //main

}//class
