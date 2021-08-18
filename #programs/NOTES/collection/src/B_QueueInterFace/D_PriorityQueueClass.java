//4)poll() method
//*)when Queue Has Objects,remove and returns head element
//*)when Queue is Empty,returns Null
package B_QueueInterFace;


import java.util.LinkedList;
import java.util.PriorityQueue;

public class D_PriorityQueueClass {
   public static void main(String[] args) {
	
	  PriorityQueue pq=new PriorityQueue();
	  
	  pq.add(50);                          //head element
	  pq.add(90);
	  pq.add(60);
	  
	  System.out.println(pq);
	  System.out.println(pq.poll());    //1)reove and returns head element
	  System.out.println(pq);
	  
	  pq.clear();
	  System.out.println(pq.poll());    //1)if Queue returns Null
	
	  
	  
   }
}