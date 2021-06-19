//not maintain insertion order
package D_mapInterFace;

import java.util.HashMap;

public class HashMapClassA {
	
  public static void main(String[] args) {
	  
	   HashMap<Integer,String> hs=new HashMap<>();
	   
	   hs.put(1, "Hello");  //1
	   hs.put(5, "hi");
	   hs.put(9, "bye");
	   
	  System.out.println(hs);
	  System.out.println(hs.size());  //2
	  System.out.println(hs.get(9));  //3
	  System.out.println(hs.containsKey(5)); //4
	  System.out.println(hs.containsValue("hi"));  //5
	  
	  System.out.println(hs.remove(5)); //6
	  System.out.println(hs);
	  
	   
	   
	   
	   
	   
	  
}
  
}
