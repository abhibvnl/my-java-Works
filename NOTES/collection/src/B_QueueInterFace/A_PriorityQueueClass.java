//1)element()
//*)when Queue Has Objects returns head element
//*)when Queue is Empty returns NSE Exception 

package B_QueueInterFace;


import java.util.LinkedList;
import java.util.PriorityQueue;

public class A_PriorityQueueClass {
   public static void main(String[] args) {
	
	  PriorityQueue pq=new PriorityQueue();
	  
	  pq.add(50);                          //head element
	  pq.add(90);
	  pq.add(60);
	  
	  System.out.println(pq);
	  System.out.println(pq.element());    //1)return head element
	  System.out.println(pq);
	  
	  pq.clear();
	  System.out.println(pq.element());    //1)if Queue is Empty Provides NSE exception
	
	  
	  
   }
}