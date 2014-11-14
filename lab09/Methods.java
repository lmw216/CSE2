//Liam Walsh
//CSE002 - 111
//Lab 09

//Purpose: We finish the program by adding the approriiate method


import java.util.Scanner;//imports scanner

public class Methods{//public class
    
   
      public static void main(String [] arg){//main method
          
    	Scanner scan=new Scanner(System.in);//new scanner
    	
    	int a,b,c;//int variables
    	
    	System.out.println("Enter three ints");
    	
    	a=getInt(scan);//get intn method
    	b=getInt(scan);
    	c=getInt(scan);

    	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    	System.out.println("The larger of "+a+", "+b+", and "+c+
                       	" is "+larger(a,larger(b,c)));
    	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       	", and "+c+" are in ascending order");
   
}

     public static int getInt(Scanner myscan){ 
         
           while(!myscan.hasNextInt()){//reprompts the user
               
               System.out.println("You did not enter an integer, please try again- ");
               myscan.next();
           }
           
           return myscan.nextInt();
     }
     
     public static int larger(int a, int b){//checks if a is greater then b and returns the bigger number
         
         if(a >= b){
             return a;
         }else{
             return b;
         }
     }
     
     public static boolean ascending(int a, int b, int c){//checks if it is in ascending order
         
         if(a<b && b<c){
             
             return true;
             
         }else{
             
             return false;
             
         }
     }
}