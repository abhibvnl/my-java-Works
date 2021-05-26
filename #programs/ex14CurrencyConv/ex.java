import java.util.Scanner;
class currncy{
   static double dollar(double amount){
        double dollar=amount*0.014;
        return dollar; 
    }

  static   double euro (double amount){
        double euro=amount*0.012;
        return euro; 
    }

    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("its INR to other currency converter");

        System.out.print("enter Amount in Rs : ");
        int rs=scanner1.nextInt();

        System.out.println("selct to which curency u want to convert");
        System.out.println("1.dollar \n2.euro : ");
        int option=scanner1.nextInt();


       
         if(option==1)
         System.out.println("in Dollar "+dollar(rs));
         else if(option==2)
         System.out.println("in euro "+euro(rs));
         else
         System.out.println("Invalid selection");

    }

}
