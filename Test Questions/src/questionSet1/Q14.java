//find unique int in array
package questionSet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class Q14 {
   public static int uniqFinder(ArrayList<Integer> al) {
	   int uniq=0;
	   int cnt=0;
	   for(int i=0; i<al.size(); i++) {
		   cnt=0;
		    for(int j=0; j<al.size(); j++) 
		    	if(al.get(i)==al.get(j))
		    		cnt++;
		      
		    if(cnt==1)
		    	uniq=al.get(i);
	       }
	    
	   return uniq;
   }
   
   public static void main(String[] args) {
	
	   ArrayList<Integer> al =new ArrayList<>();
	    al.add(4);
	    al.add(3);
	    al.add(1);
	    al.add(4);
	    al.add(2);
	    al.add(1);
	    al.add(3);
	  System.out.println( uniqFinder(al));
}
}
