package D_mapInterFace.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapClassB {
    public static void main(String[] args) {
		
       HashMap<Integer,String> hs=new HashMap<>();
   	   
   	   hs.put(1, "Hello");  //1
   	   hs.put(5, "hi");
   	   hs.put(9, "bye");
   	   
   	   Set<Integer> keys = hs.keySet(); //method returns set of keys of type Set InterFace,,
   	  
   	   //for each 
   	   for(int key:keys)
   		   System.out.print(key+" "+  hs.get(key)+"\n");
	}
}
