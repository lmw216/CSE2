//Liam Walsh
//CSE2
//hw09 - BlockedAgain

//Purpose: The purpose of this program is to do the same as our NumberStack program but however use methods.

import java.util.Scanner;//imports scanner
public class BlockedAgain {//public class
    public static void main(String[] s) {//main method
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();//int m goes to getInt method
        allBlocks(m);//prints out our block tower
    }

    public static int getInt() {//getInt method
        Scanner scan = new Scanner(System.in);//declares new scanner
        System.out.println("Enter an in int between 1 and 9, inclusive: ");//asks for integer between 1-9
        int m = checkInt(scan);//our intger is checked through the checkint method
        return m;//returns int when it is valid to main method
    }

    public static void allBlocks(int m) {//method that prints out block tower
        int check = 1;//variable that gives num,ber of integers in each row and dashes in line
        for (int c = 1; c <= m; c++) {//prints the blocks and lines
            block(c, check, m);//prints the blocks
            line(check, c, m);//prints the lines
            check+=2;//adds 2 to the check
        }
    }

    public static int checkInt(Scanner myscan) {//checks the int that user input
        while (!myscan.hasNextInt()) { //reprompts the user
            System.out.println("You did not enter an integer, please try again- ");//tells user they didnt enter an integer
            myscan.next();//next input
        }
        int x = myscan.nextInt();//if intger 
        int y = checkRange(x);//checks if integer is in range
        return y;//if in range returns to allBlocks
    }

    public static void block(int c,int L, int m) {//method that does the rows of integer
        for (int l = 1; l <= c; l++) { //acounts for the ammunt of rows
            int tab = m-c;//accounts for spaces needed to center align
            for(int f = 1; f<=tab; f++){//loop that prints the spaces
                System.out.print(" ");//prints the spaces
            }
            for (int b = 1; b <= L; b++) { //accounts for each row individually
                System.out.print(c); //prints number
            }
            System.out.println(); //new line
        }
        return;
    }


    public static int checkRange(int m) {//method tht checks if the integer  is in range
            Scanner scan = new Scanner(System.in);//dclares new scanner
            while (m < 1 || m > 9) {//if integer is outside this rang
                System.out.println("You did not enter an int in [1,9]; try again: ");//tells user int is outside range
                m = checkInt(scan);//checks if next input is an integer
            }
            return m;//if in range and integer then it will return
        }
          
            public static void line(int check, int c, int m){//method that deals with dashes lines
                int tab = m-c;//also counts for center align
                for(int f = 1; f<=tab; f++){//prints out the spaces needed
                    System.out.print(" ");//prints spaces
                }
                for(int a = 1; a <= check; a++){//accounts for ---
                       System.out.print("-");//prints dash
                    }
                System.out.println();//new line
                return;//returns when finished
            }
         
}