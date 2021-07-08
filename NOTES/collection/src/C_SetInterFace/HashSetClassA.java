//->Insertion Order not maintained
package C_SetInterFace;

import java.util.HashSet;

public class HashSetClassA {
  public static void main(String[] args) {
	
	  HashSet hs=new HashSet<>();
	  hs.add(50);
	  hs.add(40.0);
	  hs.add(30);
	  hs.add("java");
	  hs.add(50);
	  hs.add(null);

	  for(Object i: hs)
		  System.out.println(i);
}
}
