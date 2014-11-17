/* Liam Walsh
CSE2 - HW10-FindDuplicates
November 17,2014
Puspose: The purpose of this program is to get us used to using arrays
while also including scanners. The array was the input for our boolean scanner.
*/

import java.util.Scanner;//import scanner
public class FindDuplicates{//public class
  public static void main(String [] arg){//main method
    Scanner scan=new Scanner(System.in);//introduce scanne variable
    int num[]=new int[10];//array with length 10
    String answer="";//answer is nothing
    do{//do while the person enters y for yes
      System.out.print("Enter 10 ints- ");//asks to enter ten digits
      for(int j=0;j<10;j++){//does a loop to the length of the array 
        num[j]=scan.nextInt();//uses the sentinel to declare every element of array
      }
      String out="The array ";//adds to answer
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){//if it has a duplicate had has
        out+="has ";
      }
      else{
        out+="does not have ";//if it doesnt say so
      }
      out+="duplicates.";//have/doesnt have duplicates
      System.out.println(out);//print out the line
      out="The array ";//starts the next line
      out+=listArray(num);//adds the array    
      if(exactlyOneDup(num)){//if the array had only one duplicate do
        out+="has ";//add has
      }
      else{
        out+="does not have ";//else say it does have one duplicate
      }
      out+="exactly one duplicate.";//adds
      System.out.println(out);//prints out entire string
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//asks to go again
      answer=scan.next();//their answer
    }while(answer.equals("Y") || answer.equals("y"));//loop again if answer is y or Y
  }

  public static String listArray(int num[]){//listArray method
    String out="{";//start array with bracket
    for(int j=0;j<num.length;j++){//loop that goes to array length
      if(j>0){//if not a zero then add a comma
        out+=", ";//add comma
      }
      out+=num[j];//output the number
    }
    out+="} ";//end with a bracket
    return out;//return the string
  }
  
  public static boolean hasDups(int num[]){//hasDups method
      int count = 0;//initialize count
      for(int i=0;i<num.length;i++){//loop until array length
          for(int j=0;j<num.length;j++)//another loop to check for duplicates
            if(num[i]==num[j]){//if the counters of the array equal
                count+=1;//then add one
            }
          }
      
      if(count>=11){//if the counters is greater then ten, than there must of been a duplicate
          return true;//return true
      }else{
          return false;//else return false
      }
  }
  
  public static boolean exactlyOneDup(int num[]){
      int count = 0;//initialize count
      for(int i=0;i<num.length;i++){//loop until array length
          for(int j=0;j<num.length;j++)//another loop to check for duplicates
            if(num[i]==num[j]){//if the counters of the array equal
                count+=1;//add one
            }
          }
      if(count==12){//if there is exactly 12 on the count, there is only one duplicate
          return true;//return true
      }else{
          return false;//else return false
      }
  }
}
