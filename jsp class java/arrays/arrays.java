import java.util.Arrays;  // in order to use Keyword "Array" in program
class p4 
  {
    public static void main( String[] args)
    {
        int numbers[]={2,3,5,7,4};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers); //its changes orinal array//same  follwd by nxt line
        System.out.println(" the sorted nmbers are " + Arrays.toString(numbers));//same  
        System.out.println( " length of arrays is " + numbers.length); //changes by sort  
       
        Systkem.out.println(Arrays.toString(numbers));
    }
  }