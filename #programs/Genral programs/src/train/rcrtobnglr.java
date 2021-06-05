package train;

import java.util.Scanner;

public class rcrtobnglr {

    int udyanTckts=150;
    int nandedTckts=180;

    Scanner scn1=new Scanner(System.in);
    int udyan(){
       
        
        System.out.println("how many tickets u want to book");
        int tckts=scn1.nextInt();
        if(tckts<udyanTckts){

        udyanTckts-=tckts;
        System.out.println("congrts u booked "+tckts+" tickets");
        System.out.println("available tickets :"+udyanTckts);
         
        }
        else
        System.out.println("NO tickets");
        return udyanTckts;
    }
       int nanded(){
        
        
        System.out.println("how many tickets u want to book");
        int tckts=scn1.nextInt();
        if(tckts<nandedTckts){

        nandedTckts-=tckts;
        System.out.println("congrts u booked "+tckts+" tickets");
        System.out.println("available tickets :"+nandedTckts);
         
        }
        else
        System.out.println("NO tickets");
        return nandedTckts;
    }


}

