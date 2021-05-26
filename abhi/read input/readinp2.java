import java.util.Scanner;

class ip2{
    public static void main(String[] args) {  //we cant use same scanners for numbers and strings
        
        Scanner scanner1 =new Scanner(System.in);  //sacnner1 for numbers

        System.out.println("enter age: ");
        int age = scanner1.nextInt(); 
        System.out.println("enter percentage: ");
         float percentage= scanner1.nextFloat();

         Scanner scanner2 =new Scanner(System.in);  //scanner2 for string

         System.out.println("enter  name:") ;
         String name= scanner2.nextLine();
         System.out.println("enter clg name:") ;
         String clgName= scanner2.nextLine();
  
         //displaying outputs

         System.out.println(" \n\n name is : "+ name) ;
         System.out.println("college name is : "+clgName ) ;
         System.out.println(" your age is : "+age) ;
         System.out.println("your percentage is : "+ percentage) ;

    }
}