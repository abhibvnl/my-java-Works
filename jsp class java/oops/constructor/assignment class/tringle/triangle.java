//square  ......>area=bas    s is side 
import java.util.*;
class triangle{
   double sidea;
   double sidec;
   double base;
   double hight;

   triangle( double sidea, double sidec, double base, double hight){
  
   this.sidea=sidea;
   this.sidec=sidec;
   this.base=base;
   this.hight=hight;

   
   }

   void area(){
       double area=(base*hight)/2;
       System.out.print("area of rect is : "+ area);

   }
   void perimeter(){
    double peri=sidea+base+sidec;
    System.out.print("perimeter of rect is : "+ peri);

}
}

class maincls{

public static void main(String[] args) {
    
    Scanner scanner1=new Scanner(System.in);
    System.out.print("enter side a : ");
    double sidea=scanner1.nextDouble();

    System.out.print("enter side c : ");
    double sidec=scanner1.nextDouble();

    System.out.print("enter base b : ");
    double base=scanner1.nextDouble();

    System.out.print("enter hight h : ");
    double hight=scanner1.nextDouble();

    triangle m1=new triangle(sidea,sidec,base,hight);
    m1.area();
    
}
}