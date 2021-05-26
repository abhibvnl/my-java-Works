import java.util.Scanner;

class ip2{
    public static void main(String[] args) { 
        
        Scanner scanner1 =new Scanner(System.in);  

        System.out.println("enter age: ");
        int age = scanner1.nextInt(); 
        System.out.println("enter percentage: ");
         float percentage= scanner1.nextFloat();

         System.out.println("enter  name:") ;
         String name= scanner1.next();
         System.out.println("enter clg name:") ;
         String clgName= scanner1.next();
  
         //displaying outputs

         System.out.println(" \n\n name is : "+ name) ;
         System.out.println("college name is : "+clgName ) ;
         System.out.println(" your age is : "+age) ;
         System.out.println("your percentage is : "+ percentage) ;

    }
}