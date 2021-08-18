/*
mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
package questionSet1;

import java.util.HashMap;
import java.util.Map;

public class Q21map {
    static HashMap<String, String> mapBully(HashMap<String, String> hs){
    	    if(hs.containsKey("a")) {
    	    	hs.put("b",hs.get("a"));
    	    	hs.put("a","");
    	    }
    	return hs;
    }
    
    public static void main(String[] args) {
    	HashMap<String,String> m= new HashMap<String,String>();
    	m.put("a","candy");
		System.out.println(mapBully(m));
	}
}
