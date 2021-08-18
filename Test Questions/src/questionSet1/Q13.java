//sort and find centered number in array..
package questionSet1;

import java.util.ArrayList;
import java.util.TreeSet;

public class Q13 {
   public static int medianFinder(ArrayList<Integer> al) {
	   System.out.println("Sorted : ");
	   TreeSet<Integer> ts= new TreeSet<>(al);
	   for(int numb: ts)
	    System.out.print(numb+" ");
	   
	   int a[]= new int[ts.size()];
	   int cnt=0;
	  for(int no : ts){
		   a[cnt]=no;
		   cnt++;
	   }
	 System.out.println("\noutPut : ");
	  return a[a.length/2];
   }
   
   public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(9);
	al.add(17);
	al.add(0);
	al.add(3);
	al.add(41);
	al.add(61);
	al.add(10);
	
	System.out.println(medianFinder(al));

}
}
