class pif {
    public static void main( String[]args)
    {
        double bnkamt=5000.00;
        double drawamt=10000.00;
        if (drawamt>bnkamt){
            System.out.println("transaction failed! due to insufficient balance");
        }
    }
}