//Liam Walsh
//lab10 - MethodCalls

//Purpose: The objective of this program is to become more aware of
//          calling different methods within a program.

public class MethodCalls{//public class
    
    public static void main(String []  arg){//main method
        int a=784,b=22,c;//int a b and c
        c=addDigit(a,3);//int c is 3784
     
        System.out.println("Add 3 to "+a+" to get "+c);//displays int c
        c=addDigit(addDigit(c,4),5); //ands 40000 and then 500000
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);//displays this number
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));//adds -300 to -98
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);//joins a and be to make c
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));//joins 87 42 and 83
        System.out.println("Join -9 and -90 to get "+join(-9,-90));//makes 990
    }
    
    public static int addDigit(int a, int b){//add digit method
        
        int length;//length of integers
        
        if(a>=0){//if a is pos
        
        length = (int)(Math.log10(a)+1);//takes log and adds one to find length
        
        } else{//else
            
            int d = a*-1;//make a pos to find length
            
        length = (int)(Math.log10(d)+1);//length
            
            
        }
        
        int sum;//sum of numbers
        
        for(int i=1; i<=length; i++){//multiplies by certain factor based on length of a
            
            b *= 10;//make another digit if number is longer
        }
        
        if(a >= 0){//if a is pos
            
            sum = a+b; //add the numbers and return it
            
            return sum;
        
        } else{
            
            
            int c = b*-1;//make b a pos int then add and return
            
            sum = a+c;
            
            return sum;
        }
        
    }
    
    public static int join(int a, int b){//join method
        
       int length;//length of integers
        
        if(b>=0){//if pos find the length 
        
        length = (int)(Math.log10(b)+1);//length
        
        } else{
            
            int d = b*-1;//if not pos then make positive and find length
            
        length = (int)(Math.log10(d)+1);
            
        }
        
        int sum;
        
        for(int i=1; i<=length; i++){ //adds appropriate digits based on length of b
            
            a *= 10;
        }
        
        if(b >= 0 && a>= 0){//if both positive then return correct length
            
            sum = a+b;
            
            return sum;
        
        } else{//if either are negative make positive then find sum
            
            int d = b*-1;//make b pos int
            int c = a*-1;//make a pos int
            
            sum = d+c;
            
            return sum;//return their sum
        }  
        
        
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
