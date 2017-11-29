/*
 * Filename: Magazine.java
 * 
 * Purpose: This is a child class of Publications.
 * It is the Parent Class of KidsMagazine Class
 * This sets the variable common to the Magazine and KidsMagazine Classes
 * It also contains the mutators and getters for the Magazine Class.
 * Contains an implementation Print method to be set in children Classes.
 * 
 * Last Modified: 2017 November 13
 */

public class Magazine extends Publication
{
	//Frequency of Delivery per month
	private String frequency;
	private int frequencyInt;
	
	/*
	 * Magazine Constructor with input parameters for
	 * 		int pageNum - Page Number
	 * 		double thePrice - Price of Publication
	 * 		String theTitle - Title of Publication
	 * Calls parent method constructor (super) and sets
	 * frequency = 0
	 */
	public Magazine(int pageNum, double thePrice, String theTitle) 
	{
		//Call Publication constructor (super)
		super(pageNum, thePrice, theTitle);
		// Set Frequency to zero
		frequency = " ";
	} //end constructor
	
	//Frequency mutator
	public void setFrequency( String deliveryFrequency )
	{
		frequency = deliveryFrequency;
		switch (deliveryFrequency)
		{
			case "Monthly":
				frequencyInt = 12;
				break;
			case "Weekly":
				frequencyInt = 52;
				break;
			case "Biweekly":
				frequencyInt = 104;
				break;
			default:
				System.out.println("Frequency not recognized. Defaulting to Monthly");
				frequency = "Monthly";
				frequencyInt = 12;
		} //end switch statement		
	} //end setFrequency
	
	//Frequency getter
	public String getFrequency( )
	{
		return frequency;
	} //end getFrequency

	//Override of abstract Publication Print method for Magazine Class
	@Override
	public String Print() 
	{
		// TODO Auto-generated method stub
		String output = String.format("%-20s%-20s%n", "Magazine Name: ", super.getTitle());
		output += String.format("%-20s%-20s%n", "Publisher: ", super.getPublisher());
		output += String.format("%-20s%-20d%n", "Number of Pages: ", super.getPageNumber());
		output += String.format("%-20s%-20.2f%n", "Price: ", super.getPrice());
		output += String.format("%-20s%-20s%n", "Frequency: ", frequency + ". " + frequencyInt + " issues per year."  );
		
		return output;
	} //end Print

} //end class
