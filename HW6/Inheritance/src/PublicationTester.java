/*
 * Filename: PublicationTester.java
 * 
 * Purpose: To test the Publication parent class along with
 * the Magazine, KidsMagazine, and Book Children Classes.
 * 
 * Last Modified: 2017 November 13
 */

import java.util.Arrays;

public class PublicationTester 
{

	public static void main(String[] args) 
	{
		//Declare new Array of Publications
		Publication[] p = new Publication[5];
		
		//Fill array
		p[0] = new Magazine(100, 5.99, "WIRED");
		p[1] = new KidsMagazine(25, 15.00, "National Geographic Kids");
		p[2] = new Book(325, 9.99, "The Art of Manliness: Classic Skills and Manners for the Modern Man");
		p[3] = new Magazine(74, 11.99, "National Geographic");
		p[4] = new Book(385, 12.79, "Ready Player One");
		
		//Set Magazine in location 0
		//Set deliver Frequency
		((Magazine)p[0]).setFrequency("Monthly");
		//Set publisher for Magazine in p[0]
		((Magazine)p[0]).setPublisher("Conde Nash Publications");
		
		//Set Kids Magazine in location 1
		//Set Lower Age Limit for p[1]
		((KidsMagazine)p[1]).setAgeLowerLimit(3);
		//Set Upper Age Limit for p[1]
		((KidsMagazine)p[1]).setAgeUpperLimit(5);
		//Set delivery frequency for p[1]
		((KidsMagazine)p[1]).setFrequency("Biweekly");
		//Set publisher for p[1]
		((KidsMagazine)p[1]).setPublisher("National Geographic Society");
		
		//Set Book in location 2
		//Set author for p[2]
		((Book)p[2]).setAuthor("Brett and Kate McKay");
		//Set publisher for p[2]
		((Book)p[2]).setPublisher("Adams Media");
		
		//Set Magazine in location 3
		//Set delivery frequency for p[3]
		((Magazine)p[3]).setFrequency("Weekly");
		//Set pubilsher for p[3]
		((Magazine)p[3]).setPublisher("National Geographic Society");
		
		//Set Book in location4
		//Set author for p[4]
		((Book)p[4]).setAuthor("Ernest Cline");
		//Set publisher for p[4]
		((Book)p[4]).setPublisher("Random House");
		
		System.out.println("Initial, unsorted list of books");
		System.out.println("=================================");
		for (int i = 0; i < p.length; i++)
		{
			String outString = p[i].Print();
			System.out.println("********************************");
			System.out.print(outString);
			System.out.println("********************************");
		}
		System.out.println("=================================");
		System.out.println(" ");
		
		Arrays.sort(p);
		
		System.out.println("Publications sorted by Title");
		System.out.println("=================================");
		for (int i = 0; i < p.length; i++)
		{
			String outString = p[i].Print();
			System.out.println("********************************");
			System.out.print(outString);
			System.out.println("********************************");
		}
		System.out.println("=================================");
		
		
	}

}
