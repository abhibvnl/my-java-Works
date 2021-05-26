class while6
{
    public static void main(String[] args)
     {
        double bnkAmt =13000.00;
        double Amt =2000.00;
        double min =1000.00;

        while(bnkAmt-Amt>=min)
        {
            if(Amt<=bnkAmt)
            {
            bnkAmt-=Amt;
            System.out.println("success ,remains : "+ bnkAmt);
            }
            else
            System.out.println("insuffficinat");
        }
    }
}