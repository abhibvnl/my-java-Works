//by default maintain sorted order...
package C_SetInterFace;

import java.util.TreeSet;

public class TreeSetClassA {
  
public static void main(String[] args) {
	  
	   TreeSet<Integer> ts=new TreeSet();
	   
	   ts.add(50);
	   ts.add(60);        // 60.compareTo(50),60>50,returns +1,RHS
	  //ts.add("java);   //error bcoz,it cant implicitly call compareTo method,it voilets rule
	   ts.add(30);       //30.compareTo(50),30<50,returns -1,LHS
	   ts.add(new Integer(15));       //15.compareTo(50),15<50,returns -1,LHS.....
	   ts.add(10);       //..................
	   ts.add(20);
	   ts.add(10);     //auto invoked compareTo method from Integer PDC or Wrapper class
	   
	   for(Object obj: ts)
		   System.out.println(obj);
}
}