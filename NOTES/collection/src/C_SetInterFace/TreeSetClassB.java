package C_SetInterFace;

import java.util.TreeSet;

public class TreeSetClassB {
   public static void main(String[] args) {
	  
	   TreeSet<String> ts=new TreeSet<String>();
	   
	    ts.add("B"); 
	    ts.add("A");    //auto invoked compareTo method from String PDC or Wrapper class
	    ts.add("C"); 
	    ts.add("Z"); 
	   
	   for(String obj: ts)
		   System.out.println(obj);
}
}