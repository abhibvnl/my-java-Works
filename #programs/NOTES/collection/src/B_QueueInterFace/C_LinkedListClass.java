//3)remove() method
//*)when Queue Has Objects,remove and returns head element
//*)when Queue is Empty,returns NSE Exception 

package B_QueueInterFace;


import java.util.LinkedList;
import java.util.PriorityQueue;

public class C_LinkedListClass {
   public static void main(String[] args) {
	
	  LinkedList ll=new LinkedList<>();
	  
	
	  ll.add(50);                          //head element
	  ll.add(90);
	  ll.add(60);
	  
	  System.out.println(ll);
	  System.out.println(ll.remove());    //3remove and return head element
	  System.out.println(ll);
	  
	  ll.clear();                        //removed all Objects
	  System.out.println(ll.remove());    //3)if queue NSE Exception occurs
	  
	  
   }
}