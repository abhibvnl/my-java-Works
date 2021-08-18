//PDC,1.2,J.util
//ini cap=10,Inc cap=Cur cap*2
//PDC,1.0,legacy collection,J.util

package A_listInterFace;

import java.util.Vector;

public class VectorClassA {
 public static void main(String[] args) {
	Vector v=new Vector<>();
	
	v.add(60);
	v.add(40.8);
	v.add(50);
	
	for(int i=0; i<v.size();i++)
		System.out.println(v.get(i));
}
}
