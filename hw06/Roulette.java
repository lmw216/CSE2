//Liam Walsh
//CSE2-111
//October 11, 2014
//hw06 - Roulette

//Purpose: This program will test Prof. Chen's friends idea of betting on roulette. He bets a dollar on roulette
//         a 100 times on the same number. If he gets the right number three times within the 100 tries, then he will make
//         a profit. This program will test this idea 1000 times and determine the amount of times hes won and lost.

import java.util.Scanner; //imports scanner

public class Roulette{
    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in); //declares scanner variable scan
        
        int counter1 = 0;//intialize sentinel
        int counter2 = 0;//intialize sentinel
        int Match = 0;//spin matches number
        int Money = 0;//number of times one wins money
        int noMoney = 0;//number of zero wins
        int wins = 0;//number of total wins
        
        System.out.println("Enter a roulette number 1-38");//ask for number
        
        if(scan.hasNextInt()){//determines if input is integer or not
            
            int x = scan.nextInt();//number picked
            
            if(x<1 || x>38){//checks if input is a roulette number
                
                System.out.println("You did not enter an int between 1-38");//tells user they are wrong
            
                return;
            }
            
            while(counter1 <= 1000){//1000 games of roulette
                
                while(counter2 <= 100){//100 spins
                
                    int rando = (int)(Math.random()*38 + 1);//random number between 1-38
                    
                    if(rando==x){//if the random equals the input
                        
                        Match = Match +1;//number of wins
                        wins = wins + 1;
                        
                    }
                    
                    if (Match >= 3){
                        
                        Money = Money + 1;//tallies total times of profit
                        
                    } else if(Match == 0){
                        
                        noMoney = noMoney + 1;//tallies total of complete losses
                        
                    }
                    
                  counter2 = counter2 + 1;
                  
                }
                
            counter2 = 0;//reset counter2
                    
            Match = 0;//resets match
                    
            counter1 = counter1 + 1;//1000 sentinel
            
            }
            
        } else{
            
            System.out.println("You did not enter an integer");//if not an integer
            return;
        }
        
        System.out.println("You've won " + wins + " times.");
        System.out.println("You've profited " + Money + " times.");
        System.out.println("You've lost all your money " + noMoney + " times." );
    }
}