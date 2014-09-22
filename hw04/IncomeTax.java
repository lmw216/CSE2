//Liam Walsh
//September 20, 2014
//CSE002 - 111
//HW04 - IncomeTax

//Purpose: This program will prompt to ask the user to input an income that is an int.
//         The program will then output the tax rate based on the amount of income.

import java.util.Scanner; //imports scanner

public class IncomeTax{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares scanner object
        
        myScanner = new Scanner( System.in ); //Tells the scanner that I'm creating an instance
        
        System.out.print("Enter an int given the number in thousands. "); //asks  user to enter an integer
        
        
        if(myScanner.hasNextInt()){ //makes sure the input is an integer
        
            int nIncome = myScanner.nextInt(); //declaring input variable of Income
            
             double Tax, //Tax is variable to represent amount of tax
                
               Total; //This is the int user gave and turns into double
            
            
            if(nIncome < 0){ //checks if int is negative 
                
                System.out.println("The income needs to be a positive."); //Makes sure that the input is positive
                return;
                
            } else{ //now it figures the tax
                
                if (nIncome < 20){ //proceeds if int is less than 20
                    
                    Total = nIncome * 1000; 
                    Tax = Total * 0.05;
                    
                    System.out.println("The tax rate on $" + Total + " and the tax is $" +  Tax); //prints out income and tax
                    
                    
                } else if(nIncome >= 20 && nIncome < 40){ //proceeds if int is in betwen 20 and 40
                    
                    Total = nIncome * 1000;
                    Tax = Total * 0.07;
                    
                    System.out.println("The tax rate on $" + Total + " and the tax is $" +  Tax); //prints out income and tax
                    
                } else if(nIncome >= 40 && nIncome < 78){ //if int is btweenn 40 and 78
                    
                    Total = nIncome * 1000;
                    Tax = Total * 0.12;
                    
                    System.out.println("The tax rate on $" + Total + " and the tax is $" +  Tax); //prints out income and tax
                    
                }else if(nIncome >= 78){ //if int is over 78
                    
                    Total = nIncome * 1000;
                    Tax = Total * 0.14;
                    
                    System.out.println("The tax rate on $" + Total + " and the tax is $" +  Tax); //prints out income and tax
                }
                
               
            }
            } else{
                
                System.out.println("You did not enter an integer."); //Prints out that user didnt enter an integer
                return;
            }
        }
    }
