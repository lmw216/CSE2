//Liam Walsh
//CSE2
//HW10 - PokerOdds
//November 17, 2014

//Purpose: The purpose of this program is to understand the way to randomly generate
//          arrays and how to use them within different methods.

import java.util.Random;//import random

import java.util.Scanner;//import scanner

public class PokerOdds{//public class
    
  public static void main(String [] arg){//main method
    showHands();//showhands method
    simulateOdds();//simulate odds method
  }
  
  public static void showHands(){//show hands method
      
      Scanner scan = new Scanner(System.in);//declare scanner variable
      
      String answer="y";//initialize answer
      
      do{//do all of this while they answer y or Y for yes
          
      int cards[] = new int[52];//declare cards vairable length 52
      
      int hand[] = {-1, -1, -1, -1, -1};//initiliaze hand of length 5
          
          for(int x=0; x<=51;x++){//loop that gives every card a number 
                                    //from 0 to 51
              
              cards[x]=x;//cards array
              
          }
          
          int randomCount = 51;//initilize the random
          
          for(int y=0;y<=4;y++){//goes through 5 times for every card
              
              int rando = (int)(Math.random()*randomCount);//random number between 0 and randomcount
              
              hand[y]=cards[rando];//hand takes in random card from deck
              
              cards[randomCount]=hand[y];//the card is replace to the back of the deck
              
              randomCount-=1;//random count goes down one
              
         
          }            
        
      int counter1 = 0;//counter initilzed
      
      String clubs = "Clubs: ";//declaring strings for all 4 suits
      
      String hearts = "Hearts: ";
      
      String diamonds = "Diamonds: ";
      
      String spades = "Spades: ";
      
      for(int y=0;y<=4;y++){//loops that determines every card
          
          if(hand[y]>=0 && hand[y]<=12){//if between then it is clubs
              
              switch(hand[y]){//case that gives the card a value based on its value
                  case 0: clubs += " A ";
                  break;
                  case 1: clubs += " K ";
                  break;
                  case 2: clubs += " Q ";
                  break;
                  case 3: clubs += " J ";
                  break;
                  case 4: clubs += " 10 ";
                  break;
                  case 5: clubs += " 9 ";
                  break;
                  case 6: clubs += " 8 ";
                  break;
                  case 7: clubs += " 7 ";
                  break;
                  case 8: clubs += " 6 ";
                  break;
                  case 9: clubs += " 5 ";
                  break;
                  case 10: clubs += " 4 ";
                  break;
                  case 11: clubs += " 3 ";
                  break;
                  case 12: clubs += " 2 ";
                  break;
              }
          }
          
          if(hand[y]>=13 && hand[y]<=25){//if between gives the card a number by the 
                            //remainder when divided by 13
              switch(hand[y]%13){//with the remainder what card
                  case 0: diamonds += " A ";
                  break;
                  case 1: diamonds += " K ";
                  break;
                  case 2: diamonds += " Q ";
                  break;
                  case 3: diamonds += " J ";
                  break;
                  case 4: diamonds += " 10 ";
                  break;
                  case 5: diamonds += " 9 ";
                  break;
                  case 6: diamonds += " 8 ";
                  break;
                  case 7: diamonds += " 7 ";
                  break;
                  case 8: diamonds += " 6 ";
                  break;
                  case 9: diamonds += " 5 ";
                  break;
                  case 10: diamonds += " 4 ";
                  break;
                  case 11: diamonds += " 3 ";
                  break;
                  case 12: diamonds += " 2 ";
                  break;
              }
          }
          
          if(hand[y]>=26 && hand[y]<=38){//if between gives the card a number by the 
                            //remainder when divided by 13
              
              switch(hand[y]%13){//with the remainder what card
                  case 0: hearts += " A ";
                  break;
                  case 1: hearts += " K ";
                  break;
                  case 2: hearts += " Q ";
                  break;
                  case 3: hearts += " J ";
                  break;
                  case 4: hearts += " 10 ";
                  break;
                  case 5: hearts += " 9 ";
                  break;
                  case 6: hearts += " 8 ";
                  break;
                  case 7: hearts += " 7 ";
                  break;
                  case 8: hearts += " 6 ";
                  break;
                  case 9: hearts += " 5 ";
                  break;
                  case 10: hearts += " 4 ";
                  break;
                  case 11: hearts += " 3 ";
                  break;
                  case 12: hearts += " 2 ";
                  break;
              }
          }
          
          if(hand[y]>=39 && hand[y]<=51){//if between gives the card a number by the 
                            //remainder when divided by 13
              
              switch(hand[y]%13){//with the remainder what card
                  case 0: spades += " A ";
                  break;
                  case 1: spades += " K ";
                  break;
                  case 2: spades += " Q ";
                  break;
                  case 3: spades += " J ";
                  break;
                  case 4: spades += " 10 ";
                  break;
                  case 5: spades += " 9 ";
                  break;
                  case 6: spades += " 8 ";
                  break;
                  case 7: spades += " 7 ";
                  break;
                  case 8: spades += " 6 ";
                  break;
                  case 9: spades += " 5 ";
                  break;
                  case 10: spades += " 4 ";
                  break;
                  case 11: spades += " 3 ";
                  break;
                  case 12: spades += " 2 ";
                  break;
              }
          }
      }
      
      System.out.println(clubs);//prints all 4 strings with the appropriate cards
      System.out.println(diamonds);//that were in the hand
      System.out.println(hearts);
      System.out.println(spades);
      
      System.out.println("Enter y or Y if you wish to continues, anything else to quit. ");//asks if they want to ctn
      
          answer = scan.next();
      
      } while(answer.equals("Y") || answer.equals("y"));//loop again if answer is y or Y 
      
      return;
  }
/////////////////////////////////////////////////////////////////////////////////////////  
  public static void simulateOdds(){
      
      int A, K, Q, J, a10, a9, a8, a7, a6, a5, a4, a3, a2, pair,PA, PK, PQ, PJ, P10, P9, P8, P7, P6, P5,
            P4, P3, P2; //declares all needed variables
      
        PA=0; PK=0; PQ=0; PJ=0; P10=0; P9=0; P8=0; P7=0; P6=0; P5=0;
            P4=0; P3=0; P2=0; pair=0;//initialize variables to that check how many pairs overall
      
      for(int x=0; x<=10000;x++){//loop that runs 10000 times
          
          A=0; K=0; Q=0; J=0; a10=0; a9=0; a8=0; a7=0; a6=0; a5=0; a4=0; a3=0; a2=0;
     //initialize variables that see how many pairs are in the hand
       int cards[] = new int[52];//new cards array
      
      int hand[] = {-1, -1, -1, -1, -1};//new hand array
          
          for(int z=0; z<=51;z++){//gives a 52 card deck with appropriate numbers
              
              cards[z]=z;
              
          }
          
          int randomCount = 51;//new random count
          
          for(int y=0;y<=4;y++){//runs 5 times for the hand
              
              int rando = (int)(Math.random()*randomCount);//makes a random number
                                            //between 0 and randomcount
              hand[y]=cards[rando];//hand takes card from deck
              
              cards[randomCount]=hand[y];//the hand card replaces into back of deck
              
              randomCount-=1;//decrease random count
              
         } 
            for(int y=0; y<=4;y++){//loop 5 times for the hand
                
            if(hand[y]<=12){//if the value is less then 12 determine the pairs
                
                switch(hand[y]){
                      case 0: A+=1;
                      break;
                      case 1: K+=1;
                      break;
                      case 2: Q+=1;
                      break;
                      case 3: J+=1;
                      break;
                      case 4: a10+=1;
                      break;
                      case 5: a9+=1;
                      break;
                      case 6: a8+=1;
                      break;
                      case 7: a7+=1;
                      break;
                      case 8: a6+=1;
                      break;
                      case 9: a5+=1;
                      break;
                      case 10: a4+=1;
                      break;
                      case 11: a3+=1;
                      break;
                      case 12: a2+=1;
                      break;
                  }
                
                
            }
                
            if(hand[y]>=13){//if greater then 13 determine the number of pairs
                
            
             switch(hand[y]%13){
                      case 0: A+=1;
                      break;
                      case 1: K+=1;
                      break;
                      case 2: Q+=1;
                      break;
                      case 3: J+=1;
                      break;
                      case 4: a10+=1;
                      break;
                      case 5: a9+=1;
                      break;
                      case 6: a8+=1;
                      break;
                      case 7: a7+=1;
                      break;
                      case 8: a6+=1;
                      break;
                      case 9: a5+=1;
                      break;
                      case 10: a4+=1;
                      break;
                      case 11: a3+=1;
                      break;
                      case 12: a2+=1;
                      break;
                  }
                }
                
                if(A==2){//if there are two of the same cards then add one to the pair variable
                    
                    PA+=1;
                    
                }else if(A>2){
                    
                    pair+=1;//if there are more than 2 cards then add to the mopre then one pair variable
                    
                }
                
                  if(K==2){
                    
                    PK+=1;
                    
                }else if(K>2){
                    
                    pair+=1;
                    
                }
                
                  if(Q==2){
                    
                    PQ+=1;
                    
                }else if(Q>2){
                    
                    pair+=1;
                    
                }
                
                  if(J==2){
                    
                    PJ+=1;
                    
                }else if(J>2){
                    
                    pair+=1;
                    
                }
                
                  if(a10==2){
                    
                    P10+=1;
                    
                }else if(a10>2){
                    
                    pair+=1;
                    
                }
                
                  if(a9==2){
                    
                    P9+=1;
                    
                }else if(a9>2){
                    
                    pair+=1;
                    
                }
                
                  if(a8==2){
                    
                    P8+=1;
                    
                }else if(a8>2){
                    
                    pair+=1;
                    
                }
                
                  if(a7==2){
                    
                    P7+=1;
                    
                }else if(a7>2){
                    
                    pair+=1;
                    
                }
                
                  if(a6==2){
                    
                    P6+=1;
                    
                }else if(a6>2){
                    
                    pair+=1;
                    
                }
                
                  if(a5==2){
                    
                    P5+=1;
                    
                }else if(a5>2){
                    
                    pair+=1;
                    
                }
                
                  if(a4==2){
                    
                    P4+=1;
                    
                }else if(a4>2){
                    
                    pair+=1;
                    
                }
                
                  if(a3==2){
                    
                    P3+=1;
                    
                }else if(a3>2){
                    
                    pair+=1;
                    
                }
                
                  if(a2==2){
                    
                    P2+=1;
                    
                }else if(a2>2){
                    
                    pair+=1;
                    
                }
                
                  
            }
      }    
            
        System.out.println("rank   freq of exactly one pair");//prints out the table showing number of pairs for each
        System.out.println("A      " + PA);
        System.out.println("K      " + PK);
        System.out.println("Q      " + PQ);
        System.out.println("J      " + PJ);
        System.out.println("10     " + P10);
        System.out.println("9      " + P9);
        System.out.println("8      " + P8);
        System.out.println("7      " + P7);
        System.out.println("6      " + P6);
        System.out.println("5      " + P5);
        System.out.println("4      " + P4);
        System.out.println("3      " + P3);
        System.out.println("2      " + P2);
        System.out.println("---------------");
        System.out.println("Total not exactly one pair " + pair);//shows the pair that wasnt exactly one
    
  }    
}