class c1{
    static String  name="Abhi";
}
class maincls{
    String lastName="Bevinal";
    int age;
     
    maincls(int age){
        
        this.age=age;
        System.out.println(c1.name+lastName+age);
    }
  
    public static void main(String[] args) {
        maincls m1=new maincls(22);
     

    }
}