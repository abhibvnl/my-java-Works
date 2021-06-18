package compareToMethod;

import java.util.TreeSet;

public class exampleA {
  public static void main(String[] args) {
	
	  TreeSet<Integer> ts=new TreeSet<Integer>();  //implicitly calls compareTo method
	  
	  ts.add(50);
	  ts.add(20);
	  ts.add(60);
	  ts.add(40);
	  
	  for(int obj: ts)
		  System.out.println(obj);
}
}
