class sample{
    int x=10;
    int y=20;

    sample(int arg1,int arg2){

        x=arg1;
        y=arg2;
    }
}

class maincls{
    public static void main(String[] args) {
        
        sample obj1=new sample(100,200);  //shpuld pass arguments while creating obj only

        System.out.println(obj1.x);  //100
        System.out.println(obj1.y);  //200

        sample obj2=new sample(300,400);
        System.out.println(obj2.x); 
        System.out.println(obj3.y); 
       
        
    }
}