
import java.util.*;

class atmPin2 {

    static void f1()
    {
      double bnkAmt=10000.00;

            Scanner scanner1= new Scanner(System.in);
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

        

     public static void main(String[] args)
      {
        int attempt=3;
        int atmPin=1289;
        
        
        Scanner scanner1= new Scanner(System.in);
        System.out.print("Enter ATM pin : ");
        int pin = scanner1.nextInt();

        if(pin==atmPin )
         {
             f1();
         }
        else
          {

             System.out.println("Invalid ATm pin : ");
             attempt--;
             //System.out.println( ");
     
             for(int i=0; i<4; i++)
              {
                if(attempt==0){
                    System.out.println("try after 24H");
                    break;
                }
                else{
                System.out.print(attempt+" more chance left\nre-Enter ATM pin : ");
                 pin = scanner1.nextInt();
                if(pin==atmPin)
                {
                  f1();
                   break;
                }
                else
                {
                    attempt--;
                 }
                }
               }
           }

     } 
   }

