//used to specify obj type

package Generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class exampleB {
  
	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();  //<Generics>
		
		ll.add("hi");
		ll.add("helo");
		//ll.add(10); //gives error becuase used Generics is String
		ll.add("bye");
		ll.add("okay");
		ll.add("gn");
		
		//for each loop
		
		for(String obj:ll)  //String bcoz String
			System.out.println(obj);
	}
}
