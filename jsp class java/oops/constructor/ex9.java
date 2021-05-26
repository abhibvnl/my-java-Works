class demo1{
    demo1(int a){
        System.out.println("hi1");
    }
}

class demo2 extends demo1{
    demo2(){
        super(2);
        System.out.println("hi2");
    } 
    demo2(int a){
        super(2);
        System.out.println("hi2");
    }   
}
class maincls{
    public static void main(String[] args) {
        demo2 obj=new demo2(2);
    }
}