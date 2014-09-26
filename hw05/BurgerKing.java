//Liam Walsh
//CSE2 - 111
//September 25, 2014
//HW05 - BurgerKing

//Purpose: This program will ask if user if they want to order a burger, fries, or soda. The program will
//         then give the user options on what they ordered.

import java.util.Scanner; //imports scanner

public class BurgerKing{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares scanner variable
        
        myScanner = new Scanner( System.in ); //Tells the scanner that I'm creating an instance
        
        System.out.println("Enter a letter to indicate a choice of: ");// asks the user what they want to order
        System.out.println("Burger (B or b)");
        System.out.println("Fries (F or f)");
        System.out.println("Soda (S or s)");
        
        String answer1 = myScanner.next();//input equals there answer
        
        int x = answer1.length();//the character length of their answer
        
          if(x > 1){
            System.out.println("A single character is expected");//checks whether if character length is correct
            return;
        }
        
        switch(answer1){ //switch statement for the users choice
            
            case "B": //if they chose a burger
            case "b":
                
                System.out.println("Enter A or a for all the fixins"); //asks for everything
                System.out.println("C or c for a burger with cheese"); //ask for just cheese
                System.out.println("N or n for none of the above"); //asks for just a hamburger
                
                String answer2 = myScanner.next();//input equals there answer
        
                int x1 = answer2.length();//the character length of their answer
        
                if(x1 > 1){
                    System.out.println("A single character is expected");//checks whether if character length is correct
                    return;
                }
                
                switch(answer2){
                    
                    case "A"://case where they want all the fixins
                    case "a":
                        
                        System.out.println("You ordered a burger with all the fixins.");//tells user they want all the fixins
                        break;
                        
                    case "C"://case they want cheese
                    case "c":
                        
                        System.out.println("You ordered a burger with cheese.");
                        break;
                        
                    case "N"://case they want nothing on their burger
                    case "n":
                        
                        System.out.println("You want nothing on your burger");
                        break;
                        
                    default://if not a choice then tell them there is a error then return
                    
                        System.out.println("You did not enter a correct letter");
                        break;
                    
                        
                } break;
                
            case "F"://case where they want fries
            case "f":
                
                System.out.println("Do you want a large (L or l) or small (S or s) order of fries?");
                
                String answer3 = myScanner.next();//input equals there answer for large or small
        
                int x2 = answer3.length();//the character length of their answer
        
                if(x2 > 1){
                    System.out.println("A single character is expected");//checks whether if character length is correct
                    return;
                }
                
                switch(answer3){
                    
                    case"L"://choice of large
                    case"l":
                        
                        System.out.println("You've ordered large fries");
                        break;
                        
                    case "S"://choice of small
                    case "s":
                        
                        System.out.println("You've order small fries");
                        break;
                        
                    default://didnt eneter correct letter
                        
                        System.out.println("You did not eneter a correct letter");
                        break;
                } break;
                
            case "S"://order of soda
            case "s":
                
                System.out.println("Do you want Pepsi (P or p), Coke (C or c), or Mountain Dew (M or m)?");
                
                String answer4 = myScanner.next();//input equals there answer for large or small
        
                int x3 = answer4.length();//the character length of their answer
        
                if(x3 > 1){
                    System.out.println("A single character is expected");//checks whether if character length is correct
                    return;
                }
                
                switch(answer4){
                    
                    case "P"://choice pepsi
                    case "p":
                        
                        System.out.println("You have ordered a Pepsi");
                        break;
                        
                    case "C"://choice coke
                    case "c":
                        
                        System.out.println("You have ordered a coke");
                        break;
                        
                    case "M": //choice of MD
                    case "m":
                        
                        System.out.println("You have ordered a Mountain Dew");
                        break;
                        
                    default://did not enter a correct letter
                        
                        System.out.println("You did not eneter a correct letter");
                        break;
                } break;
                
            default://did not enter a correct letter
            
                System.out.println("You did not eneter a correct letter");
                        break;
        }
        
    }
}