class finalmem{
    final int x;   //compiler not going to define default constructr 
    final static int y;             //-->when inst var declared as final
     }

     class maicls{
          public static void main(String[] args) {
              finalmem obj1=new finalmem();
             System.out.println(obj1.x);
          }           //compile the prog the read the error
     }

     //in order to fix, we have to initialize the ins var with final
     //example final int x=10;
     //or 
     //with the help of contrctr we can re initalize