import java.util.Arrays;  // in order to use Keyword "Array" in program
class sort
  {
    public static void main( String[] args)
    {
        int numbers[]={6,2,8,5,7,4,3,1};
        System.out.println(" un-sorted no's are " + Arrays.toString(numbers));
        Arrays.sort(numbers); //changes original array
        System.out.println("sorted no's are " + Arrays.toString(numbers));

    }

}
       