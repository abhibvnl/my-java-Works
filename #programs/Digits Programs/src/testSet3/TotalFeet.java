package testSet3;

import java.util.LinkedList;
import java.util.List;

public class TotalFeet {
    
	static int totalFeet(List<Integer> ls) {
		int res=0;
		for(int i: ls) 
		  res+=i/12;
		 
		return res;
	}
	
	public static void main(String[] args) {
		 List<Integer> ls= new LinkedList<>();
		 ls.add(18);
		 ls.add(11);
		 ls.add(27);
		 ls.add(12);
		 ls.add(14);
		 
		 System.out.println(totalFeet(ls));
		 
	}
}
