import java.util.Scanner;
class maincls{
    public static void main(String[] args) {
       Scanner scn1=new Scanner(System.in) ;

       System.out.print("Enter maggi of the Number U want : ");
       int numb=scn1.nextInt();
       for(int i=1;i<=10;i++)
       System.out.println(numb+"*"+i+"="+(numb*i));
    }
}