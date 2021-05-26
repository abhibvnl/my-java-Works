class cr2{ 
    int radius=10;
  {   
   
    System.out.println("rad "+radius);  //print without folwr brckt gives errror(this is clled initialzer block)
    radius=20;   //local var of initializer blk
    System.out.println("rad "+radius); 
   }
}


 class maincls
{
    public static void main(String[] args) {
    cr2 obj1= new cr2();
}}