import java.util.Scanner;
class rcrtobnglr{
   
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



class Train
{

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
        
        
      

        
    }
}