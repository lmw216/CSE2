//Liam Walsh
//September 9, 2014
//CSE002-111
//Lab 3  - Big Mac

//Purpose: The purpose of this lab is to introduce the use of inputs into our program.
//         By using the scanner class, the user will tell the program how many big macs
//         the user wants. After including tax, the program will give the total cost.

import java.util.Scanner; //This is needed in order to import or java will not compile

public class BigMac {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declares the scanner object
        
            myScanner = new Scanner ( System.in ); //Tells the scanner that I'm creating an instance
        
        System.out.print("Enter the number of Big Macs(an integer > 0): "); //Prompts the user to input Big Macs
        
            int nBigMacs = myScanner.nextInt(); //accepts user input as an Int
        
        System.out.print("Enter the cost of a Big Mac as a double (in the form XX.XX) : "); //Prompts user to enter BM price
        
            double bigMac$ = myScanner.nextDouble(); //accepts user inout as a double
            
        System.out.print("Enter the sales tax as a whole number (XX)"); //prompts user to input sales tax 
        
            double salestax = myScanner.nextDouble();  //accepts input as a double
            
            salestax /=100; //user input percent but is made into a proportion
            
        double cost$;
        int dollars, dimes, pennies; //accounts for the decimal places needed when using money
         
         cost$ = nBigMacs * bigMac$ * (1 + salestax); //finds the cost from the input provided
         
         dollars=(int)cost$;
         dimes=(int)(cost$*10)%10;
         pennies=(int)(cost$*100)%10;
         
         System.out.println("The total cost of " + nBigMacs + " Big Macs, at $ " + bigMac$ + " per Big Mac, with a" +
            " sales tax of " + (int)(salestax*100) + "%, is $" + dollars + "." + dimes + pennies);
                                                //Prints the total cost after all of the input
                                                
    }
}