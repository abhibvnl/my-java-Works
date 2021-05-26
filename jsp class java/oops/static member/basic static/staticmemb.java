class c1{
    static int a=10;
    static void f1(){
        System.out.println("body of class c1:Static function");
    }

    
  }
  
    class maincls{

        public static void main(String[] args) {

            System.out.println("\na value(static) of class c1 is "+c1.a); // directly printing static var a of c1
            c1.f1();    //calling Static function
            
            c1.a=100; //reinitialising c1 static var a
            System.out.println("\n Re-initialized static a value is "+c1.a+"\n");

            int maina=c1.a; //assigning c1 static variable in main class var maina
            System.out.println("asiigned value of c1 a, to maincls a,  "+maina);

             // printing with the help of obj
             c1 obj1=new c1(); //obj creation
             System.out.println(" printing a, with the help of obj,"+obj1.a);//printing

             int mainb=obj1.a=200; ////reinitialising c1 static var a with help of obj
             System.out.println("asiigned value of c1 a, to maincls b, with help of obj, "+mainb);


           
        }
    }
  