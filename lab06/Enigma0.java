//Liam Walsh

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String[] args){
      
    System.out.print("Enter an int- ");
    
    Scanner scan=new Scanner(System.in);
    
    int n;
    
    int k=4,p=6,q=7,r=8;
    
    if(scan.hasNextInt()){
        
        n = scan.nextInt();
      
      System.out.println("You entered "+ n);
      
       switch(k+p+q+r){
        
            case 24: 
          
            case 25: System.out.println("sum is 25");
      
            default:
      
        System.out.println("To repeat, you entered "+n);
      
        }
    }
    
    else{
        
      n = 4;
      
      System.out.println("You entered "+n);
      
    }
    
   
    
  }
}

/* Error report:

 *   Expand this comment:
 
 *   Explain the error(s) that occurred here, and then fix them:
    1) the main method should be the following: public static void main(String[] args);
    2) need to initialize int variable n outside if statement and not repeated within 
    3) code outside if statement needs to be within if statement except for hard code k, p, q, r needs to be outisde if statement
 *
 *
 *
 *
 *
 *
 */