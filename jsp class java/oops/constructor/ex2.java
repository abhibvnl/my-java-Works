class sample{
    int x=10;

    sample(){
      int x=20; // local var
      System.out.println(x);       // prints local var 20
      System.out.println(this.x);  // prints obj copy 10
     }
}

class maincls{
    public static void main(String[] args) {
    
        sample obj1=new sample();
       
}
}