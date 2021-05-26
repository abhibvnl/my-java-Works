class c1{
    int a=10;

    void fun1(){
        System.out.println("i am body of instance function");
    }
}

class maincls{
    public static void main(String[] args) {
        
        //printing directly instace var a of c1
        System.out.println("\n c1 a(instance() is "+new c1().a);

        //calling instance function of c1
        new c1().fun1();

        //we cannot directly Re initialize value of instance variable of c1 //assign also cant
        //for that we need to create/declare object

        c1 obji=new c1(); //creating a object is mandatory for instance

        obji.a=100;
        System.out.println("\n c1 a(instance() Re inilised value "+obji.a);

        int maina=obji.a; //assign
        





    }
}