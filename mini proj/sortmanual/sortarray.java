import java.util.*;
class maincls{

    public static void main(String[] args) {
        
        int array[]={5,7,2,3,8,9};
       
        int temp=0;

        for(int i=0; i<5;i++)
        {
            for(int j=0; j<(5-i);j++)
             {
            if(array[j]>=array[j+1])
            {
            temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
            }
           
            }
       
    }
    System.out.println(Arrays.toString(array));
}
}