package B_QueueInterFace;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PqExample1 {
   public static void main(String[] args) {
	
	   PriorityQueue<Integer> pq=new PriorityQueue<>();
	   
	 
	   pq.add(10);
	   pq.add(20);
	   pq.add(30);
	   
	   for(int i : pq)
		   System.out.println(i);
}
}
