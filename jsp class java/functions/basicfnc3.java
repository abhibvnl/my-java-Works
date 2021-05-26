class test {
    int f1(){
        int a=10;
        return a;
    }
    int f2(){
        int b=10+f1();
        return b;
    }
}
class maincls{
   static int f3(){
       int a=15;
       return a;
   }

    public static void main(String[] args) {
        //-----------------
         int b=15+f3();
         System.out.println(b);
        //-----------------
        test t1=new test();
        System.out.println(t1.f2());
    }
}