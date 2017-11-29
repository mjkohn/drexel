/*
 * Filename: Publication.java
 * 
 * Purpose: This is an abstract class of publications.
 * It is the Parent Class of Magazine and Book Classes
 * This sets the variable common to the Magazine and Book Classes
 * It also contains the mutators and getters for the Publication Class.
 * Contains an abstract Print method to be set in children Classes.
 * 
 * Last Modified: 2017 November 13
 */

public abstract class Publication implements Comparable <Publication>
{
	/* 
	 * Set class Variables
	 * Make private so they are only accessible from Publication class
	 */
	private int pageNumber;
	private double price;
	private String title;
	private String publisher;
	
	/*
	 * Default Constructor
	 * Sets Publication parameters:
	 * 		int pageNumber = 0
	 * 		double price - 0.00
	 * 		String title = " "
	 * 		String publisher = " "
	 */
	public Publication()
	{
		//Default Constructor
		pageNumber = 0;
		price = 0.00;
		title = " ";
		publisher = " ";
	} //end default constructor
	
	/*
	 * Publication Constructor with input parameters for
	 * 		int pageNum - Page Number
	 * 		double thePrice - Price of Pubilcation
	 * 		String theTitle - Title of Publication
	 */
	public Publication( int pageNum, double thePrice, String theTitle )
	{
		/* Constructor
		 * Requires input of Page Number, Price, and Title
		 * Sets Publisher to blank string
		 */
		pageNumber = pageNum;
		price = thePrice;
		title = theTitle;
		publisher = " ";
	} //end alternate constructor
	
	//Publisher mutator
	public void setPublisher( String pubName )
	{
		publisher = pubName;
	}//end setPublisher
	
	//Publisher getter
	public String getPublisher( )
	{
		return publisher;
	}//end getPublisher
	
	//Title mutator
	public void setTitle( String newTitle )
	{
		title = newTitle;
	}//end setTitle
	
	//Title getter
	public String getTitle( )
	{
		return title;
	}//end getTitle
	
	//Page Number mutator
	public void setPageNumber( int newPageNum )
	{
		pageNumber = newPageNum;
	}//end setPageNumber
	
	//Page number getter
	public int getPageNumber( )
	{
		return pageNumber;
	}//end getPageNumber
	
	//Price mutator
	public void setPrice( double newPrice )
	{
		price = newPrice;
	}//end setPrice
	
	//Price getter
	public double getPrice( )
	{
		return price;
	}//end getPrice
	
	//Abstract Print method
	public abstract String Print();

	//Comparable implementation
	public int compareTo(Publication other)
	{
		/*
		 * compares getTitle() against other.getTitle() and
		 * returns:
		 * negative if getTitle() < other.getTitle()
		 * zero if getTitle() == other.getTitle()
		 * positive if getTitle() > other.getTitle()
		 * 
		 * Needed to sort array of Publications on Title
		 */
		return getTitle().compareTo(other.getTitle());
	}//end compareTo

}//end class
