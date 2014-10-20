//Liam Walsh
//October 20, 2014
//CSE002 - 111
//HW08 - NumberStack

//Purpose: The user will be prompted to enter an integere btween 1 and 9. With the number enetered, the program will 
//         display an 'integer tower'. There will be three identical towers made from a for-loop, while loop and do while loop.


import java.util.*;//imports scanner

public class NumberStack{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in); //scanner variable
        
        System.out.print("Enter an integer between 1-9: ");//ask user to input an integer
        
        int c = 1, l= 1, check = 1, b=1, a = 1;//counters for for loops
        int c2 = 1, l2 = 1, check2 = 1, b2 = 1, a2=1;//counter for do while
        int c1 = 1, l1 = 1, check1 = 1, b1 = 1, a1= 1;//counter for while
        
        
        
        if(scan.hasNextInt()){
            
             int x = scan.nextInt(); // int enetered
             
             if(x < 1 || x>9){
                 
                 System.out.println("You did not enter a number between 1 - 9");//check if int between 1-9
                 return;
             }
////////////////////////////////////////////FOR/////////////////////////////////////////////////////////////////////////////////////             
             for(c = 1; c <= x; c++){//runs up to intger enetered
                 
                 for(l= 1; l <= c; l++){//acounts for the ammunt of rows
             
                    for(b = 1; b <= check; b++){//accounts for each row individually
                        
                       System.out.print(c);//prints number
                        
                    }
                    
                    System.out.println();//new line
                 }    
                     System.out.println();//new line
                    
                    
                    for(a = 1; a <= check; a++){//accounts for ---
                        
                       System.out.print("-");
                        
                    }
                    
                    System.out.println();//new line
                    
                    b=0;//reinitialize
                    check = check + 2;//accounts for different mount of numbers in the rows
                 
             }
////////////////////////////////////////////WHILE//////////////////////////////////////////////////////////////////////////////

            while(c1<=x){//runs up to integer enetered
                
                while(l1<=c1){//accounts for the different rows
                    
                    while(b1 <=check1){//prints number to the row
                        
                        System.out.print(c1);
                        
                        b1++; //increments
                        
                    }
                    
                    b1 = 1;//reinitialize
                    
                    System.out.println();//new line
                    
                    l1++;//increment
                }
                
                System.out.println();//newline 
                
                while(a1<=check1){//accounts for dashes
                    
                    System.out.print("-");
                    
                    a1++;//incremements
                    
                }
                
                System.out.println();//new line
                
                a1 = 1;//reinitialize
                
                l1=1;//reinitilize
                
                check1 = check1 + 2;//accounts for different amount of numbers in each row
                
                c1++;//increment
                
            }
//////////////////////////////DOWHILE///////////////////////////////////////////////////////////////////////////////////////        
            
            do {//runs to integer enetered
                
                do{//accounts for the number of rows for each number
                    
                    do{//accounts for the nnumber of integeres in each nhumbers row
                        
                        System.out.print(c2);
                        b2++;//incremements
                        
                    }while (b2<=check2);
                    
                    System.out.println();
                    
                    b2 = 1;//reinitialized
                    
                    l2++;//increment
                    
                }while(l2<=c2);
                
                System.out.println();//new line
                
                do{//accounts for dashes
                    
                    System.out.print("-");
                    a2++;
                    
                } while(a2<=check2);
                
                System.out.println();//new line
                
               a2 = 1;//reinitialize
                
                l2=1;//reinitilize
                
                check2 = check2 + 2;//accounts for different amount of numbers in each row
                
                c2++;//increment 
                
            } while(c2<=x);
        
        } else{//checks if integer enetered or not
            System.out.println("You did not enter an intger");
            return;
        }
    }
}