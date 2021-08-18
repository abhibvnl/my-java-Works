//max diffrence in entire array
package maxDiffrence;

import java.util.Arrays;

public class InArray {
	 static  int max=0;
	  static  int temp=0;
	  
	    static int max(int n1,int n2){
	         max=0;
	         if(n1<n2){
	         for(int i=n1;i<n2;i++){
	            max++;  
	            if(temp<max)
	            temp=max;
	           } 
	          return temp;
	          }
	        else
	        {
	         for(int i=n2;i<n1;i++){
	             max++;
	            if(temp<max)
	            temp=max;
	           } 
	        return temp;
	         }
	    }

	    public static void main(String[] args) {
	      
	               
	                int array[]={10,11,7,12,28};
	                int sml=array[0],large=array[0];
	                System.out.println(Arrays.toString(array));

	                int res=0;
                    
	                //entire array
	                for(int i=0;i<array.length;i++) 
	                	if(array[i]<sml) 
	                		sml=array[i];
	                		else
	                	    large=	array[i];	
	                
	                //between two no in array
	                for(int i=0;i<array.length-1;i++) 
	                	res=max(array[i],array[i+1]);
	                
	                System.out.println("max diffrence in only 2 no :"+res);	
	                System.out.println("max diffrence in entire Array : "+(large-sml) );
	               
	            }
	        }
