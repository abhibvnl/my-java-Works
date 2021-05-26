class sample{
    int x=10;

    sample(){
      int x=20; // local var
      this.x=x;   //copying loc var to obj1
     }
}

class maincls{
    public static void main(String[] args) {
    
        sample obj1=new sample();
        System.out.println(obj1.x);   //20
       
}
}