class sample3{
    int x=10;   //ins var
}
class maincls{

    public static void main(String[] args) {

        sample3 obj1= new sample3();   
        sample3 obj2= new sample3();
        sample3 obj3= new sample3();
        
       // where as instance one copy per obj

        System.out.println(obj1.x);    //10
        obj1.x=100;                   
                                      
        System.out.println(obj1.x);  //100
        System.out.println(obj2.x);   //10
        System.out.println(obj3.x);   //10
       
        obj3.x=300; 

        System.out.println(obj1.x);  //100
        System.out.println(obj2.x);   //10
        System.out.println(obj3.x);   //300
    }
}