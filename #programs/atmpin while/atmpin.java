import java.util.*;
class atmCheck{

    public static void main(String[] args) {
        int atmPin=1289;
        double bnkAmt=10000.00;

        Scanner scanner1=new Scanner(System.in);

        System.out.print("enter Atm Pin : ");
        int pin=scanner1.nextInt();
        while(atmPin!=pin)
        {
            System.out.println("Invalid pin! :");
            System.out.print("enter Atm pin again : ");
            pin=scanner1.nextInt();
        }

        System.out.print("enter amount : ");
        double amt=scanner1.nextDouble();
        if(amt<=bnkAmt){
            bnkAmt-=amt;
            System.out.println("\nwithdraw Success \nRemain bal is "+bnkAmt+"\n");
        }
        else
        System.out.println("insufficiant fund");
        }
    

}