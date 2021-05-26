class sample{
    final int x=10;  // we cannot re initialize/modify it using obj //just we can print
    final static int y=20;
}

class maincls{
    public static void main(String[] args) {
         sample obj1=new sample();
        // obj1.x=20;// this gives error ,coz we cannot assign a value to final variable x
        System.out.println(obj1.x);
        System.out.println(sample.y);
    }
}