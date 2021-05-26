class pifelseif 
{
    public static void main( String[] args)
    {
        double drawamt=10000.00;
        double bnkamt=10000.00;

        if(drawamt>bnkamt)
        {
            System.out.println("insufiiciant funds");
        }
        else if (drawamt<=bnkamt)
        {
            bnkamt=bnkamt-drawamt;
            System.out.println(" succefull,,, remainng balance "+ bnkamt);

        }
    } 
}