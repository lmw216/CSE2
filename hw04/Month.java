//Liam Walsh
//CSE2 - 111
//September 21, 2014
//HW04 - Month

//Purpose: The program will prompt the user to enter the number for a month desired (1-12).
//         The program will then tell the number of dates in that month. If its february, it will then
//         ask for the year to figure out if its a leap year.

import java.util.Scanner; //imports scanner

public class Month{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares scanner variable
        
        myScanner = new Scanner( System.in ); //Tells the scanner that I'm creating an instance
        
        System.out.print("Enter an int giving the number of the month (1-12)- "); //asks user to enter a int as a month
        
        
        if(myScanner.hasNextInt()){ //determines if the input is an integer
            
            int nMonth = myScanner.nextInt(); // the number of the month entered equals the month
        
        if(nMonth <= 0 || nMonth > 12){ //checks if int is negative or out of range
                
                System.out.println("The integer needs to be a positive and between 1-12."); //Makes sure that the input is positive
                return;
                
            } else{
                
                if (nMonth == 1){ //outputs amount of days in Jan
                
                System.out.println(" There are 31 days in January.");
                
                } else if(nMonth == 2){ //if nMonth is Feb the program will ask what year do determine if a leap year
                    
                    System.out.print("Enter the year. ");
                    
                    if(myScanner.hasNextInt()){ //determines if year entered is an integer
                        
                        int year = myScanner.nextInt(); //the year is what the user inputs
                        
                        if(year < 0){ //determines if year is negative 
                            
                            System.out.println("You've entered a negative year"); //tells if year is negative
                            return;
                        }
                        
                         if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){ //determines if the year is a leap year
                             
                        System.out.println("There are 29 days in February."); //This is a leap year, so 29 days
                        
                        } else{
                            
                        System.out.println("There are 28 days in February"); //this isnt leap year, so 28 days
                        
                        }
               
                    } else{ 
                        
                        System.out.print("You did not an integer"); //tells user if the year entered isnt an integer
                        return;
                        
                    }
               
                } else if(nMonth ==3){ //outputs number of days in march
                    
                    System.out.println(" There are 31 days in March.");
                    
                } else if(nMonth ==4){ //outputs the number of days in april
                    
                    System.out.println(" There are 30 days in April.");
                    
                } else if(nMonth ==5){ //outputs the number of days in may
                    
                    System.out.println(" There are 31 days in May.");
                    
                } else if(nMonth ==6){ //outputs the number of days in june
                    
                    System.out.println(" There are 30 days in June.");
                    
                } else if(nMonth ==7){ //outputs the number of days in july
                    
                    System.out.println(" There are 30 days in July.");
                    
                    
                } else if(nMonth ==8){ //outputs the number of days in august
                    
                    System.out.println(" There are 31 days in August."); 
            
                } else if(nMonth ==9){ //outputs the number if days in september
                    
                    System.out.println(" There are 30 days in September.");
                    
                } else if(nMonth ==10){ //outputs the number of days in october
                    
                    System.out.println(" There are 31 days in October.");
                    
                } else if(nMonth ==11){ //outputs the number of days in november
                    
                    System.out.println(" There are 30 days in November.");
                    
                } else if(nMonth ==12){ //outputs the number of days in december
                    
                    System.out.println(" There are 31 days in December.");
                    
                }
                
            } 
            
        } else{
                
                System.out.print("You did not enter a integer. \n"); //tels user the numbered entered for month is not integer
                
                return;
                
            }
    }
}
