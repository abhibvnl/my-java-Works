class maincls{
    String name;
    int age;
     
    maincls(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name+age);
    }
  //maincls m1=new maincls("abhi",22); (we can but no use,calling include here only but need main )

    public static void main(String[] args) {
        maincls m1=new maincls("abhi",22);
    }
}