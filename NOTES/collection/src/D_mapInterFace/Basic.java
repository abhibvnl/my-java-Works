package D_mapInterFace;

import java.util.HashMap;

public class Basic {
   public static void main(String[] args) {
	
	   HashMap<Integer, String> hs=new HashMap<>();
	    hs.put(10,"java");
	    hs.put(20, "python");
	    hs.put(30, "JavaScript");
	    
	    System.out.println(hs);
	    hs.put(20, "sql");  //python rplaced by sql
	    System.out.println(hs);
	    
   }
}
