package factorial;



public class usingRecursion {
	int factRes=1;
	 
	 int fact(int numb) {
		 
		factRes*=numb;
		numb--;
		
		if(numb!=0) 
			fact(numb)	;	 //Recursion
		return factRes;
		
    	
}
	 
	 public static void main(String[] args) {
		 
		 usingRecursion f=new usingRecursion();
		  System.out.println( f.fact(4));
		 
	}
}