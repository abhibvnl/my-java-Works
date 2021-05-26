import java.util.*;

class atmPin {
     public static void main(String[] args) {
        
        int atmPin=1289;
        double bnkAmt=10000.00;

        Scanner scanner1= new Scanner(System.in);

        System.out.print("Enter ATM pin : ");
        int pin = scanner1.nextInt();

        



      if(pin==atmPin)
      {
        System.out.print("Enter amout : ");
        double amount = scanner1.nextInt();

        if(amount<=bnkAmt)                         //nested if
        {
        bnkAmt=bnkAmt-amount;
        System.out.println("successful... your remains amount : "+bnkAmt);
          }
         else
         System.out.println("insufficiant fund "); 
      }

      else
      System.out.println("Invalid ATm pin : ");


     }
}