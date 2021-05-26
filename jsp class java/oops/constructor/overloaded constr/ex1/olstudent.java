import java.util.*;

class student{
    String name;
    int age;
    long mob;
    String mail;

    student(String name,int age,long mob){
        this.name=name;
        this.age=age;
        this.mob=mob;
      }
    student(String name,int age,String mail){
        this.name=name;
        this.age=age;
        this.mail=mail;
      }

    void display(){
  System.out.println("name is "+name+ " \nage is "+age+"\nmail id is "+mail+ "\nno is "+mob);
    }
}
class maincls{
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);

        System.out.print("enter name : ");
        String name=scanner1.next();

        System.out.print("enter age : ");
        int age=scanner1.nextInt();

        System.out.print("enter mailId : ");
        String mail=scanner1.next();

        System.out.print("enter mob no : ");
        long mob=scanner1.nextLong();



        student obj1=new student(name,age,mob);
        student obj2=new student(name,age,mail);

        obj1.display();
    }
}