//program to store string in Array as a char

package String;
import java.util.*;

public class storeAsChar{
    public static void main(String[] args) {
        String str="abhi";
        char array[]=new char[str.length()];

       for(int i=0; i<str.length(); i++){
           array[i]=str.charAt(i);
       }

       System.out.println(Arrays.toString(array));
     
    }
}