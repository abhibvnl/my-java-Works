class sqr{

    static void sqr()
    {
        int n1=5;
        int res=n1*n1;
        System.out.println("sqr of "+n1+ " is "+ res);
    }
  
    static void sqrPrmtr(int n1)  //parameterized function
    {
      int res= n1*n1;            //can we use same variable in both functions
      System.out.println("sqr of "+n1+" is "+res);
    }


    public static void main(String[] args) {
        sqr();
        sqrPrmtr(6);
    }
}