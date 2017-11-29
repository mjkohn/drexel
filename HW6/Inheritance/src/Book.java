/*
 * Filename: Book.java
 * 
 * Purpose: This is a child class of Publications.
 * 
 * This sets the variable common to the Book Class
 * It also contains the mutators and getters for the Book Class.
 * Contains an implementation Print method to be set in children Classes.
 * 
 * Last Modified: 2017 November 13
 */

public class Book extends Publication
{
	private String author;

	/*
	 * Magazine Constructor with input parameters for
	 * 		int pageNum - Page Number
	 * 		double thePrice - Price of Pubilcation
	 * 		String theTitle - Title of Publication
	 * Calls parent method constructor (super) and sets
	 * author = " "
	 */
	public Book(int pageNum, double thePrice, String theTitle) 
	{
		super(pageNum, thePrice, theTitle);
		author = " ";
	}//end constructor
	
	//Author mutator
	public void setAuthor( String newAuthor )
	{
		author = newAuthor;
	}//end setAuthor
	
	//Author getter
	public String getAuthor( )
	{
		return author;
	}//end getAuthor

	//Override of abstract Publication Print method for Magazine Class
	@Override
	public String Print() 
	{
		// TODO Auto-generated method stub
		String output = String.format("%-20s%-20s%n", "Book Title: ", super.getTitle());
		output += String.format("%-20s%-20s%n", "Publisher: ", super.getPublisher());
		output += String.format("%-20s%-20.2f%n", "Price: ", super.getPrice());
		output += String.format("%-20s%-20s%n", "Author: ", author);
		
		return output;
	}//end print

}//end class
