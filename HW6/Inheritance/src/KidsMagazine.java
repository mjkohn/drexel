/*
 * Filename: KidsMagazine.java
 * 
 * Purpose: This is a child class of Magazine.
 * 
 * This sets the variable in the KidsMagazine Classe
 * It also contains the mutators and getters for the KidsMagazine Class.
 * Contains an implementation Print method to be set in children Classes.
 * 
 * Last Modified: 2017 November 13
 */

public class KidsMagazine extends Magazine
{
	private int ageUpperLimit;
	private int ageLowerLimit;

	/*
	 * KidsMagazine Constructor with input parameters for
	 * 		int pageNum - Page Number
	 * 		double thePrice - Price of Pubilcation
	 * 		String theTitle - Title of Publication
	 * Calls parent method constructor (super) and sets
	 * ageUpperLimit = 0
	 * ageLowerLimit = 0
	 */
	public KidsMagazine(int pageNum, double thePrice, String theTitle) 
	{
		super(pageNum, thePrice, theTitle);
		// TODO Auto-generated constructor stub
		ageUpperLimit = 0;
		ageLowerLimit = 0;
	}//end constructor
	
	//Setter for upper age limit
	public void setAgeUpperLimit( int newAgeUpperLimit )
	{
		ageUpperLimit = newAgeUpperLimit;
	}//end setAgeUpperLimit
	
	//Setter for lower age limit
	public void setAgeLowerLimit( int newAgeLowerLimit )
	{
		ageLowerLimit = newAgeLowerLimit;
	}//end setAgeLowerLimit
	
	//Getter for upper age limit
	public int getAgeUpperLimit( )
	{
		return ageUpperLimit;
	}//end ageUpperLimit
	
	//Getter for lower age limit
	public int getAgeLowerLimit()
	{
		return ageLowerLimit;
	}//end ageLowerLimit
	
	//Creates string out of lower and upper age limits for print method
	public String ageToString()
	{
		String ageString = ageLowerLimit + " to " + ageUpperLimit;
		return ageString;
	}//end ageToString
	
	//Override of Magazine print method for KidsMagazine Class
	@Override
	public String Print()
	{
		String output = super.Print();
		output += String.format("%-20s%-20s%n", "Age Range: ", ageToString() );
		
		return output;
	}//end print

}//end class
