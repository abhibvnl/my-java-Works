import java.util.Scanner;

class role1{
    public static void main(String[] args) {
        
        
        Scanner scanner2=new Scanner(System.in);
        
        System.out.println("enter ur role in these \n teacher \n student \n priciple");
        String role=scanner2.nextLine().toLowerCase();
       
        if(role.equals("teacher"))
        System.out.println("goto staff room");
        
        else if(role.equals("principle"))
        System.out.println("goto room no1");
        
        else
        System.out.println("goto 5th floor");


    }
}