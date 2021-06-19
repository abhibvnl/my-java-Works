//maintain insertion order based on key nly
package D_mapInterFace;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClassA {
  public static void main(String[] args) {
	
	  TreeMap<Integer, Double > tm=new  TreeMap<>();
		
		tm.put(10,105.8);
		tm.put(30,914.5);
		tm.put(20,23.5);//sort based On key
		
		Set<Integer> keys = tm.keySet();
		
		for(int key: keys)
			System.out.println(key+" "+tm.get(key));
		
}
}
