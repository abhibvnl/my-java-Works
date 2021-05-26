import java.util.*;

class circle{
    double radius;
    final double pi=3.14;

     circle( double rad){
         radius=rad;
         System.out.println("\ncreating circle of "+radius);
         area();
         circum();
         diagnal();

     }

       void  area(){
        double area=pi*radius*radius;
        System.out.println("area of circle is :"+area);
         }

        void  circum(){
         double circum=2*pi*radius;
         System.out.println("circumference of circle is :"+circum);
        }
      
         void  diagnal(){
         double diagnal=2*pi*radius;
         System.out.println("diagnal of circle is :"+diagnal+" \n");
        }

}

class maincls{
    public static void main(String[] args) {
        
        double radValues[]=new double[10];

        Scanner scanner1=new Scanner(System.in);
        System.out.print("how much circle do u want? with difrnt rad? : ");
        int cnt=scanner1.nextInt();
        for(int i=0; i<cnt; i++){
            System.out.print("enter rad of circle "+(i+1)+" :");
            radValues[i]=scanner1.nextDouble();
        }

        circle c1=new circle(radValues[0]);
        circle c2=new circle(radValues[1]);
       // circle c3=new circle(radValues[2]);
        
    }
}