class sample{
    int x;  //instances are not initilizing
    float y;
    char a;
    boolean b;
    String s;
}

class maincls{
    public static void main(String[] args) {
        
        sample obj1=new sample();

        System.out.println(obj1.x);  // compiler inilizes default values
        System.out.println(obj1.y);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.s);
                                     //run program and see defualt values

    }
}