//Liam Walsh
//CSE2 - 111
//September 21, 2014
//HW04 - CourseNumber

//Purpose: A user will input a 6 digit number. From this number, the program will output the year (first 4 digits) and
//         the semester (last 2 digits).




import java.util.Scanner; //imports scanner

public class CourseNumber{
    
    public static void main(String[] args){
        
        Scanner myScanner; //declares a scanner
        
        myScanner = new Scanner( System.in); //tells the scanner Im creating an instance
        
        System.out.print("Enter a six digit number that is an integer. "); //ask user to eneter a six digit number
        
        if(myScanner.hasNextInt()){ //checks if number entered is an integer
            
            int myNumber = myScanner.nextInt(); //myNumber is the number enetered
            
            if(myNumber < 186510 || myNumber > 201440){ //determines if the number is in the given range
                
                System.out.print("The number was outside the range [186510,201440]"); //outputs that it isnt in range
                
            } else{ //if in range, program will carry one
                
                int year = myNumber/100; //first 4 digits are year by dividing by 100
                
                int semester = myNumber % 100; //the remaining two digits are the remainder when divided by 100
                
                if(semester == 10){ //outputs year and semester in spring
                    
                    System.out.print("The course was offered in spring of " + year +"\n");
                    
                } else if(semester == 20){ //outputrs year and semester in summer 1
                    
                    System.out.print("The course was offered in summer 1 of " + year +"\n");
                    
                } else if(semester == 30){ //outputs year and semester in summer 2
                    
                    System.out.print("The course was offered in summer 2 of " + year +"\n");
                    
                }   else if(semester == 40){ //outputs year and semester fall
                    
                    System.out.print("The course was offered in fall of " + year +"\n");
                    
                } else{
                    
                    System.out.print("You did not enter a ligitmate semester"); //determines if last two digits represent a semester
                    return;
                    
                }
            }
        
            
        } else{
            
            System.out.print("You did not enter an integer"); //tells user the 6 digits are not a integer
        }
    }
}