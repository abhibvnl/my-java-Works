//syntax:- className objName= new className();    //usage(initialize):- objName.var/fun
//like scanner
// mainly used to store data

class c1{
    static int a=10;  //static variable of c1
           int b=20;   //instance variable of c1
}
class maincls{
    public static void main(String[] args) {
        
        //static variable
        
        System.out.println(c1.a); //printing directly

        int c=c1.a; //assigning  directly
        System.out.println(c);  //printing c
        
        c1.a=100;  //Re initialisation directly
        
        c1 objs=new c1(); //obj creation

        System.out.println(objs.a);  // printing with the help of obj

        int d=objs.a=100;  //assigning  with help of obj
        System.out.println(d); //printing d

        objs.a=200;  //Re initialisation with help of obj
        System.out.println(objs.a);  //printing Re initialized value



        //instance  variable
        System.out.println(new c1().a); //printing directly
        int p=new c1().a; //assigning 
        System.out.println(p);  //printing p
        ////(imp)......Re  iniatialization cant b done withot obj


         

         c1 obji=new c1();  //obj creation
     
         System.out.println(objs.b);  // printing with the help of obj

         int q=objs.b=300;  //assigning  with help of obj
         System.out.println(q); //printing d

         objs.b=400;  //Re initialisation with help of obj
         System.out.println(objs.b);  //printing Re initialized value
 
         





       
        

    }
}