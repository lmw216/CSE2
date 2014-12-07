import java.util.Random;

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
   /* show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);*/
   }
   
   public static int[][][] buildMat3d(){
        int x[][][] = new int[3][][];
        int rando;
        int row = 3;
        int row1 = 3;
        int row2 = 3;
        int count2 =1;
        int count1 = 1;
        int count = 1;
        
        
        
        
        for(int z=0;z<3;z++){
            for(int c=0;c<row1;c++){
                x[z][c]=new int[3+2*z];
            }
            for(int b=0;b<count1;b++){
                
            }
            row1 = 3 + 2*z;
        }
        
        
        
/*        for(int q=0;q<=2;q++){
            for(int w=0;w<row;w++){
                for(int e=0;e<count;e++){
                    x[q][w][e]= (int)(Math.random()*98 + 1);
                }
                count = q + w + 1;
            }
            row = 3 + 2*q;
        }
        
*/        
        
        return x;
    }
}