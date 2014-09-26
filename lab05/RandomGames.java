//Liam Walsh
//September  24, 2014
//lab04 - RandomGames

//Purpose: This game will allow the user to play roulette, craps, or cards. The program will
//         use the random method in order for the game to be probable.

import java.util.Scanner;//import scanner

public class RandomGames{
    
    public static void main(String[] args){
        
        Scanner myScanner;//declares scanner
        
        myScanner = new Scanner( System.in);//instance
        
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");//as which game to play
        
        String answer = myScanner.next();//answer equals input
        
        int x = answer.length();//length of input
        
        
        
        if(x > 1){
            System.out.println("A single character is expected");//if greater then 1 then its wrong
            return;
        }
        
        switch (answer){//switch statement for which game
            
            case "R": //roulette
            case "r":  
                
                int random = (int)(Math.random()*40);//random number
                
                    if (random > 0 && random <= 38){ //if its not 0 or 00
                        
                        int remainder = random % 2;
                        
                        switch (remainder){//checks if red or black
                            
                            case 0:
                                
                                System.out.println(random + " Black");
                                break;
                                
                            case 1:
                                
                                System.out.println(random + " Red");
                                break;
                        }
                        
                        } else{
                            
                            int random1 = (int)(Math.random()*2);
                            
                            switch (random1){ //if 0 or 00
                                
                                case 0:
                                    
                                    System.out.println("00 Blue");
                                    break;
                                    
                                case 1:
                                    
                                    System.out.println("0 Blue");
                                    break;
                            }
                        }
                        
                break;
                
            case "C": //craps
            case "c":
                
                int crapsRandom1 = (int)(Math.random()*6) + 1; //random die 1 and 2
                
                int crapsRandom2 = (int)(Math.random()*6) + 1;
                
                int crapsanswer = crapsRandom1 + crapsRandom2;
                
                System.out.println(crapsRandom1 + " + " + crapsRandom2 + " = " + crapsanswer);//output
                
                break;
                
            case "P"://playing cars
            case "p":
                
                int suit=(int)(Math.random()*4)+1;
                int myNumber = (int)(Math.random()*13)+1;
                
                switch (suit){//swicth for suit 1 is hearts 2 is clubs 3 is diamonds 4 is clubs
                    
                    case 1: 
                        
                        switch(myNumber){
                            
                            case 1:
                                
                                System.out.println("Ace of Hearts."); //if 1 then ace
                                
                            break;
                            
                            case 2:
                                
                                System.out.println( myNumber + " of Hearts.");//if 2-10 then number card
                                
                            break;
                            
                             case 3:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 4:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 5:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 6:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 7:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 8:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 9:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 10:
                                
                                System.out.println( myNumber + " of Hearts.");
                                
                            break;
                            
                             case 11:
                                
                                System.out.println( "Jack of Hearts.");//if 11-13 then jack queen king respectively
                                
                            break;
                            
                             case 12:
                                
                                System.out.println( "Queen of Hearts.");
                                
                            break;
                            
                             case 13:
                                
                                System.out.println( "King of Hearts.");
                                
                            break;
                            
                            
                        }
                        
                        
                break;
                
                case 2: 
                        
                        switch(myNumber){
                            
                            case 1:
                                
                                System.out.println("Ace of Clubs.");
                                
                            break;
                            
                            case 2:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 3:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 4:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 5:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 6:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 7:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 8:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 9:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 10:
                                
                                System.out.println( myNumber + " of Clubs.");
                                
                            break;
                            
                             case 11:
                                
                                System.out.println( "Jack of Clubs.");
                                
                            break;
                            
                             case 12:
                                
                                System.out.println( "Queen of Clubs.");
                                
                            break;
                            
                             case 13:
                                
                                System.out.println( "King of Clubs.");
                                
                            break;}
                
                break;
                
                case 3: 
                        
                        switch(myNumber){
                            
                            case 1:
                                
                                System.out.println("Ace of Diamonds.");
                                
                            break;
                            
                            case 2:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 3:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 4:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 5:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 6:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 7:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 8:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 9:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 10:
                                
                                System.out.println( myNumber + " of Diamonds.");
                                
                            break;
                            
                             case 11:
                                
                                System.out.println( "Jack of Diamonds.");
                                
                            break;
                            
                             case 12:
                                
                                System.out.println( "Queen of Diamonds.");
                                
                            break;
                            
                             case 13:
                                
                                System.out.println( "King of Diamonds.");
                                
                            break;}
                            
                    break;
                            
                case 4: 
                        switch(myNumber){
                            
                            case 1:
                                
                                System.out.println("Ace of Spades.");
                                
                            break;
                            
                            case 2:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 3:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 4:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 5:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 6:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 7:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 8:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 9:
                                
                                System.out.println( myNumber + " of Spades.");
                                
                            break;
                            
                             case 10:
                                
                                System.out.println( myNumber + " of Spadess.");
                                
                            break;
                            
                             case 11:
                                
                                System.out.println( "Jack of Spades.");
                                
                            break;
                            
                             case 12:
                                
                                System.out.println( "Queen of Spades.");
                                
                            break;
                            
                             case 13:
                                
                                System.out.println( "King of Spades.");
                                
                            break; }
                        
                        
                break; }
        
        default:
                
            System.out.println("You did not enter a correct letter.");//if enetered incorrect number
                
     break;           
        
    }
                
    }
                
}      
