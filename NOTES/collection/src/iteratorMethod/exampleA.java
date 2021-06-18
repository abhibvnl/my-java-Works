//mainLy used to Traversing Purpose
//if objects are Traversable it returns address of obj of Type <<Iterator>>
package iteratorMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class exampleA {
	  public static void main(String[] args) {
		
		  ArrayList al=new ArrayList<>();
		  
		  al.add(10);
		  al.add("java");
		  al.add(20);
		  
		  
		  //using iterator method
		  Iterator<Object> itr= al.iterator();
		  while(itr.hasNext()) 
		  System.out.println(itr.next());
		  
		  System.out.println("---------------------");
		  
		  //using normal for loop
		   for(int i=0;i<al.size();i++)
			  System.out.println(al.get(i));
		   
		   System.out.println("--------------------");
		   
		   //using for each loop
		   for(Object obj:al)
			   System.out.println(obj);
		   
		   
		 
	}
	}
