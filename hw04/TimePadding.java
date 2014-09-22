//Liam Walsh
//CSE2 - 111
//September 21, 2014
//HW04 - TimePadding

//Purpose: This program will ask the user to input a time in seconds. The program will output 
//         the amount of time in analog with Hours:Minutes:Seconds.

import java.util.Scanner; //imports scanner

public class TimePadding{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares scanner variable
        
        myScanner = new Scanner( System.in ); //Tells the scanner that I'm creating an instance
        
        System.out.print("Enter the time in seconds. "); //asks user to enter a time in seconds
        
        if(myScanner.hasNextInt()){ //determines if the seconds entered are a double or not
            
            int total = myScanner.nextInt(); //the enetered seconds becomes the total amount of seconds
            
            if(total <= 0){ //this if statement determines if the number entered is positive
                
                System.out.println("You did not enter a positive number");
                return;
            }
            
            double hours = 0.000277778 * total; //converts the amount of time into hours
            
            int newHours = (int) hours; //converts the hours given in to an integer
            
            int newTotal = total - newHours*3600; //figures out the leftover time 
            
            double minutes =  0.0166667 * newTotal; //determines the amount of minutes with the remaining time
            
            int newMinutes = (int) minutes; //converts the seconds into an integer
            
            int seconds = newTotal - newMinutes*60; //The amount of seconds is just the leftover time
            
            if(newMinutes <= 9 && seconds <= 9){ //this if statements determines if the minutes and seconds need a zeros  infront
                
                System.out.println(newHours + ":0" + newMinutes + ":0" + seconds ); //outputs analog time
                
            } else if(newMinutes > 9 && seconds <= 9){ //determines if only the seconds need a zero infront
                
                System.out.println(newHours + ":" + newMinutes + ":0" + seconds); //outputs analog time
                
            } else if(newMinutes <= 9 && seconds > 9){ //determines if only minutes need a zero in front if it
                
                System.out.println(newHours + ":0" + newMinutes + ":" + seconds); //outputs analog time
                
            } else if(newMinutes > 9 && seconds > 9){ //determines if neither need zeros infront
                
                System.out.println(newHours + ":" + newMinutes + ":" + seconds); //outputs analog time
            }
            
        } else {
            
            
            System.out.println("You did not enter an integer"); //This lets user know if they didnt enter an intger
            return;
            
        }
    }
}