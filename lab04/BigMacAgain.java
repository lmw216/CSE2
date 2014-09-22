
import java.util.Scanner;

public class BigMacAgain{
    
    public static void main(String [] args){
        
        Scanner bScanner;
        
        int nBigMacs;
        
        bScanner = new Scanner( System.in );
        
        System.out.print("Enter a number of Big Macs. ");
        
        if(bScanner.hasNextInt()){
        
       nBigMacs = bScanner.nextInt();
       
       if(nBigMacs < 0){
           
          System.out.println("Needs to be positive");
          return;
       } else{
           
           System.out.println("Do you want an order of fries? (Y/y/N/n)");
        
        String answer = bScanner.next();
        
        if(answer.equals("Y") || answer.equals("y")){
            
            double myCost = nBigMacs*2.22 + 2.15;
            
            System.out.println("The cost of " + nBigMacs + " and an order of fries is " + myCost + ".");
        
       } else if(answer.equals("N") || answer.equals("n")){
       
            double myCost = nBigMacs*2.22;
            
            System.out.println("The cost of " + nBigMacs + " and no fries is " + myCost + ".");
       
        } 
       
        else{
        
        System.out.println("You did not enter a Y or a N");
        return;
        
        }
           
        
       } }else{
            System.out.println("You did not enter an Integer.");
            return;
            
        }
        
        
        
        
    
        
        
        
    }
    
}
    
    


