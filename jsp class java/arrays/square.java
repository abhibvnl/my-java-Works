import java.util.Arrays;

class sqr{
    public static void main(String[] args) {

        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int square;
        System.out.println(" \n original array is: " + Arrays.toString(numbers));
        System.out.print(" \n squred array is: ");
        for(int i=0; i<numbers.length; i++)
        {
            square=numbers[i]*numbers[i];
            System.out.print(square+ " ");
        }


    }
}