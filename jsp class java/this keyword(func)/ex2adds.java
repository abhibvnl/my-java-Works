class addobjthis{

    int x=10;
    void  addthis(){
     System.out.println("i am address of this keyword = "+this);
}
}

class maincls{
    public static void main(String[] args) {
        
        addobjthis obj1=new addobjthis();
        System.out.println("\ncheck both 'key'&'obj1' address ");
        System.out.println("i am address of obj1 = "+obj1);
        obj1.addthis();
    }
}