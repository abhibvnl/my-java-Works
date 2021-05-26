//arrays declaration method 2

import java.util.Arrays;  // in order to use Keyword "Array" in program
class p4 
  {
    public static void main( String[] args)
    {
        int numbers[]={2,3,5,7,4};
        int numbers2[]={1,2,3,4,5};
        String fruits []={"apple","graphes","banana"};

        System.out.println(Arrays.toString(fruits)); //display type 1
        for(String fruit :fruits)//display type 2 "using for each loop"
        System.out.println(fruit);

        for(int i=0; i<fruits.length; i++) //display type3 uding for loop
        System.out.println(fruits[i]);

        System.out.println(Arrays.toString(numbers)); //display type 1
        Arrays.sort(numbers); //its changes orinal array//same  follwd by nxt line
        System.out.println(" the sorted nmbers are " + Arrays.toString(numbers));//same 
        int len=numbers2.length; 
        System.out.println( " length of no2 is " + len); 
        System.out.println( " length of no1 is " + numbers.length); //changes by sort  
       
        System.out.println(Arrays.toString(numbers)); //modified by sort property

        numbers2[1]=1;  //re -writing value
        fruits[1]="banana";
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(fruits));
    }
  }