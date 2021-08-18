package D_mapInterFace;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapBasics {
	

	 public static void main(String[] args) {
	       Map<Integer, String> hs = new HashMap<Integer, String>();
	       hs.put(10, "a");
	       hs.put(20, "b");
	       hs.put(30, "c");
	       hs.put(40, "d");
	   //--------------------------------------------------------     
	       Set<Integer> keySet = hs.keySet();
	       for(int key : keySet) 
	    	   System.out.println(hs.get(key));
	       
	       
	      System.out.println("-------------------------------"); 
	      for(Integer key : hs.keySet()) 
	    	   System.out.println(hs.get(key));
	      
	      System.out.println("-------------------------------"); 
	     
	      Set<Map.Entry<Integer,String>> entr=hs.entrySet();
	           for(Object obj : entr)
	        	 System.out.println(obj);
	           
	      System.out.println("-------------------------------"); 
	      
	        for (Entry<Integer, String> entry : hs.entrySet()) {
	            if (entry.getValue().equals("c")) {
	                System.out.println(entry.getKey());
	            }
 
	        }
	        
	        System.out.println("-------------------------------"); 
	        for (Entry<Integer, String> entry : hs.entrySet()) 
	                System.out.println(entry.getKey()+" "+ entry.getValue());
	            
	      
	    }
	}

