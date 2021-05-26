import java.util.*;

class evenodd
{
    static void even1(int e)
  {
    System.out.print(" "+e);
   }   

   static void odd1(int o)
  {
    System.out.println(o);
   }   

   public static void main(String[] args) 
     {
        int oddM[];
        oddM=new int[20];
        System.out.println("evn no :");
        for(int i=1; i<=20; i++)
        {   
         
        if(i%2==0)
         {
             even1(i);
         }
          else
          oddM[i]=i;
        }

         System.out.println("\nodd no :");
         
         for(int j=1; j<oddM.length; j++)
         {
         if(oddM[j]%2!=0)
         System.out.print(" "+oddM[j]);
         }
         
        }
      
    }

