package questionSet1;

import java.util.HashMap;
import java.util.Map;

public class Q22MAp {
	public HashMap<String, String> mapShare(HashMap<String, String> m) {
		   if(m.containsKey("a")) {
		    	    	m.put("b",m.get("a"));
		    	    	m.remove("c");
		    	    }
		    	    else
		    	      m.remove("c");	

		    	return m;
		}
	public static void main(String[] args) {
		HashMap<String, String> m =new HashMap<String, String>();
		m.put("aaa", "bbb");
	}

}


/*mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}*/