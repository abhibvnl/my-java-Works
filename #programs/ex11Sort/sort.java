import java.util.Arrays;
class maincls{

    public static void main(String[] args) {
        int array[]={10,11,7,12,14};
       // int array1[]={5,4,3,2,1};
        for (int j=0;j<array.length;j++){
        for (int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])
            {
                int temp=array[i+1];
                array[i+1]=array[i];
                array[i]=temp;
            }
        }
    }
        System.out.println(Arrays.toString(array));
    }

}