//Liam Walsh
//lab12 - ArrayMath

//Purpose: We learn more about arrays but in this programs we are using arrays with methods.

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }


  public static double[] addArrays(double [] x, double[] y){
    if(x.length>=y.length){
      double[] z = new double[x.length];
      for(int a=0; a<x.length;a++){
       if(a >=y.length){
         z[a]=x[a];
       }else{
         z[a]=x[a]+y[a];
       }
        
      }
      return z;
    }else{
      double[] w = new double[y.length];
      for(int c=0;c<y.length;c++){
        if(c >=y.length){
          w[c]=y[c];
        }else{
          w[c]=y[c]+x[c];
        }
      }
      return w;
    }
  }
  
  public static String equals(double[] x, double[] y){
    int liam=0;
    if(x.length!=y.length){
      return "false";
    }else{
      for(int i=0;i<x.length;i++){
        if(x[i]==y[i]){
          liam+=1;
        }
      }
      if(liam==x.length){
        return "true";
      }else{
        return "false";
      }
    }
    
    
  }
  

}