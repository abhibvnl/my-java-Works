import java.util.*;
class maincls{
    public static void main(String[] args) {
        
      Scanner scanner1=new Scanner(System.in);
      
      System.out.print("enetr name : ");
      String name=scanner1.next();

      System.out.print("enter age : ");
      int age=scanner1.nextInt();

      System.out.print("enetr ur choice 1 for mob 2 for mail : ");
      int choice=scanner1.nextInt();

      switch (choice) {
          case 1:  System.out.print("enter mob : ");
                   long mob=scanner1.nextLong();
                   student obj1=new student(name,age,mob);
                   obj1.display();
          break;
          
         case 2: System.out.print("enter mail id : ");
                 String mail=scanner1.next();
                 student obj2=new student(name,age,mail);
                 obj2.display();
              
        break;
      
       default:System.out.println("invalid choice");
       break;
      }
    }
}