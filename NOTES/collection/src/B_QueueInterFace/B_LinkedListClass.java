//2)peek()
//*)when Queue Has Objects returns head element
//*)when Queue is Empty returns Null

package B_QueueInterFace;


import java.util.LinkedList;
import java.util.PriorityQueue;

public class B_LinkedListClass {
   public static void main(String[] args) {
	
	  LinkedList ll=new LinkedList<>();
	  
	
	  ll.add(50);                          //head element
	  ll.add(90);
	  ll.add(60);
	  
	  System.out.println(ll);
	  System.out.println(ll.peek());    //2)return head element
	  
	  ll.clear();                        //removed all Objects
	  System.out.println(ll.peek());    //2)if queue is empty returns null
	  
	  
   }
}