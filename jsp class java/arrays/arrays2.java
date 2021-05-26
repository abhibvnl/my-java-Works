//arrays declartion method1

import java.util.Arrays;

class array2nd {
    public static void main(String[] args) {
        
         int a1[];
         a1 =new int[10];   // arrays initioilization type1

         int a2[]= new int[10]; // type 2 created a arrays ,,values 0 with size of 10 in memory

         System.out.println(a1[6]); //for display individual data accessed by index 6

         System.out.println(Arrays.toString(a1)); //for all data method 1

         for(int i=0;i<a1.length;i++)  //for all data method2
         {  
           
            System.out.print(a1[i]+" ");
         }

         //storing values

          for(int i=0 ;i<a1.length; i++ )
          {
             // for (int j=0; j<a1.length;j++)
             // {
              //   a1[i]=j;
              // }
             a1[i]=i; 
          }
        System.out.println("\n stord values are "+ Arrays.toString(a1));


    }
}