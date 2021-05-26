class graph{
    int xaxis;
    int yaxis;
    
    graph(int x,int y){
     xaxis=x;
     yaxis=y;
         }

         void info(){
             System.out.println("graph created @ "+"("+xaxis+"'"+yaxis+")");
         }
}

class maincls{

    public static void main(String[] args) {
        graph g1=new graph(2,5);
        g1.info();
    }
}