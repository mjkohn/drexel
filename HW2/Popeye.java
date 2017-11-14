/* Filename: Popeye.java
 * 
 * Description: Calculates Popeye's travel time and distance in miles
 *
 * Last Modified: 2017 Oct 7
 */

class Popeye
{
  public static void main(String args[])
    {

      //Declare constants
      //Conversion for Nautical miles to miles
      final float NAUTICAL_MILES_TO_MILES = 1.1508F;
      //Max speed in knots
      final float MAX_SPEED = 5.8F;
      //Average speed in knots
      final float AVE_SPEED = 4.0F;
      //Distance in nautical miles
      final float DISTANCE = 18.0F;

      //Print out init messages to screen
      System.out.println("Popeye's travel time calculator!");
      System.out.println("Program calculates distance in miles from a distance give in nautical miles.");
      System.out.println("The program also calculates the travel time for the given distance at the top and average speeds.");
      System.out.println(" ");
      
      //Do the calculations and print outs
      //Print out original distance in nautical miles
      System.out.println("The distance in nautical miles is: " + DISTANCE);

      //Calculate miles from nautical miles
      float miles = DISTANCE * NAUTICAL_MILES_TO_MILES ;
      //Print out miles
      System.out.println("The equivalent in regular miles is: " + miles);

      //Calculate best travel time
      float best_time = DISTANCE / MAX_SPEED;
      //Print out best travel time
      System.out.println("The best case travel time is: " + best_time + " at " + MAX_SPEED + " knots.");

      //Calculate average time
      float ave_time = DISTANCE / AVE_SPEED;
      //Print out average time
      System.out.println("The average case travel time is " + ave_time + " at " + AVE_SPEED + " knots.");

    } // end main
} // end class

