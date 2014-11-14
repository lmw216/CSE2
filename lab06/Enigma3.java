//Liam Walsh


/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;

public class Enigma3{
    
  public static void main(String [] arg){
      
    int n=40,k=60;
    
    String out="";
    System.out.println("1 "+ n + " "+ k);//1
    
    switch(k%14){
        
      case 12: 
          
      case 13: out+=13;
      
         break;
         
      default: out+=40;
      
          n/=3;
          
          k-=7;
          
         
    }
    System.out.println("2 "+ n + " "+ k);//1 
    if(n*k%12< 12){
        
      n-=20;
      
      out+=n;
      System.out.println("3 "+ n + " " +k);//1 
      
    }
    if(n*n>k){
        
      n=42;
      
      out+=n+k;
      System.out.println("4 "+ n + " "+ k);//1 
    }
    
    else {
        
      n=45;
      
      out+=n+k;
      System.out.println("5 "+ n + " " +k);//1 
    }
    
    System.out.println("6 "+ n + " "+ k);//1 
    switch(n+k){
        
      case 114: 
          
        n-=11;
        
        k-=3;
        System.out.println("7 "+ n + " "+ k);//1 
        
        break;
        
      case 97:
          
        n-=14;
        
        k-=2;
        
        System.out.println("8 "+ n + " " +k);//1 
        
        break;
        
      case 98:
          
        n/=5;
        
        k/=9;
        
        System.out.println("9 "+ n + " "+ k);//1 
        break;
        
      default:
      
        n-=3;
        
        k-=5;
        
        System.out.println("10 "+ n + " " +k);//1 
    }
    out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report: In our last (n+k) switch statement, it goes to case 98 which make n = 9 and k=5.
 *              Because there isnt a break statement, it goes to the default which it turn makes n = 6 and
 *              k = 0. So if we enter a break there, the program should work fine which I did.
 * 
 * 
 */
