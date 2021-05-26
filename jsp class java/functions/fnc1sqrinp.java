import java.util.Scanner;

class fncinp{
 
  static void sqr()
  {
      Scanner scanner1=new Scanner(System.in);
      System.out.print("enter the number to be squre :");
      int num=scanner1.nextInt();
      int res=num*num;
      System.out.println("square of "+ num+ " is "+res);

  }

    public static void main(String[] args) {
      sqr();
      sqr();  
    }

}