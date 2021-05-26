class sample{
    int x;   //instance not initialized
}
class maincls{
    public static void main(String[] args) {
        sample obj1=new sample();  //compiler defines default constructor during obj creation
        System.out.println(obj1.x);  //0 
    }
}