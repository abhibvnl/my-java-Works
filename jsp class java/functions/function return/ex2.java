class ret2{

    static int plus()
    {
        int a=10;
        int b=20;
        int c=a+b;  //c equals to 30
        return c;  //(return a+b or c*c or 200)
        }

    public static void main(String[] args) {
       
        plus();     //jast calling
        //  int retValue=plus(); //storing ret value
        System.out.println("the returned valu is "+plus());  //directly print ou ret value
    }

}