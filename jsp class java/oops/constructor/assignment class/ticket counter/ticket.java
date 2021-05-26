import java.util.*;
class ticketCounter1{
    int tickets=100;

    void tick(int buy){
        if(buy<tickets){
            tickets=tickets-buy;
            System.out.println("u bought "+buy+ " tickets");
        }
        else{
            System.out.println("insufficiant");
        }
        
    }
}
/*class ticketCounter2{
    int ticket=100;
    void tick(){
        if()
    }
}*/

class maincls{
    public static void main(String[] args) {
        
        Scanner scanner1=new Scanner(System.in);
        System.out.print("enter no of tickets u want : ");
        int buy=scanner1.nextInt();
        
        ticketCounter1 t1=new ticketCounter1();
        t1.tick(buy);
       
    }
}