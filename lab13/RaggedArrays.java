import java.util.*;

public class RaggedArrays{
    public static void main(String [] args){
        int liam[][] = new int[5][];
        for(int x=0;x<5;x++){
            liam[x] = new int[x*3+5];
        }
        System.out.println("The array before sorting: ");
        for(int y=0;y<5;y++){
            for(int z=0;z<liam[y].length;z++){
                liam[y][z]=(int)(Math.random()*39);
                System.out.print(liam[y][z] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe array after sorting: ");
        int temp;
        for(int a=0;a<5;a++){
            for(int b=0;b<liam[a].length;b++){
                for(int c=0;c<liam[a].length;c++){
                    if(liam[a][b]<liam[a][c]){
                        temp = liam[a][c];
                        liam[a][c]=liam[a][b];
                        liam[a][b]=temp;
                    }
                }
            }
        }
        for(int q=0;q<5;q++){
            for(int w=0;w<liam[q].length;w++){
                System.out.print(liam[q][w] + " ");
            }
            System.out.println();
        }
        
    }
}