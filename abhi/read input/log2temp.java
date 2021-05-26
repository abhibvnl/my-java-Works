import java.util.Scanner;

class temp{

    public static void main(String[] args) {

       Scanner scanner1=new Scanner(System.in);  // scanner1 for number

       System.out.print("enter measured temperature: ");
       int temp =scanner1.nextInt();
       boolean isWarm=temp>35 && temp<100;

        if (isWarm==true)
        System.out.println("yes its warm");
        else
        System.out.println("no, its cool");
    }
}