class maincls{

  static int x=10;

   
    static int f1(){
       
        return x;
    }

    static void f2(){
        int x=30;
        System.out.println(x+f1());    //local var+10;  ====20
        System.out.println(maincls.x+f1());  //static var+10;
    }

    public static void main(String[] args) {
        f2();
    }
}