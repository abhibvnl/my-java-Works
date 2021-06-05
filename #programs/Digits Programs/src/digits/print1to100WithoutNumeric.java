//wap to print 1 to 100 withot numbers
package digits;
public class print1to100WithoutNumeric{
    
      public static void main(String[] args) {
       
        int ascii='A'/'A';
        String str="..........";
       
        for(int i=ascii ; i<=(str.length()*str.length());i++)
        System.out.print(i+" ");

     }
}