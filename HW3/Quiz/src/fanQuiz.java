/* Filename fanQuiz.java
 *
 * Purpose: Quiz to test a persons knowledge on the topic of American Football.
 *          Quiz will contain the following typed of answers:
 *           1. Multiple Choice
 *           2. Numeric
 *           3. True/False
 *
 * Last Modified 2016 Oct 16
 * 
 * Written by Michael Kohn
 * Homework 3, Problem 1
 */

import java.util.Scanner;

class fanQuiz
{
  public static void main(String args[])
  {
	  //initialize correct answer counter
	  int correct = 0;
	  
	  //Initial screen print outs to inform user about the content of the quiz
	  System.out.println("Welcome to the America Football Quiz! This Quiz will test basic football knowledge!");
	  System.out.println(" ");
	  
	  //initialize scanner
	  Scanner sc = new Scanner(System.in);
	  
	  //Question 1
	  System.out.println("1. How many points do you get for a touchdown? Please enter an integer.");
	  //Get user input
	  int points = sc.nextInt();
	  
	  //Check if points is correct
	  if (points == 6)
	  {
		  System.out.println("That is correct! You get 6 points for a touchdown!");
		  correct++;
	  }
	  else
	  {
		  System.out.println("The is incorrect. The correct answer is 6.");
	  }
	  
	  //Question 2
	  System.out.println("2. Which of these is not a real NFL team? Please enter a letter.");
	  //Possible Question 2 answers 
	  System.out.println("a. Miami Marlins");
	  System.out.println("b. Minnesota Vikings");
	  System.out.println("c. New York Giants");
	  System.out.println("d. Green Bay Packers");
	  //Get user input
	  //Tried sc.nextLine() it would just read nothing and continue on...
	  String team = sc.next();
	  //Trim leading/trailing white space, make lower case, compare to correct answer "a"
	  if (team.trim().toLowerCase().equals("a"))
	  {
		  System.out.println("Correct! The Miami Marlins are not a NFL team!");
		  correct++;
	  }
	  //Going to do else/if just to practice
	  else if (team.trim().toLowerCase().equals("b"))
	  {
		  System.out.println("Incorrect. The correct answer is a) Miami Marlins");
	  }
	  else if (team.trim().toLowerCase().equals("c"))
	  {
		  System.out.println("Incorrect. The correct answer is a) Miami Marlins");
	  }
	  //This will catch d and all other entries
	  else
	  {
		  System.out.println("Incorrect. The correct answer is a) Miami Marlins");
	  }
	  
	  //Question 3
	  System.out.println("3. You get two points for a safety. (True/False)");
	  //Compare boolean to correct answer
	  if (sc.nextBoolean() == true)
	  {
		  System.out.println("Correct! You do get 2 points for a safety!");
		  correct++;
	  }
	  else
	  {
		  System.out.println("Incorrect. You get two points for a safety");
	  }
	  
	  //Question 4
	  System.out.println("4. What is it called when the quarterback throws the ball to the other team? Please enter a letter.");
	  System.out.println("a. Intermission");
	  System.out.println("b. Incompletion");
	  System.out.println("c. Interception");
	  System.out.println("d. Inception");
	  //Get user input
	  //Tried sc.nextLine() it would just read nothing and continue on...
	  String pick = sc.next();
	  //Trim leading/trailing white space, make lower case, compare to correct answer "a"
	  if (pick.trim().toLowerCase().equals("a"))
	  {
		  System.out.println("Incorrect! The correct answer is c) Interception!");
	  }
	  //Going to do else/if just to practice
	  else if (pick.trim().toLowerCase().equals("b"))
	  {
		  System.out.println("Incorrect. The correct answer is c) Interception!");
	  }
	  else if (pick.trim().toLowerCase().equals("c"))
	  {
		  System.out.println("Correct! The answer is Interception");
		  correct++;
	  }
	  //This will catch d and all other entries
	  else
	  {
		  System.out.println("Incorrect. The correct answer is c) Interception");
	  }
	  
	  //Question 5
	  System.out.println("5. A tumble is when a player drops the ball while running. (True/False)");
	  if (sc.nextBoolean() == true)
	  {
		  System.out.println("Incorrect! Its called a fumble when a running player drops the ball");
	  }
	  else
	  {
		  System.out.println("Correct! Its called a fumble when a running player drops the ball.");
		  correct++;
	  }
	  
	  //Question 6
	  System.out.println("6. How many players are on the field for each team? Please enter an integer.");
	  //Ger user input
	  int players = sc.nextInt();
	  if (players == 11)
	  {
		  System.out.println("Correct! 11 players are on the field for each team.");
		  correct++;
	  }
	  else
	  {
		  System.out.println("Incorrect. The correct answer is 11.");
	  }
	  
	  //Question 7
	  System.out.println("7. How many yards must a team gain to get a first down? Please enter a letter.");
	  System.out.println("a. 8");
	  System.out.println("b. 10");
	  System.out.println("c. 12");
	  System.out.println("d. 17");
	  //Get user input
	  //Tried sc.nextLine() it would just read nothing and continue on...
	  String yards = sc.next();
	  //Trim leading/trailing white space, make lower case, compare to correct answer "a"
	  if (yards.trim().toLowerCase().equals("a"))
	  {
		  System.out.println("Incorrect! The correct answer is b) 10!");
	  }
	  //Going to do else/if just to practice
	  else if (yards.trim().toLowerCase().equals("b"))
	  {
		  System.out.println("Correct. The correct answer is 10!");
		  correct++;
	  }
	  else if (yards.trim().toLowerCase().equals("c"))
	  {
		  System.out.println("Incorrect! The correct answer is b) 10");
	  }
	  //This will catch d and all other entries
	  else
	  {
		  System.out.println("Incorrect. The correct answer is b) 10");
	  }
	  
	  //Question 8
	  System.out.println("8. What is the maximum number of players allowed on a NFL roster? Please enter a letter");
	  System.out.println("a. 42");
	  System.out.println("b. 47");
	  System.out.println("c. 51");
	  System.out.println("d. 53");
	  //Get user input
	  //Tried sc.nextLine() it would just read nothing and continue on...
	  String maxPlayers = sc.next();
	  //Trim leading/trailing white space, make lower case, compare to correct answer "a"
	  if (maxPlayers.trim().toLowerCase().equals("a"))
	  {
		  System.out.println("Incorrect! The correct answer is d) 53");
	  }
	  //Going to do else/if just to practice
	  else if (maxPlayers.trim().toLowerCase().equals("b"))
	  {
		  System.out.println("Incorrect! The correct answer is d) 53");
	  }
	  else if (maxPlayers.trim().toLowerCase().equals("c"))
	  {
		  System.out.println("Incorrect! The correct answer is d) 53");
	  }
	  //This will catch d and all other entries
	  else if (maxPlayers.trim().toLowerCase().equals("d"))
	  {
		  System.out.println("Correct! The correct answer is 53");
		  correct++;
	  }
	  //Catch all other entries
	  else
	  {
		  System.out.println("Incorrect! The correct answer is d) 53");
	  }
	  
	  //Question 9
	  System.out.println("9. In what city is the 2018 Super Bowl being player? Please enter a letter");
	  System.out.println("a. Denver");
	  System.out.println("b. Houston");
	  System.out.println("c. New York");
	  System.out.println("d. Minneapolis");
	  //Get user input
	  //Tried sc.nextLine() it would just read nothing and continue on...
	  String city = sc.next();
	  //Trim leading/trailing white space, make lower case, compare to correct answer "a"
	  if (city.trim().toLowerCase().equals("a"))
	  {
		  System.out.println("Incorrect! The correct answer is d) Minneapolis");
	  }
	  //Going to do else/if just to practice
	  else if (city.trim().toLowerCase().equals("b"))
	  {
		  System.out.println("Incorrect! The correct answer is d) Minneapolis");
	  }
	  else if (city.trim().toLowerCase().equals("c"))
	  {
		  System.out.println("Incorrect! The correct answer is d) Minneapolis");
	  }
	  //This will catch d and all other entries
	  else if (city.trim().toLowerCase().equals("d"))
	  {
		  System.out.println("Correct! The correct answer is Minneapolis");
		  correct++;
	  }
	  //Catch all other entries
	  else
	  {
		  System.out.println("Incorrect! The correct answer is d) Minneapolis");
	  }
	  
	  //Question 10
	  System.out.println("10. A team gets ___ tried (downs) to get a first down. Please enter an integer.");
	  int downs = sc.nextInt();
	  if (downs == 4)
	  {
		  System.out.println("Correct! A team gets 4 tries to get a first down!");
		  correct++;
	  }
	  else
	  {
		  System.out.println("Incorrect. A team gets 4 tries to get a first down!");
	  }
	  
	  //Print out number of correct answers
	  System.out.println("You got " + correct + " correct !!!");
	  //Give some feedback based on number of correct answers
	  //9 or 10 correct
	  if (correct > 8 && correct <= 10)
	  {
		  System.out.println("You know your American Football! You probably watch every Sunday!");
	  }
	  //7 or 8 correct
	  else if (correct > 6  && correct <= 8)
	  {
		  System.out.println("You're know you stuff! Good Job");
	  }
	  //5 or 6 correct
	  else if (correct > 4 && correct <= 6)
	  {
		  System.out.println("You know a little. Try to watch a few more games!");
	  }
	  //3 or 4 correct
	  else if (correct > 2 && correct <=4 )
	  {
		  System.out.println("You probably have American Football on in the background while cleaning your house on Sundays.");
	  }
	  //Less than 3 correct (0,1,2)
	  else
	  {
		  System.out.println("You have other hobbies that are much more important than watching American Football!");
	  }
	  
	  //close scanner
	  sc.close();
  } //end main
} //end Quiz Class
