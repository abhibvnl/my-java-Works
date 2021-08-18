//without Generic ,But not propererWay
package D_mapInterFace.HashMap;

import java.util.HashMap;

public class Basic2 {
   public static void main(String[] args) {
	
	   HashMap hs=new HashMap<>();
	    hs.put(10,"java");          //cannot use .add() in map
	    hs.put(20.6, "python");
	    hs.put("hi", "JavaScript");
	    
	   
	    
   }
}
