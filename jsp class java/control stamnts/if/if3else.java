class pifelse 
{
    public static void main( String[]args)
    {
       double bnkamt=10000.00;
       double drawamt=7000.00;

       if(drawamt>bnkamt)
       {   
           System.out.println("transaction failed ,insufficient balance");
       }
       else{
           bnkamt=bnkamt-drawamt;
           System.out.println("transction successfull remaing balance " + bnkamt);
       }
     }
    }