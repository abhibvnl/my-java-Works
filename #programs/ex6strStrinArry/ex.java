//program to store string in Array as a char
import java.util.*;
class maincls1{
    public static void main(String[] args) {
        String str="abhi";
        char array[]=new char[str.length()];

       for(int i=0; i<str.length(); i++){
           array[i]=str.charAt(i);
       }

       System.out.println(Arrays.toString(array));
     
    }
  
}
//program to store string in Array
class maincls2{
    public static void main(String[] args) {
        String str="abhi";
        String array[]=new String[1];

       array[0]=str;

       System.out.println(Arrays.toString(array));
     
    }
  
}