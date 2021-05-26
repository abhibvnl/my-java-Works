import java.util.Arrays;
class maincls{
  static  int max=0;
  static  int temp=0;
  
    static int max(int n1,int n2){
         max=0;
         if(n1<n2){
         for(int i=n1;i<n2;i++){
            max++;  
            if(temp<max)
            temp=max;
           } 
          return temp;
          }
        else
        {
         for(int i=n2;i<n1;i++){
             max++;
            if(temp<max)
            temp=max;
           } 
        return temp;
         }
    }
    public static void main(String[] args) {
      
       
                int array[]={10,11,7,12,14};
                System.out.println(Arrays.toString(array));
                int res=0;

                for(int i=0;i<array.length-1;i++)
                 {
                res= max(array[i],array[(i+1)]);
                   }
       
             System.out.println(res);
            }
        }
