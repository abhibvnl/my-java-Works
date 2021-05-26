// area=len*widyh  pereimeter=2len+2width  diagnal=sqroot((len^2)+(width^2))
//(len^2)+(width^2)=number    nunber=number=2;  dia=(number+1)/2
import java.util.*;
class rect{
    double len;
    double width;
   

    rect(double len,double width){
        this.len=len;
        this.width=width;
        
    }

        void area(){
        double area=len*width;
        System.out.println("area of rectngle is : "+area);
        }

        void perimeter(){
        double per=2*len+2*width;
        System.out.println("area of perimeter is : "+per);
        }

        void diagnal(){
            double temp=len*len+width*width;
            temp=temp/2;
        double diagnal=(temp+1)/2;
        System.out.println("area of diagnal is : "+diagnal);
        }

        public static void main(String[] args) {
            Scanner scanner1=new Scanner(System.in);

            System.out.print("enter length : ");
            double l=scanner1.nextDouble();
            System.out.print("enter width : ");
            double w=scanner1.nextDouble();

            rect r1=new rect(l,w);

            area();


        }

}