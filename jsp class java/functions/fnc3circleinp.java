//area(pi*r*r)/circumfarance(2*pi*r)/diameter(2r) of circle
import java.util.Scanner;

class crc1 {

    static void area(double rad)
    {
       double pi=3.14;
       double a=pi*rad*rad;
       System.out.println("area is "+a);
    }
   
    static void crc(double rad)
    {
       double pi=3.14;
       double c1=2*pi*rad;
       System.out.println("circumfarance is "+c1);
    }


    static void diam(double rad)
    {
      
       double d=2*rad;
       System.out.println("diameter is "+d);
    }

     public static void main (String[] args) {
        
        Scanner scanner1=new Scanner(System.in);  
        System.out.print("enter radius : ");
        double radius=scanner1.nextDouble();  //taking iput radius  from user

         area(radius);
         crc(radius);
         diam(radius);
         
     }


}