class cr3 {

    cr3(int a){ //cr1
        System.out.println("cntr1 nd my args "+a);
    }

    cr3(int b,int c){    //cr2
        System.out.println("cntr1 nd my args "+b+" "+c);
    }

    {
        System.out.println("im intilizer,optinal also");
    }
}
 class maincls{
     public static void main(String[] args) {
         cr3 obj1=new cr3(10); //we should pass argmnts while creating obj
         cr3 obj2=new cr3(20,30); //we cant use same obj for two constrr
         
     }
 }