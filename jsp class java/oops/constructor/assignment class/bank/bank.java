import java.util.*;
class bank{

  double balance;
  
   bank(double bal){
      balance=bal;
    }

    void withdraw(double wamt){
        if(wamt<balance)
        {
            balance=balance-wamt;
            System.out.println("success remains "+balance);
        }
        else
        System.out.println("insufficiant funds");
    }
}

class maincls{
    public static void main(String[] args) {
        
        bank b1=new bank(10000);
        Scanner scanner1=new Scanner(System.in);

        System.out.print("enter amount to be withdraw : ");
        double withdraw=scanner1.nextDouble();
        b1.withdraw(withdraw);


    }
}