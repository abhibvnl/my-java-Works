import java.util.Scanner;

class quit {
    public static void main(String[] args) {
        
        Scanner scanner2 = new Scanner(System.in);
        String input="quit";   //even inpt is quit its executes once 
       
         do {
              System.out.print("enter something :");
            input=scanner2.next().toLowerCase();
            System.out.println("u entered :" +input);
         }
        while(!input.equals("quit"))
        
    }
}