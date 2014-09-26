//Liam Walsh 
//September 26, 2014
//CSE2 - 111
//hw05 - BoolaBoola

//Purpose: This program will test the user whether a statement of trues and falses is true or false. 
//         In order to figure out the answer, we will make three boolean values of true and false to 
//         know the answer.

import java.util.Scanner; //imports the sscanner

public class BoolaBoola{
    
    static boolean xx1, xx2, xx3, xxx1, answer;
    
    public static void main(String[] args){
        
        Scanner myScanner;// declares scanner 
        
        myScanner = new Scanner(System.in); //creating instance
        
        int x1 = (int)(Math.random()*2); //gives random value of 0 or 1
        int x2 = (int)(Math.random()*2); //0 equals false and 1 equals true
        int x3 = (int)(Math.random()*2);
        int y1 = (int)(Math.random()*2); //random value of 0 or 1
        int y2 = (int)(Math.random()*2); //y booleans are the random operators
        int y3 = (int)(Math.random()*2);
        
        String YY1, YY2, YY3, answer2;
        
        
        
        if (x1 == 0){//make a new variable that represents the orginal boolean random value
            
            xx1 = false; // if equal 0 then false
            
        } else{
         
            xx1 = true; //if equal 1 then true   
        }
        
         if (x2 ==0){//make a new variable that represents the orginal boolean random value
            
            xx2 = false; // if equal 0 then false
            
        } else{
         
            xx2 = true; //if equal 1 then true   
        }
        
        if (x3 ==0){//make a new variable that represents the orginal boolean random value
            
            xx3 = false; // if equal 0 then false
            
        } else{
         
            xx3 = true; //if equal 1 then true   
        }
        
        if (y1 ==0){//make a new variable that represents the orginal boolean random value
            
            YY1 = "&&"; // if equal 0 then and
            
        } else{
         
            YY1 = "||"; //if equal 1 then or  
        }
        
        if (y2 ==0){//make a new variable that represents the orginal boolean random value
            
            YY2 = "&&"; // if equal 0 then and
            
        } else{
         
            YY2 = "||"; //if equal 1 then or   
        }
        
        if (x1 ==0 || x2 == 0 || x3 ==0){ //if any boolean is false then the answer is false
            
            answer = false;
            
        } else{
            
            answer = true; //else then they all are true then answer equals true
        }
        
        System.out.println("Does " + xx1 + " " + YY1 + " " + xx2 + " " + YY2 + " " + xx3 + " have the value true(t/T) or false(f/F)?"); 
                                        //aks user to answer the question
                                        
        answer2 = myScanner.next(); //their answer is what they input
        
        
        
        int x = answer2.length();//length of input
        
        if(x > 1){
            System.out.println("A single character is expected");//if greater then 1 then its wrong
            return;
        }
        
        switch(answer2){
            
            case "F"://false answer
            case "f":
                
                xxx1 = false; //if f, there answer is false
                
                if(answer == xxx1){ //if both answers are false then answer is correct
                    
                    System.out.println("Correct!");
                    
                } else{
                    
                    System.out.println("Wrong, try again please"); //wrong answer
                    return;
                }
                
                break;
                
            case "T"://true answer
            case "t":
                
                    xxx1 = true;// if t, their answer is true
                    
                if (answer==xxx1){ //if both answers are false then answer is correct
                    
                    System.out.println("Correct!");
                    
                } else{
                    
                    System.out.println("Wrong, try again please"); //wrong answer
                    return;
                }
                
                break;
                
             default:
             
                System.out.println("You did not enter a correct letter");
                break;
            
                
                
        }
        
        }//public main close
    }//public class close

