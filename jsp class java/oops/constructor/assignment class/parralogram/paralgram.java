//square  ......>area=bas    s is side 
import java.util.*;
class pgram{
   double sidea;
   double base;
   double hight;

   pgram( double sidea, double base, double hight){
  
   this.sidea=sidea;
   this.base=base;
   this.hight=hight;

   
   }

   void area(){
       double area=(base*hight);
       System.out.print("\narea of parallegram is : "+ area);

   }
   void perimeter(){
    double peri=(2*sidea)+(2*base);
    System.out.print("\nperimeter of parallegram is : "+ peri);

}
}

class maincls{

public static void main(String[] args) {
    
    Scanner scanner1=new Scanner(System.in);

    System.out.print("enter side a : ");
    double sidea=scanner1.nextDouble();

    System.out.print("enter base b : ");
    double base=scanner1.nextDouble();

    System.out.print("enter hight h : ");
    double hight=scanner1.nextDouble();

    pgram p1=new pgram(sidea,base,hight);

    p1.area();
    p1.perimeter();
    
}
}