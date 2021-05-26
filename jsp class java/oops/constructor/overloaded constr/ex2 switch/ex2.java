class student{

    String name;
    int age;
    long mob;
    String mail;

    student(String n,int a,long m){
      name=n;
      age=a;
      mob=m;
    }
    student(String n,int a,String m){
        name=n;
        age=a;
        mail=m;
      }
      void display(){
          System.out.println("name is "+name);
          System.out.println("age is "+age);
          System.out.println("mob is "+mob);
          System.out.println("mail is "+mail);
      }
}