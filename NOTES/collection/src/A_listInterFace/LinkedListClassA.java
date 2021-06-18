//no Initial cap,no Inc cap,PDC,1.2,J.util
//Object stored In form of nodes
//[previousAddrss,Object.NextAdress]=Node

package A_listInterFace;

import java.util.LinkedList;

public class LinkedListClassA {
  
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList<>();
		ll.add(50);
		ll.add("hi");
		ll.add(20);
		
		for(int i=0; i<ll.size(); i++) 
			System.out.println(ll.get(i));
		
	}
}
