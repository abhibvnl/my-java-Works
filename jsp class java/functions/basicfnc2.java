class fncdemo2{

    //java prgrm can contain more than 1 fubctions

    static void myMethod1()      //function1
    {
        System.out.println("i am the body of user created function1");
    }

    static void myMethod2()     //function2
    {
        myMethod1();            //calling function1 (fuction can call othr function also )
        System.out.println("i am the body of user created function2");
    }

    public static void main(String[] args) {
      
    
        System.out.println("i am the body of Main function");
        myMethod2();             //calling function2
    }
}