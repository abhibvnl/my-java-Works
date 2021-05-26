import java.util.Scanner;

class names{
  static void names(String name)
  {
    System.out.println(name+" "+"\"Bevinal\" ");

  }

   public static void main(String[] args) {
    Scanner scanner2= new Scanner(System.in);

    System.out.print("enter ur name: ");
    String myName=scanner2.nextLine();

    System.out.print("enter ur bro1 name: ");
    String bro1=scanner2.nextLine();

    System.out.print("enter ur bro2 name: ");
    String bro2=scanner2.nextLine();
    
    names(myName);
    names(bro1);
    names(bro2);

   }

}