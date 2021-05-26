//no/3 fizz ,no/5 buzz ,no/3,5 fizzbuzz
class p3
{
  public static void main(String [] args)
{
    for(int i=1; i<=50; i++)
    {
       if (i%3==0 && i%5==0)
       System.out.println("fizzbuzz");
       else if (i%5==0)
       System.out.println("buzz");
       else  if (i%3==0)
       System.out.println("fizz");
      
      
       
    }

}

    
}