//wap to withdaw amt until it reaches min bal 1000
class pwhil1 
{
    public static void main( String[] args)
    {
        double accbal,amt,min;
        accbal =10000.00;
        amt=7000.00;
        min=1000.00;
        
            if(amt<=accbal)
            {
                while(accbal-amt>=min)
                {
                   System.out.println("withdraing " + amt);
                    accbal=accbal-amt;
                 }
                 System.out.println("ur current bal " + accbal);
            }
                 else
                 System.out.println("insuff");



              
              
             
        
                

        
          
         
        
        

       
        

        
    }
}