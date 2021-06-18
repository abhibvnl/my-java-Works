//->Insertion Order maintained
package C_SetInterFace;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClassB {
  public static void main(String[] args) {
	
	  LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
	  lhs.add(50);
	  lhs.add(40);
	  lhs.add(20);
	  lhs.add(60);
	  
	  for(Object i: lhs)
		  System.out.println(i);
}
}
