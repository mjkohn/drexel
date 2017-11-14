/* Filename: Magictrick.java
 *
 * Purpose: Do a magic trick! The user enters a number, calculates the difference, and picks a non-zero 
 *          digit from the difference. The user then enters the remaining 3 numbers and the magic finds
 *          the remaining digit. 
 *
 * Last Modified: 2017 Oct 9
 */

//Import Scanner utility to read user input
import java.util.Scanner;

class Magictrick
{
  public static void main(String args[])
  {

    //Declare constatns
    final int ONE_THOUSAND = 1000;
    final int ONE_HUNDRED = 100;
    final int TEN = 10;

    //Create Scanner Object
    Scanner sc = new Scanner(System.in);

    //Prompt user to enter input
    System.out.println("Enter a 4 digit number: ");
    //Read user input
    int ui = sc.nextInt();

    //Print out original number
    System.out.println("The original number: " + ui);

    //Determine digits in ones, tens, hundreds and thousand position
    //Ones position
    int ones = ui % TEN;
    //Tens position
    int tens = (ui / TEN) % TEN;
    //Hundreds position
    int hundreds = (ui / ONE_HUNDRED) % TEN;
    //Thousands position
    int thousands = (ui / ONE_THOUSAND) % TEN;

    //Scramble numbers 
    int scramble1 = (ones * ONE_THOUSAND) + (tens * ONE_HUNDRED) + (thousands * TEN) + hundreds;
    int scramble2 = (tens * ONE_THOUSAND) + (ones * ONE_HUNDRED) + (hundreds * TEN) + thousands;
    //Print out scrambled numbers and give user instructions
    System.out.println("I have scrambled your number into two new numbers " + scramble1 + " and " + scramble2);
    System.out.println("Now subtract the smaller from the larger, and secretly pick a non-zero digit from the difference.");

    //Read in the three digits from the difference
    System.out.println("Enter the other three digits in any order (hit enter after each digit): ");
    int diff1 = sc.nextInt();
    int diff2 = sc.nextInt();
    int diff3 = sc.nextInt();

    //Calcule the remainder of the sum
    int rem = (diff1 + diff2 + diff3) % 9;

    //Calculate the Magic Digit
    int magic_digit = 9 - rem;

    //Display the magic digit
    System.out.println("Magic digit is: " + magic_digit);

  } //end main
}  //end class
