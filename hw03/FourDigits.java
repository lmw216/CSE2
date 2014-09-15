//Liam Walsh
//September 12, 2014
//CSE002 - 111
//HW03 FourDigits

//Purpose: The purpose of this program is for a user to input a double and then display
//         four digits to the right of the decimal.

import java.util.Scanner; //This is needed in order to input or java will not compile

public class FourDigits{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares scanner object
        
            myScanner = new Scanner ( System.in ); //Tells the scanner that I'm creating an instance
            
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
                                // Asks user to input a double
                                
        double myDouble = 10000 * myScanner.nextDouble(); //This multiplies what the user inputs by 10000
        
        int myNumber = (int)myDouble; //this changes the my double to an integer
        
        int myDigits = myNumber % 10000; //divides integer number by 10000 and gives the remainder
                                         //this remainder is the fourdigits past the decimal point in the double
        
        System.out.println(myDigits);
        
        
    }
}
        
        
        
