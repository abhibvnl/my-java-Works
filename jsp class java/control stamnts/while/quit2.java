import java.util.Scanner;
//do not allow to display quit
class quit2 {
    public static void main(String[] args) {
        
        Scanner scanner2 = new Scanner(System.in);
        String input="";
       
       
        while(!input.equals("quit"))
        {
            System.out.print("enter something :");
            input=scanner2.nextLine().toLowerCase();
           // if (!input.equals("quit"))
           // System.out.println("u entered :" +input); 

            //another logic
             if (input.equals("quit"))
            break;
             System.out.println("u entered :" +input); 

             //
            
        }
    }
}