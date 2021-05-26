import java.util.*;
 class annulas{
    double innerRad;
    double outerRad;

   
    final double pi=3.14;

    annulas(double inRad, double outRad){
        innerRad=inRad;
        outerRad=outRad;
    }
    double avgRad(){
      double avgRad=(innerRad+outerRad)/2;
        return avgRad;
    }

     double width(){
        double   width=(outerRad-innerRad)/2;
        return width;
    }

     double area (){
        double  area=2*pi*avgRad()*width();
        return area;
    }

    
}

class maincls{

 
    public static void main(String[] args) {
        
        Scanner scanner1=new Scanner(System.in);

        System.out.print("enter innerRadius : ");
        double innerR=scanner1.nextDouble();

        System.out.print("enter outerRadius : ");
        double outerR=scanner1.nextDouble();

        annulas a1=new annulas(innerR,outerR);
         
        //printing data from func return value
        System.out.println("area is "+a1.area());
        System.out.println("width is "+a1.width());
        System.out.println("average radius is "+a1.avgRad());

       
    }
}