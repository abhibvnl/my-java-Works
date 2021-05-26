import java.util.*;

class maincls{
    public static void main(String[] args) {
        
        Scanner scanner1= new Scanner(System.in);

        System.out.print("enter name :");
        String name=scanner1.next();

        System.out.print("enter id :");
        int id=scanner1.nextInt();

        System.out.print("enter salary:");
        double salary=scanner1.nextDouble();

        employee obj1=new employee(name,id,salary);
        obj1.details();
    }


}