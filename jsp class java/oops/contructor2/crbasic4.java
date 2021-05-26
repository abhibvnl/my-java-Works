class sample{
    int radius=10; //instance variable

    sample(){        // // then from here
        System.out.println("contrt");
        radius=100;   
        System.out.println("non declred radius is "+radius);
      }

       
        {                  
        System.out.println("iniatize "+radius);   
        radius=20;
        System.out.println(radius);   
      }
   }

class maincls{
    public static void main(String[] args) {
        
         sample obj1=new sample();
        
         
    }
}