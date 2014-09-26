//Liam Walsh
//September 20, 2014
//CSE 2 -111
//lab04

//Purpose: Will ask user how many big macs and if they want fries. It will show the total price

import java.util.Scanner; //import scanner

public class BigMacAgain{
    
    public static void main(String [] args){
        
        Scanner bScanner;//declares scanner
        
        int nBigMacs; //# bigmacs
        
        bScanner = new Scanner( System.in );
        
        System.out.print("Enter a number of Big Macs. ");//asks to eneter #BM
        
        if(bScanner.hasNextInt()){ //if scanner is int or not
        
       nBigMacs = bScanner.nextInt();
       
       if(nBigMacs < 0){//if # is negative
           
          System.out.println("Needs to be positive");
          return;
       } else{
           
           System.out.println("Do you want an order of fries? (Y/y/N/n)");//asks for fries
        
        String answer = bScanner.next();
        
        if(answer.equals("Y") || answer.equals("y")){ //if yes
            
            double myCost = nBigMacs*2.22 + 2.15;//cost
            
            System.out.println("The cost of " + nBigMacs + " and an order of fries is " + myCost + ".");
        
       } else if(answer.equals("N") || answer.equals("n")){
       
            double myCost = nBigMacs*2.22;
            
            System.out.println("The cost of " + nBigMacs + " and no fries is " + myCost + ".");
       
        } 
       
        else{
        
        System.out.println("You did not enter a Y or a N");//if wrong entry
        return;
        
        }
           
        
       } }else{
            System.out.println("You did not enter an Integer.");//if not integer
            return;
            
        }
        
        
        
        
    
        
        
        
    }
    
}
    
    


