package A_listInterFace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QBasics {
  public static void main(String[] args) {
	
	  List<String> ls=new ArrayList<>();
	  ls.add("bcadef");
	  ls.add("acdfe");
	 
	for(int i=0;i<ls.size();i++) {
		 char c[] =ls.get(i).toCharArray();
		 
		 Arrays.sort(c);
		 
		 String s=new String(c);
		
		 ls.set(i, s);
	}
	
	System.out.println(ls);
	 
  
}
}
