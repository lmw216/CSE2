//Liam Walsh
//September 10,2014
//CSE002-111
//HW03-Bicyle

//Purpose: The program is like the cylometer program, however instead of hard code, this program will 
//         ask the user to input the number of counts on the cyclometer then the time it took. The program
//         will display distance traveled, amount of minutes, and average speed.

import java.util.Scanner; //imports scanner

public class Bicycle{
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declares scanner object
            
             myScanner = new Scanner ( System.in ); //Tells the scanner that I'm creating an instance
             
        System.out.print("Enter the number of seconds: "); //Input for number of seconds
        
            int nSec = myScanner.nextInt(); //accepts user input as an Int
            
        System.out.print("Enter the number of counts: "); //Input the number of counts
        
            int nCounts = myScanner.nextInt(); //accepts user input as Int
            
//Constants
        
        double wheelDiameter=27.0, // This variable represents the wheel's diamter.
            
        PI=3.14159, // Constant for pi.
            
        feetPerMile=5280, // Constant to represent feet per mile.
            
        inchesPerFoot=12, // Constant to represent inches per foot.
            
        secondsPerMinute=60, // Constant to represent seconds per minute.
       
        distance = nCounts * wheelDiameter * PI, //Calculates distance 
            
        time = nSec / 60, //Turns seconds entered into minutes
        
        timeHour = time/60;//Turns minutes into hours
        
        distance/=inchesPerFoot*feetPerMile; //Converts distance to miles
        
        double avgMPH = distance/timeHour; //Finds the average MPH over the cyclometer
        
//Print Output

        System.out.printf("The distance was %.2f miles and took %.2f minutes. \n", distance, time); 
                      //Prints distance traveled and time taken rounded to 2 decimal places
        
        System.out.printf("The average mph was %.2f. \n", avgMPH); //Prints the average mile per hours
        
      }
}