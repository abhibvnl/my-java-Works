package questionSet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
  public static void main(String[] args) {
	int arr[] = {-4, 3, -9, 0, 4, 1};
	int arr2[] = {1, 2, 3, -1, -2, -3,0,0};

	 int pos=0, neg=0, zeros=0;
	 for(int no: arr2){
	     if(no>0)
	     pos++;
	     else if(no<0)
	     neg++;
	     else 
	     zeros++;
	 }
	   System.out.println((float)pos/arr2.length);
	   System.out.println((float)neg/arr2.length);
	   System.out.println((float)zeros/arr2.length);
	  
	     
	        }

}


/*HackerRank code : oput yes
  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int pos=0;
    int neg=0;
    int zeros=0;
 for(int no: arr){
     if(no>0)
     pos++;
     else if(no<0)
     neg++;
     else if(no==0)
     zeros++;
 }
       System.out.println((float)pos/arr.size());
       System.out.println((float)neg/arr.size());
       System.out.println((float)zeros/arr.size());
     
        }

}
 */

