// area=len*widyh  pereimeter=2len+2width  diagnal=sqroot((len^2)+(width^2))
//(len^2)+(width^2)=number    nunber=number=2;  dia=(number+1)/2

import java.util.*;
class maincls{

    
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);

        System.out.print("enter length : ");
        double l=scanner1.nextDouble();
        System.out.print("enter width : ");
        double w=scanner1.nextDouble();

        rect r1=new rect(l,w);

        r1.area();
        r1.diagnal();
        r1.perimeter();


    }
}