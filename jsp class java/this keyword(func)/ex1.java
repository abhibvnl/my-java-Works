//this keyword contain address of x
class samplethis{
    int x=10;

    void printx1(){
        System.out.println(x);  //compiler auto prefix this keyword,  
                                //when there no similar instance var x in function
     }

    void printx2(){
         int x= 20;
        System.out.println(x+" iam local x");   //prints local  var x,not class copy(not obj value100 )
   }

      void printx3(){
        int x= 30;
       System.out.println(this.x);  //explicitly printing copy of obj(x=100)
   }
}

class maincls{
    public static void main(String[] args) {
        
       samplethis obj1=new samplethis();
       obj1.printx1();

       obj1.x=100;
       obj1.printx1();
       obj1.printx2();
       obj1.printx3();
        }
    }
