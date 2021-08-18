package testSet3;

import java.util.LinkedList;
import java.util.List;

public class diffLS {
    static int diffLS(List<Integer> ls){
    	int sml=ls.get(0);
    	int large=sml;
    	for(int i : ls) 
    		if(i<sml)
    			sml=i;
    		else
    			large=i;	
    	   
    	
    	return large-sml;
    }
    
    public static void main(String[] args) {
		 List<Integer> ls= new LinkedList<>();
		 ls.add(10);
		 ls.add(11);
		 ls.add(7);
		 ls.add(12);
		 ls.add(14);
		 
		 System.out.println(diffLS(ls));
	}
}
