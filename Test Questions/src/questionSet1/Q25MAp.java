package questionSet1;

import java.util.HashMap;

public class Q25MAp {
	static HashMap<String,String> topping(HashMap<String,String> m){
		 
		if(m.isEmpty()){
	   		   m.put("bread", "butter");
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
		  
		  System.out.println(topping(m));
	}  
}
/*topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}*/