package questionSet1;

import java.util.HashMap;

public class Q26Map {
	static HashMap<String,String> topping2(HashMap<String,String> m){
		 
		if(m.containsKey("ice cream")){
	   		   m.put(m.get("ice cream"), "butter");
			     m.remove("ice cream"  );
	   		}
	   		else{
	   		     m.put("bread", "butter");
	   		  	if(m.containsValue("peanuts") && m.containsKey("ice cream"))
	   		  	   	m.put("ice cream", "cherry");
			      if(m.containsKey("bread")){
	      			m.put("ice cream", "cherry");
	      		}
	      	 if(m.containsKey("pancake")){
	      			m.remove("ice cream");
	      		}
	   		}

	   return m;
	  }
	  public static void main(String[] args) {
		  
		  HashMap<String,String> m=new HashMap<String,String>();
		  m.put("a", "Hi");
		  m.put("b", "There");
		  
		  System.out.println(topping2(m));
	}  
}

/*topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}*/