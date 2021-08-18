package testSet3;

import java.util.LinkedList;
import java.util.List;

public class MaxAdjDiff {
   
	static int maxAdjDiff(List<Integer> ls) {
	    
		int max=0;
		
		for(int i=0;i<ls.size()-1; i++) 
			if((ls.get(i)-ls.get(i+1)>max))
				max=ls.get(i)-ls.get(i+1);
		   
	
		return max;
	}
	public static void main(String[] args) {
		List<Integer> ls= new LinkedList<>();
		ls.add(10);
		ls.add(11);
		ls.add(7);
		ls.add(12);
		ls.add(14);
		
		System.out.println(maxAdjDiff(ls));

	}
	
}
