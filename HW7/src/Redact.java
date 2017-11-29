import java.io.*;
import java.util.Scanner;

public class Redact {

	public static void main(String[] args) throws IOException
	{
		//String constant
		final String REDACT_STRING = "REDACTED";
		
		//For input file
		BufferedReader inStream = null;
		
		//For output file
		PrintWriter outFile = null;
		
		//Open Scanner
		Scanner sc = new Scanner(System.in);
		
		//Get Filename from user
		System.out.print("Input name of file to be sanitized: ");
		String fileName = sc.nextLine();
		
		//Get name/words to be removed
		System.out.print("Input string to be removed: ");
		String redactWords = sc.nextLine();
		
		//Get filename for output
		System.out.print("Input desired name of output file: ");
		String outFileName = sc.nextLine();
		
		
		//Open input file stream
		try
		{
			//Open file input stream
			inStream = new BufferedReader(new FileReader(fileName));
			
			//Open output file stream
			outFile = new PrintWriter(new FileWriter(outFileName)); 
			
		} //end try
		catch (IOException e)
		{
			System.out.println("Error performing file operations!");
			System.out.println("Exiting program!");
			System.exit(1);
		}
		
		//Read line from input file
		String line = inStream.readLine();
		
		//Output cleaned file to directory
		//Continue reading until all lines are read
		while (line != null) 
		{
			//If redactWords are found in line
			//Use .toLowerCase() for line and redactWords to ignore case
			if (line.toLowerCase().indexOf(redactWords.toLowerCase()) != -1)
			{
				//Variable to keep track of the redacted word index
				int index = 0;
				
				//Try to find first instance of redactWords
				//Use .toLowerCase() to ignore case
				index = line.toLowerCase().indexOf(redactWords.toLowerCase(), index);
				
				//Need second while loop to find multiple instances in single line
				while (index  != -1)
				{
					//Add redacted to line in location of redactWords
					line = line.substring(0, index) + REDACT_STRING + line.substring(index + redactWords.length(), line.length());
					
					//Move index
					index = line.toLowerCase().indexOf(redactWords.toLowerCase(), index + redactWords.length());
					
				} //end while (index != -1)
				
			} //end if (line.indexOf(redactWords) != -1)
			
			//Write to output file
			outFile.println(line);
			
			//read next line
			line = inStream.readLine();
			
		} //end while (line != null)
		
		//Close Scanner
		sc.close();
		
		//Close input stream
		inStream.close();
		
		//Close output stream
		outFile.close();
		
		System.out.println("File ended successfully");
	}

}
