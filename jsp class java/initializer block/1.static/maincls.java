class demo1{
    static int x;
   static {
        x=10;
    }

class maincls{
    public static void main(String[] args) {
        System.out.println(demo1.x);
    }
}