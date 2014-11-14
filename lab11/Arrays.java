//Liam Walsh
//Lab 11 - Arrays

//Purpose: The purpose of this lab is to get used to using arrays. Setting their length, while also manipulating 
//         the data within the array

import java.util.*; //imports the scanner

public class Arrays{//public class

    public static void main(String arg[]){//main method
    
        Scanner scan = new Scanner(System.in);//declare new scanner
        
        System.out.println("Enter 10 ints- ");//asks the user to enter ints
        
        int[] myInts = new int[10];//declare int array with length 10
        
        int sum = 0;//initilize sum
        
        for(int i = 0; i<10;i++){//loop to intialize every componennt in array
        
            myInts[i]=scan.nextInt();//value is next input
        }
        
        int min = myInts[0], max = myInts[0];//finds min and max
        
        for(int j = 1; j<10;j++){//runs 9 times to check every number
            
            if(myInts[j]>max){//if myInts of index j is greater then max, set max to myInts[j]
                max = myInts[j];
            }
            
            if(myInts[j]<min){//if myInts of index j is less than min, set min to myInts[j]
                min = myInts[j];
            }
            
        sum += myInts[j];//sums up all the integers
            
        }
        
        System.out.println("The largest entry is  " + max);//tells largest int
        System.out.println("The smallest entry is  " + min);//tells smallest int
        System.out.println("The sum of the integers is " + sum);//tells the sum of the ints
        
        for(int k = 0; k <10; k++){//another loop to flip the array
            
            System.out.println(myInts[k] + " " + myInts[9-k]);//first prints column of original array then array flipped
        }
       
    }
}