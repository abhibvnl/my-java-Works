class c1{
    static int a=10; //static var
    static void f1(){  //static fun
        System.out.println("body of class c1:Static function");
    }

    
  }

  class c2{
      static void disp(){
          c1.f1();
        System.out.println("static a,c1 is :"+c1.a);
        System.out.println("body of c2,f2");
      
      }
     
  }
  
    class mainCls{

        public static void main(String[] args) {

            c2.disp();
                   }
    }
  