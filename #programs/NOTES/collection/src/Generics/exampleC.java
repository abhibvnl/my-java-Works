//for each loop of mixed obj

package Generics;

import java.util.ArrayList;

public class exampleC {
  
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();  
		
		al.add(50);
		al.add(70);
		al.add("Hi"); 
		al.add(60.56);
		al.add("java");
		
		//for each loop
		for(Object obj:al)  //Object bcoz Combine
			System.out.println(obj);
	}
}
