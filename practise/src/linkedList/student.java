package linkedList;

import java.util.LinkedList;

public class student {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("java");
		ll.add(10.5);
		
		System.out.println(ll);
		System.out.println("-------------");
		
		for(Object obj: ll)
		System.out.println(obj);
		
		System.out.println(ll.get(0));
		System.out.println(ll.set(0,null));
		
		System.out.println(ll);
		
	}
}
