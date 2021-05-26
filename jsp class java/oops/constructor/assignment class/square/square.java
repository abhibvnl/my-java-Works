//square  ......>area=s^2    s is side 
import java.util.*;
class sqr{
   double side;
   sqr(double side){
       this.side=side;

       double area=side*side;
       System.out.println("area of square is " +area);
   }

   public static void main(String[] args) {
       
    Scanner scanner1=new Scanner(System.in);

    System.out.print("enter side : ");
    double side=scanner1.nextDouble();

    sqr s1=new sqr(side);
   }

}