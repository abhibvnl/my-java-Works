import java.util.Scanner;


class inp{
    public static void main(String[] args) {
      
      Scanner scanner1= new Scanner(System.in);

      System.out.print("enter ur age :");
      int age= scanner1.nextInt ();
      System.out.print("enter ur name :");
      String name=scanner1.next();

      System.out.println("ur age is "+age);
      System.out.println("ur name is "+name);
      
      

    }
}