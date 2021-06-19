//Maitains Insertion order
package D_mapInterFace;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapClassB {
   int id;
   String name;
   
@Override
public String toString() {
	return "HashMapClassD [id=" + id + ", name=" + name + "]";
}

public LinkedHashMapClassB(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public static void main(String[] args) {
	
	LinkedHashMapClassB e1=new LinkedHashMapClassB(23,"tom");  
	LinkedHashMapClassB e2=new LinkedHashMapClassB(21,"jerry");  
	LinkedHashMapClassB e3=new LinkedHashMapClassB(22,"ram");  
      
	LinkedHashMap<Integer, LinkedHashMapClassB > lhm=new  LinkedHashMap();
	
	lhm.put(10,e1);
	lhm.put(20,e2);
	lhm.put(30,e3);
	
	Set<Integer> keys = lhm.keySet();
	
	for(int key: keys)
		System.out.println(key+" "+lhm.get(key));
	
}
   
}
