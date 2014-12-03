//Liam Walsh
//HW 11-PokerHands
//This program teaches more in depth use of arrays.

import java.util.*;//imports scanner

public class PokerHands{//public class
    
    public static void main(String[] args){//main method
        Scanner scan = new Scanner(System.in);//declares scanner variable
        int[] hand = new int[5];//hand array 
        int[] flush = new int[5];//array that checks if the hand is a flush
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand- ");//asks user if they wanna start the program
        String answer = scan.next();//asnwer to the question
        String suit1, card1;//answer to card and suit as string
        while(answer.equals("y") || answer.equals("Y")){ //do main method if they keep answering y
            for(int x=0;x<=4;x++){//does a loop 5 times
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");//asks to enter suit
                suit1 = scan.next();//their answer
                int suit = getSuit(suit1);//sends answer to getsuits method
                flush[x]=suit;//adds the suit to array
                System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");//asks user to enter card value
                card1 = scan.next();//answer to card value
                int card = getCard(card1);//turns the string value to integer
                hand[x]=transform(suit, card);//sends the integers to transform method to give int from 0-51
            }
            showOneHand(hand);//shows the hand
            tellHand(hand, flush);//tells what the best hand is
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand- ");//asks the user if they want to ctd
        answer = scan.next();//their answer
        }
        
    }
    
    public static int getSuit(String suit1){//get suit method
        Scanner scan = new Scanner(System.in);//scanner variable
        int answer;
         switch(suit1){//gives an int 0-3 dependent on the suit
            case "c":
                answer = 0;
                break;
            case "d":
                answer = 1;
                break;
            case "h":
                answer = 2;
                break;
            case "s":
                answer = 3;
                break;
            default:
                answer = 4;
                break;
        }
        while(answer==4){//keeps going if incorrect 
            System.out.println("You did not enter a valid response");
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
            suit1 = scan.next();
                switch(suit1){
                    case "c":
                        answer = 0;
                        break;
                    case "d":
                        answer = 1;
                        break;
                    case "h":
                        answer = 2;
                        break;
                    case "s":
                        answer = 3;
                        break;
                    default:
                        answer = 4;
                        break;
                }
        }
        return answer;
    }
    
    public static int getCard(String card1){//get card method
        
        Scanner scan = new Scanner(System.in);
        int check = 0;
        while(check==0){//while check is zero keep going
            switch(card1){//switch statement if its the corresponding string will return the int value
                case "a":
                    return 0;
                case "k":
                    return 1;
                case "q":
                    return 2;
                case "j":
                    return 3;
                case "10":
                    return 4;
                case "9":
                    return 5;
                case "8":
                    return 6;
                case "7":
                    return 7;
                case "6":
                    return 8;
                case "5":
                    return 9;
                case "4":
                    return 10;
                case "3":
                    return 11;
                case "2":
                    return 12;
                default:
                    System.out.println("Thats not a card. Please try again- ");//else it will ask again
                    card1 = scan.next();
            }
        }
        
        return 19;
    }
    
    public static int transform(int suit, int card){//this method makes the a card a value between 0-51
        int liam = suit*13 + card;
        return liam; //returns the number
        
    }
    
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};//string with correspoding cuits
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",//array with corresponding card values
      	"4 ","3 ","2 "};
    	String out="";//gives a space
    	for(int s=0;s<4;s++){//goes through 5 times for each card
      	out+=suit[s];//adds the suit to the out string
      	for(int rank=0;rank<13;rank++)//loop that adds the corresponding value to each suit
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
      	out+='\n';//gives a new line
    	}
    	System.out.println(out);//prints the line
  }
  
     public static void tellHand(int[] hand, int[] flush){//determines the hand
         Scanner scan = new Scanner(System.in);//scanner variable
         int check;//check variable
         int[] freq = new int[13];//array with length 13
         int[] liam = new int[5];//array with length 5
         int checkflush = 0;//checks for a flush
         for(int i=0;i<=12;i++){
             freq[i]=0;
         } //initializes freq array
         for(int a=0;a<=4;a++){//initiliazes the liam array(my name btw)
             liam[a]=0;
         }
         for(int x=0;x<=12;x++){//goes through freq array and find the frequency of each rank
             for(int l=0;l<=4;l++){//goes through the hand
                 check = hand[l]%13;//finds remainder to see what the rank is
                 if(x==check){
                     freq[x]+=1;//adds one to its correspond index
                 }
             }
         }
         for(int j=0;j<=12;j++){//this checks the amount of times each rank is in the freq
             for(int q=0;q<=4;q++){
                 if(freq[j]==q){//if equal to index then add one to corresponding element
                     liam[q]+=1;
                 }
             }
         }
         for(int g=1;g<=4;g++){
             if(flush[g-1]==flush[g]){//if all cards are in order and adds up to 4 then its a straight
                 checkflush+=1;
             }
         }
         if(checkflush==4){
             checkflush=1;//if equal to four then its a straight
         }
         
         checkHand(freq, liam, checkflush);//this tells what the hand is
         
     }
     
     public static void checkHand(int[] freq, int[] liam, int flush){//sends freq and amount of pairs and if flush or not
         int checkstraight = 0;//check for straight
         for(int x=1;x<=12;x++){
             if(freq[x-1]==freq[x]){//if there is 5 ones in a row its a straight
                 checkstraight+=1;
             }
         }
         if(freq[0]==1&&freq[1]==1&&freq[2]==1&&freq[3]==1&&freq[4]==1&&flush==1){//if ace k q j and 10 are straight and flush then royal flusg
             System.out.println("That is a royal flush");
             return;//says its a royal flush
         }else if(flush==1 && checkstraight==4){//if straight and flush then straight flush
             System.out.println("That is a straight flush");//says its a straight flush
             return;
         }else if(liam[4]==4){//if there are four of a kind
             System.out.println("That is a four of a kind");
             return;
         }else if(liam[3]==1 && liam[2]==1){//if a three pair and a one pair
             System.out.println("That is a full house");//then full house
             return;
         }else if(flush==1){//if check flush is true
             System.out.println("That is a flush");//says its a flush
             return;
         }else if(checkstraight==4){//if its a straight
             System.out.println("That is a straight");//says its a straight
             return;
         }else if(liam[2]==2){
             System.out.println("That is a two pair");//if there is a two pair
             return;
         }else if(liam[2]==1){//if there is only one pair
             System.out.println("That is a pair");//theres one pair
             return;
         }else{
             System.out.println("That is a high card");//if nothing else then its a high card
             return;
         }
         
     }

    
    
}