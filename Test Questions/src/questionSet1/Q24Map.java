package questionSet1;

import java.util.HashMap;

public class Q24Map {
	
  static HashMap<String,String> mapAB(HashMap<String,String> m){
	 
	 if(m.containsKey("a") && m.containsKey("b"))
	  m.put("ab", m.get("a").concat(m.get("b")));
	 
	  return m;
  }
  public static void main(String[] args) {
	  
	  HashMap<String,String> m=new HashMap<String,String>();
	  m.put("a", "Hi");
	  m.put("b", "There");
	  
	  System.out.println(mapAB(m));
}
}


/*mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}*/