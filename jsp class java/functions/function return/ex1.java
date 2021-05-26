import java.util.*;

class ret1{
    static int sqr(int a)
    {   
        System.out.println("squaring "+ a);
        return a*a;  //return value is multiplication of a
    }
    public static void main(String[] args) {
       
        Scanner scanner1=new Scanner(System.in);
        System.out.print("enter no to be sqred: ");
        int numb=scanner1.nextInt();

        int value1=sqr(numb);    //returned value stored in value1 var
        System.out.println("the squred of "+ numb +" is "+value1);

        System.out.println("the squred res of 6 is "+sqr(6)); // directly printing returned value

        sqr(7); //simply calling function


     
    }
}