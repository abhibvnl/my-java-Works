class sample3{
    static int x=10;
}

class maincls{

    public static void main(String[] args) {

        sample3 obj1= new sample3();   //object for static(not gud way)
        sample3 obj2= new sample3();
        sample3 obj3= new sample3();
        
         //once the value of x is re initialized in any obj,
         //the same value is copied wn u create new obj,,
         // so static member are one copy  per class    --------important
         // where as instance one copy per obj

        System.out.println(obj1.x);    //10
        obj1.x=100;                   
                                      
        System.out.println(obj1.x);  //100
        System.out.println(obj2.x);   //100
        System.out.println(obj3.x);   //100
       
        obj3.x=300; 

        System.out.println(obj1.x);  //300
        System.out.println(obj2.x);   //300
        System.out.println(obj3.x);   //300

        
    }
}