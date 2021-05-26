import java.util.*;
class eoArray
{
public static void main(String[] args) 

{     int evenM[];
      int oddM[];
       evenM=new int [21];
       oddM= new int [21]; 

        for(int i=1; i<=20; i++)
        {   
         
        if(i%2==0)
         evenM[i]=i;
         else
         oddM[i]=i;
         }

         System.out.println("even no");
         for(int j=1; j<evenM.length; j++)
         {
         if(evenM[j]%2==0)
         System.out.print(" "+evenM[j]);
         }

         System.out.println("\n oddd no");
         for(int k=1; k<oddM.length; k++)
         {
         if(oddM[k]%2!=0)
         System.out.print(" "+oddM[k]);
         }

        
         }


     

    }

