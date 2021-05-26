class p2
{
    public static void main( String[] args)
    {
        double accbal,amt,min;
        accbal=23513.00;
        amt=3613.00;
        min=1000.00;

        while(amt<=accbal && accbal-amt>min)
        {
            System.out.println("withdrawing " + amt);
            accbal=accbal-amt;
        }
        System.out.println("current bal "+ accbal);
    }

}