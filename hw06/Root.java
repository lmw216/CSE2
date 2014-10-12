//Liam Walsh
//October 12, 2014
//CSE2 - 111
//hw06 - Root

//Purpose: This program will prompt the user to enter a double greater then zero. The program will use the bisection
//         method in order to approximate the square of the double entered.

import java.util.*;//imports all methods

public class Root{
    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);//declares the scanner
        
        System.out.println("Enter a double greater then zero");//prompts user to enter a double
        
        double x = scan.nextDouble();//x is the double
        
        if(x<= 0){//checks if input is a double greater then zero
            
            System.out.println("You did not enter a double greater then zero.");
            return;
        }
        
        double high = x + 1, middle = 0, low = 0, difference = x +1, check;//high is upper bound, low is lower bound, middle is half of high and middle
                                                        //check is to check new parameters
        while(0.0000001 < difference){//stops until the differnce off parameters is smaller then 0.0000001
            
            middle = (high + low)/2;//low parameter
            
            check = middle*middle;//variable to check parameter
            
            if(check>x){//tests to see if new high parameter is needed
                
                high = middle;
                
            } else if(check<x){//test to see if a new low parameter is needed
                
                low = middle;
                
            }
            
            difference = high-low; //new difference 
            
        }
        
        System.out.println(middle);//prints out square root
    }
}