import java.util.*;

class math{
    public static void main(String[] args) {
    
        

        Scanner scanner1= new Scanner(System.in);

        System.out.println("\nenter the maths operation u wanna do");
        System.out.print(" + - * / sqr + : ");
        String op=scanner1.next();

        if(op.equals("+"))
        {
             System.out.print("enter no1: ");
            double no1=scanner1.nextDouble();
            System.out.print("enter no2: ");
            double no2=scanner1.nextDouble();
            System.out.println(no1+no2+"\n");

            }

            else if(op.equals("-"))
            {
                 System.out.print("enter no1: ");
                double no1=scanner1.nextDouble();
                System.out.print("enter no2: ");
                double no2=scanner1.nextDouble();
                System.out.println(no1-no2+"\n");
    
                }

                else if(op.equals("*"))
            {
                 System.out.print("enter no1: ");
                double no1=scanner1.nextDouble();
                System.out.print("enter no2: ");
                double no2=scanner1.nextDouble();
                System.out.println(no1*no2+"\n");
    
                }

                else if(op.equals("/"))
            {
                 System.out.print("enter no1: ");
                double no1=scanner1.nextDouble();
                System.out.print("enter no2: ");
                double no2=scanner1.nextDouble();
                System.out.println(no1/no2+"\n");
    
                }
                else if(op.equals("sqr"))
            {
                 System.out.print("enter no: ");
                double no=scanner1.nextDouble();
                System.out.println(no*no);
    
                }
                
                else 
                System.out.println("invalid input\n");
    
    
        

    }
}