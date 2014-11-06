//Liam Walsh
// Purpose: The purpose of the program is to get used to using loops and sentinels when using a prgram.

import java.util.*;//imports scanner

public class ForTheLoop{//public class
    
    public static void main(String [] args){//main method
        
        boolean magic = true;//boolen is true
            
        while(magic==true){//while it is true
        
        Scanner myScanner = new Scanner(System.in);//declares a scanner
        
        System.out.println("Enter an int between 0-15");//asks to enter an in nbetween 1-15
        
        if(myScanner.hasNextInt()){ //if a int ctn
            
            int nStars = myScanner.nextInt(); //# of stars needed
            
            String Stars = "";//initial string
                
            String sStars = "";//initial string
            
            String answer; //intialize answer
            
            
                
             if(nStars < 0 || nStars > 15){ //checks if in domain
                 
                 System.out.println("You did not give an int between 0-15");
                 return;
             }
             
             
                 
                int counter = 1;//counter
            
                int counter1 = 1;//counter
                 
                    while(counter1<=nStars){//prints out first line of stars
                           
                            Stars = Stars + "*";
                        
                            counter1++; 
                            
                    }
                    
                    System.out.println(Stars);
                    
                    while(counter<=nStars){//does stars in incrementing order
                        
                        sStars = sStars + "*";
                        
                        System.out.println(sStars);
                        
                        counter++;
                
                    }
                    
               System.out.println("Enter y or Y to run again.");//if y then keep running
               
               answer = myScanner.next();//next input
               
                    switch(answer){//switch answeer
                        
                        case "y":
                        case "Y"://if y or Y
                            
                                magic = true;//ctn
                                break;
                                
                        default:
                        
                                magic = false;//else end the progrm
                    }    
               
               
             }
         
        
        else{//if they did not enter an int in the begginning 
            System.out.println("You did not enter an integer."); //not an integer
            return;
        }
        
        }
    }
}