//wap to withdraw 2000 till balance become zero
class pwhile
{
    public static void main(String[] args)
    {
        double accbal=13000.00;
        double wamt=2000;

        while(accbal!=0000)
        {
             if(wamt<accbal)
             {
               System.out.println( "withdrawing "+ wamt);
                accbal=accbal-wamt;
             }
             else 
             {
               System.out.println("insuff and balance is "+ accbal);
                break;
             }
           
         }
           
        
    }      
}