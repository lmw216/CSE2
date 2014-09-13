//Liam Walsh
//September 10,2014
//CSE002-111
//hw03 - Root

//Purpose: This program will ask the user to input a number then give a rough estimate of its
//         cube root. The program will then give the vale of this estimate when cubed.

import java.util.Scanner; //This is needed in order to input or java will not compile

public class Root{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares scanner object
        
            myScanner = new Scanner ( System.in ); //Tells the scanner that I'm creating an instance
            
        System.out.print("Enter a double, and I print its cube root-"); //Ask user to enter a double
        
            double userDouble = myScanner.nextDouble(); //Tells the program that the input is a double
            
            double guess= userDouble/3; //first guess
            
            guess=(guess*guess*guess + userDouble)/(3 * guess*guess); //improved guess
            guess=(2*guess*guess*guess + userDouble)/(3 * guess*guess); //improved guess
            guess=(2*guess*guess*guess + userDouble)/(3 * guess*guess); //improved guess
            guess=(2*guess*guess*guess + userDouble)/(3 * guess*guess); //improved guess
            guess=(2*guess*guess*guess + userDouble)/(3 * guess*guess); //improved guess
            
            
            System.out.println("The cube root is " + guess); //displays the cube root
            
            double guessCubed = guess*guess*guess; //cubes the guess
            
            System.out.println(guess + "*" + guess + "*" + guess + " = " + guessCubed); //displays the cube guess
            
    }
}