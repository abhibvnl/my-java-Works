import java.util.*;

class ret3w{
        static int sqr(int a)
        {   
       return a*a;  //return value is multiplication of a
         }

    public static void main(String[] args) {
       Scanner scanner1=new Scanner(System.in);

        System.out.print("\n\n prsess 0 to stop \n enter no to sqr :"); 
        int input=scanner1.nextInt();
       
        while(input!=0)
        {
             System.out.println(" squred of "+input+" is "+sqr(input)+"\n");
            System.out.print("\nenter no to be sqr : ");
            input=scanner1.nextInt();
        }

        System.out.println("u quit the operation by clicking 0");


     
    }
}