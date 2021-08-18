//maintain insertion order
package D_mapInterFace.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class Basic {
  public static void main(String[] args) {
	
	  LinkedHashMap<Integer, Double > lhm=new  LinkedHashMap<>();
		
		lhm.put(10,105.8);
		lhm.put(20,914.5);
		lhm.put(30,23.5);
		
		Set<Integer> keys = lhm.keySet();  //Return key set view (keys->10,20,30);
		
		for(int key: keys)
			System.out.println(key+" "+lhm.get(key));
		
}
}
