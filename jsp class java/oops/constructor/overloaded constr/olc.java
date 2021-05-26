//overloaded constr means more than one constru that should be diffrent parameter types.

class sample{
   int x;
   double y;

    sample(int arg1){   //constructor 1
        x=arg1; 
    }
    sample(double arg2){   //constructor 2
        y=arg2;
    }
     
    sample(int arg1,double arg2){ //constructor 3
        x=arg1;
        y=arg2;
    }
    sample(double arg1,int arg2){  //constructor 4
        x=arg2; 
        y=arg1;
    }

    void display(){   //fun
        System.out.println("x is "+x+"\n y is "+y);
    }


}

class maincls{
    public static void main(String[] args) {
        sample obj1=new sample(2); //(c1)follows one of the constr in class sample
        obj1.display();
        
        sample obj2=new sample(2,3.0); //(c3)follows one of the constr in class sample
        obj2.display();
        
        sample obj3=new sample(9.0,4);  //(c4)follows one of the constr in class sample
        obj3.display();
        
        sample obj4=new sample(2.0);   //(c2)follows one of the constr in class sample
        obj4.display();
        
    }
}