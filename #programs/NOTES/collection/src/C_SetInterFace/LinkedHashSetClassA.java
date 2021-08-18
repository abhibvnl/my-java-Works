//->Insertion Order maintained
package C_SetInterFace;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetClassA {
  public static void main(String[] args) {
	
	  LinkedHashSet lhs=new LinkedHashSet<>();
	  lhs.add(50);
	  lhs.add(40.0);
	  lhs.add(30);
	  lhs.add("java");
	  
	  for(Object i: lhs)
		  System.out.println(i);
}
}
