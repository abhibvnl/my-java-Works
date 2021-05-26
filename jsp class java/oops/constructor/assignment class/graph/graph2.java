import java.util.*;

class graph{
    int xaxis;
    int yaxis;
    
     graph(int x,int y,int p){
     xaxis=x;
     yaxis=y;
     info(p);
         }

         void info(int p){
             System.out.println("graph created @p"+p+" of "+"("+xaxis+"'"+yaxis+")");
         }
   }
       

class maincls{
    public static void main(String[] args) {
        
        int xValues[]=new int[10];
        int yValues[]=new int[10];

        Scanner scanner1=new Scanner(System.in);
        System.out.print("how much graph do u want? with difrnt x and y? : ");
        int cnt=scanner1.nextInt();
        for(int i=0; i<cnt; i++){
            System.out.print("enter x of graph "+(i+1)+" :");
            xValues[i]=scanner1.nextInt();
            System.out.print("enter y of graph "+(i+1)+" :");
            yValues[i]=scanner1.nextInt();
        }

        graph g1=new graph(xValues[0],yValues[0],1);
        graph g2=new graph(xValues[1],yValues[1],2);
       // graph g2=new graph(xValues[1],yValues[1]);
      
        
    }
}