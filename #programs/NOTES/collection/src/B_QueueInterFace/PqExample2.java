////Queue traversing is FIFO
package B_QueueInterFace;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PqExample2 {
   public static void main(String[] args) {
	
	   PriorityQueue<Integer> pq=new PriorityQueue<>();
	   
	 
	   pq.add(10);
	   pq.add(20);
	   pq.add(30);  //stored as //10 20 30  //where 1st Object is Head element
	  
	   System.out.println("------------------");
	   
	   System.out.println( pq.element());  //return head element 10  //10 20 30
	   System.out.println( pq.element());  //return head element 10  //10 20 30
	   
	   System.out.println("------------------");
	   
	   
	   //Queue traversing is FIFO ,to achive that use remove(); method
	   
	   System.out.println(pq);
	   
	   System.out.println(pq.remove()); //return and removes 1st insided element(10)  //20 30  
	   System.out.println(pq.remove()); //return and removes 2st insided element(20)  //30
	   System.out.println(pq.remove()); //return and removes 3st insided element(30)  //empty
	   
	   System.out.println(pq);

	   
	 
}
}
