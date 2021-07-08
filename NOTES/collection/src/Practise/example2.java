package Practise;

import java.util.ArrayList;
import java.util.LinkedList;

public class example2 {
   public static void main(String[] args) {
	
	   ArrayList al=new ArrayList<>();
	   al.add(10);
	   al.add(20);
	   
	   LinkedList ll =new LinkedList();
	   ll.addAll(al);
	   
	   ll.add(30);
	   System.out.println(ll);
	   
	   ll.remove(1);
	   System.out.println(ll);
	   
	   ll.removeAll(al);
	   System.out.println(ll);
}
}
