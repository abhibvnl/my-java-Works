class sample{

    sample(){    //constructor  //it can be in maicls also
       System.out.println("body of constructor");
    }
}

class maincls{
    public static void main(String[] args) {
        
        sample obj1=new sample();  //creating obj and clling constructor @ a time
    }
}