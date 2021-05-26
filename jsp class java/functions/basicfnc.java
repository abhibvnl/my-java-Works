class fncdemo
{

  static void userMethod()                          //functions should be out of main
    {
     System.out.println("i am the body of user created function");
    }

    public static void main(String[] args)
   {  
        
      userMethod ();                                 //calling square function
      userMethod ();  
                                     //can be call function more than once
    }
}