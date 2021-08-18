package questionSet2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Q2HKRNK {
     static String gridChallege (List<String> ls) {   //abc,def 
    	  String flag="";
    	 for(String s : ls) {
    		 TreeSet<Character> ts =new TreeSet<Character>();
    		  for(int i=0;i<s.length();i++) 
    			   ts.add(s.charAt(i));
    		  String s1="";
    		  
    		for(char c: ts)
    			s1+=c;
    		
    		System.out.println(s1);
    		flag=s.equals(s1)? "YES": "NO";
    		System.out.println(flag);
    		if(flag.equals("NO"))
    			break;
    		
    	 }
    	 
    	 return flag;
     }
     
     static String gridChallege2(List<String> grid) {
    	 
    	 for (int i = 0; i < grid.size(); ++i) {
             char[] s = grid.get(i).toCharArray();
             Arrays.sort(s);
             grid.set(i, new String(s));
         }
                 
         for (int i = 0; i < grid.size()-1; i++) {
             for (int j = 0; j < grid.get(i).length(); j++) {
                 System.out.println(j);
                 if (grid.get(i).charAt(j) > grid.get(i+1).charAt(j)) {
                     return "NO";
                 }
             }
         }
         
         return "YES";  
         }
    	 
    	 
     
     public static void main(String[] args) {
		List<String> ls =new ArrayList<>();
		ls.add("eabcd");
		ls.add("abc");
		ls.add("egf");
		ls.add("pqr");
		
		gridChallege2(ls);
		
	}
}
