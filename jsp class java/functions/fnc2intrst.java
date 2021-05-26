
//p=priciple amount t=time in years r=rate of interst
class interest{
    static void interest( double p,int t,int r)
    {
        
        double intrst=(p*t*r)/100;
        System.out.println("intrest is "+intrst);

    }

    public static void main(String[] args) {
        interest(10000,2,3);
    }
}