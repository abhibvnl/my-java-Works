package listInterFace;

import java.util.ArrayList;

public class ArrayListClassB {
  public static void main(String[] args) {
	
	  ArrayList al=new ArrayList<>();
	  
	  al.add(10);
	  al.add("java");
	  al.add(20);
	  
	  //using normal for loop
	   for(int i=0;i<al.size();i++)
		  System.out.println(al.get(i));
	   
	   System.out.println("--------------------");
	   
	   //using for each loop
	   for(Object obj:al)
		   System.out.println(obj);
	   
	  
}
}
