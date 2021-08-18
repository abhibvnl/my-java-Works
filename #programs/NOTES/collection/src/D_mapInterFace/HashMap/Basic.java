//Not Maintains InserTion Order.
//with Generic ,proper way
package D_mapInterFace.HashMap;

import java.util.HashMap;

public class Basic {
   public static void main(String[] args) {
	
	   HashMap<Integer, String> hs=new HashMap<>();
	    hs.put(10,"java");          //cannot use .add() in map
	    hs.put(20, "python");
	    hs.put(30, "JavaScript");
	    
	    System.out.println(hs);
	    hs.put(20, "sql");  //python rplaced by sql
	    System.out.println(hs);
	    
   }
}
