class cls1{
    
   void f1(int a){
        System.out.println("im f1,and my argmnt is"+ a);
    }

    void f2(int a,int b){
        System.out.println("im f2 and my 2 argmnts are"+a+" "+b);
     }

      }
    class maincls
     {
        public static void main(String[] args) {
          
            cls1 obj1= new cls1();
            obj1.f1(10);

            cls1 obj2=new cls1();
            obj2.f2(20,30);

           }
     }