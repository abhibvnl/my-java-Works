package train;

import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
	      
        Scanner scn1=new Scanner(System.in);
        System.out.print("enter date in format of dd-mm-yyyy");
        String date=scn1.next();

        System.out.print("enter Source ");
        String src=scn1.next().toLowerCase();

        System.out.print("enter Destination");
        String dest=scn1.next().toLowerCase();
          
        rcrtobnglr obj=new rcrtobnglr();
        
        if( src.equals("raichur") && dest.equals("bangalore"))
        {
            
            System.out.print("avilable Trains and Tickets :\n udyan :"+obj.udyanTckts+"\n nanded :"+obj.nandedTckts+"\n");
            System.out.println("select Trains ");
            String train=scn1.next().toLowerCase();
            if(train.equals("udyan"))
            obj.udyan();
            else if(train.equals("nanded"))
            obj.nanded();
            else
            System.out.println("invalid Train selection");
            

        }
        
        else
        	System.out.println("invalid source or destinaation");
        
      

        
    }
}