/*superDigit(p) = superDigit(9875987598759875)
                  9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5 = 116
    superDigit(p) = superDigit(116)
                  1+1+6 = 8
    superDigit(p) = superDigit(8)*/ //until it comes to single digit
package questionSet2;

public class Q3HKRNK {
   static int superDigit(String s,int k) {
	  int no=0;
	
	  for(char c : s.toCharArray())
		  no+=Character.getNumericValue(c);

	  int rem=0;
	  while(no>=9) {
		   while(no>0) {
			   rem+=no%10;
			   no/=10;
		   }
		   no=rem;  
	  }
	  
	return no;
   }   
   public static void main(String[] args) {
	
	  System.out.println( superDigit("9875987598759875",4));
}
   
  
}
/*
 *  int p=0;
    
    for(char c : n.toCharArray()){
    p = p + Character.getNumericValue(c);
    p = p%9;
    if(p==0)
     p=9;   
}
p= (p*k)%9;
     if(p==0)
     p=9; 

return p;
*/
 