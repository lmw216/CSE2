//Liam Walsh

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
    
  public static void main(String[] args){
      
    double percent;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    double x=((new Scanner(System.in)).nextDouble());
    
    if(x<0 || x>99){
        System.out.println("You did not enter a number between 0-99");
        return;
    }
    
   System.out.println("You entered "+x+"%"); //print out the proportion remaining for select percentages
   
   double proportion = x/100;
   
   System.out.println("The proportion is " + proportion);
   
   double remaining = 1 - proportion;
   
    System.out.println("The proportion remaining is " + remaining);
   
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *      1) arg in main method needs to be args
 *      2) double percent is not needed
 *      3) need to check if input is between 0-99
 *      4) no need for if to find remaining proportion
 *
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *
 *          Any input that is not 7, 41, 14, 33, or 60
 * 
 * 
 * 
 * 
 */
