//area(pi*r*r)/circumfarance(2*pi*r)/diameter(2r) of circle


class circle {

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
        
        double  radius=2.1;
         area(radius);
         crc(radius);
         diam(radius);
         
     }


}