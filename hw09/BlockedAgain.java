import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an in int between 1 and 9, inclusive: ");
        int m = checkInt(scan);
        return m;
    }

    public static void allBlocks(int m) {
        int check = 1;
        for (int c = 1; c <= m; c++) {
            block(c, check, m);
            line(check, c, m);
            check+=2;
        }
    }

    public static int checkInt(Scanner myscan) {
        while (!myscan.hasNextInt()) { //reprompts the user
            System.out.println("You did not enter an integer, please try again- ");
            myscan.next();
        }
        int x = myscan.nextInt();
        int y = checkRange(x);
        return y;
    }

    public static void block(int c,int L, int m) {
        for (int l = 1; l <= c; l++) { //acounts for the ammunt of rows
            int tab = m-c;
            for(int f = 1; f<=tab; f++){
                System.out.print(" ");
            }
            for (int b = 1; b <= L; b++) { //accounts for each row individually
                System.out.print(c); //prints number
            }
            System.out.println(); //new line
        }
        return;
    }


    public static int checkRange(int m) {
            Scanner scan = new Scanner(System.in);
            while (m < 1 || m > 9) {
                System.out.println("You did not enter an int in [1,9]; try again: ");
                m = checkInt(scan);
            }
            return m;
        }
          
            public static void line(int check, int c, int m){
                int tab = m-c;
                for(int f = 1; f<=tab; f++){
                    System.out.print(" ");
                }
                for(int a = 1; a <= check; a++){//accounts for ---
                       System.out.print("-");
                    }
                System.out.println();//new line
                return;
            }
         
}