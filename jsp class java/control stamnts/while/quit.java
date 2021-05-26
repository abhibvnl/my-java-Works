import java.util.Scanner;

class quit {
    public static void main(String[] args) {
        
        Scanner scanner2 = new Scanner(System.in);
        String input="";
       
        System.out.print("type quit to stop");
        while(!input.equals("quit"))
        {
            System.out.print("\nenter something :");
            input=scanner2.next().toLowerCase();
            System.out.println("u entered :" +input);
            
        }
    }
}