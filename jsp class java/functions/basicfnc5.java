

class maincls{ 
    static int x=20;

    maincls(){
        x=30;
       System.out.println(x);

    }

    static void f1(){
        System.out.println(x);
    }

   public static void main(String[] args) {
   
    maincls obj1=new maincls();
    maincls obj2=new maincls();
     System.out.println(x);
     f1();

   }
   
    
}