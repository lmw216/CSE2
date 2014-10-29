//Liam Walsh
//CSE2-111
//hw08

/* Purpose: 
*/

import java.util.*;//imports scanner

public class HW8{
    
  public static void main(String []arg){//main method
      
	char input;//input is a chararcter
	
	Scanner scan=new Scanner(System.in);//declares scanner
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//asks user to eneter c to continue 
	                                                                            //anything else to quit
	input=getInput(scan,"Cc");//getInput method with input scanner and Cc
	
	System.out.println("You entered '"+input+"'");//prints input
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' '){ //if the input doesnt contain a character then
	    
   	    System.out.println("You entered '"+input+"'");
   	
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");//asks usert to choose digit
	
	System.out.println("You entered '"+input+"'");//outputs what the user input
	
  }
  
  public static char getInput(Scanner scan, String a){//first getInput method
      
      String answer = scan.next();//their input
      
      int b = answer.length();//length of string enetered. should be 1
      
  
        
        if(!a.contains(answer)){
          
          System.out.println("You did not enter a character from the list 'Cc'; try again- ");//tells user they are wrong
          System.exit(0);//exits the program
        }  
        
        if(b!=1){
         
         System.out.println("You should enter exactly one character- "); //asks user to eneter one character
         System.exit(0);
        }
      
      char x = answer.charAt(0);//converts string to character
      
      return x;
      
  }
  
  public static char getInput(Scanner scan, String snow, int l){//second method
    
       String answer = scan.next();//their input
       
       int c = 2;
       
       char x;
       
       while(!snow.contains(answer)){//checks if they entered a y or n
       
            System.out.println("You did not enter a character from the list 'yYnN'; try again- ");//prints out line
            
            answer = scan.next();//next input
            
            if(c==l){//if the counter equals 5
              
              System.out.println("You have failed after 5 trys.");//tells user
              
              return ' ';//returns space
            }
          c++;//increments counter
        }  
        
        char f = answer.charAt(0);//converts string to character
        
        return f; //returns x
  }
  
  public static char getInput(Scanner scan, String o, String p){
    
    System.out.println(o);//prints out question
    
    System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");//tells to eneter digits
    
    while(!scan.hasNextInt()){//if it isnt a digit
      
     System.out.println("You did not enter an acceptable character");
     
     scan.next();
     
    }
    
    int numba = scan.nextInt();//next int
    
    switch(numba){
      
      case 0:
        return '0';
        
        
      case 1:
        return '1';
        
        
      case 2:
        return '2';
        
        
      case 3:
        return '3';
        
        
      case 4:
        return '4';
        
        
      case 5:
        return '5';
        
        
      case 6:
        return '6';
        
        
      case 7:
        return '7';
        
        
      case 8:
        return '8';
        
        
      case 9:
        return '9';
        
        
  
    }
    
    return ' ';
    
  }
}

