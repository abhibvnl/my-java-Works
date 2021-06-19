package D_mapInterFace;

import java.util.HashMap;
import java.util.Set;

public class HashMapClassD {
   int id;
   String name;
   
@Override
public String toString() {
	return "HashMapClassD [id=" + id + ", name=" + name + "]";
}

public HashMapClassD(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public static void main(String[] args) {
	
	HashMapClassD e1=new HashMapClassD(23,"tom");  
	HashMapClassD e2=new HashMapClassD(21,"jerry");  
	HashMapClassD e3=new HashMapClassD(22,"ram");  
      
	HashMap<Integer, HashMapClassD > hs=new HashMap<>();
	
	hs.put(10,e1);
	hs.put(20,e2);
	hs.put(30,e3);
	
	Set<Integer> keys = hs.keySet();
	
	for(int key: keys)
		System.out.println(key+" "+hs.get(key));
	
}
   
}
