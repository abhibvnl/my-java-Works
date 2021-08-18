/*Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc*/

package questionSet2;

public class Q1HKRK {
	 public static void main(String[] args) {
			
		 String orgnlLC="abcdefghijklmnopqrstuvwxyz";
		 String orgnlUC=orgnlLC.toUpperCase();
		  String rotatedStr="";
		  int times=2;
		  

		rotatedStr=orgnlLC.substring(times)+orgnlLC.substring(0,times);
		 
	String givenString="middle-Outz";
	String finalString="";

	for(int i=0;i<givenString.length();i++) {
		 for(int j=0;j<rotatedStr.length();j++) {
			if(Character.isLetter(givenString.charAt(i))) {
				 if(givenString.charAt(i)==orgnlLC.charAt(j) ||givenString.charAt(i)==orgnlUC.charAt(j)) {	 
					   if(Character.isLowerCase(givenString.charAt(i)))
					 	  finalString+= rotatedStr.charAt(j);	
					   else
						  finalString+= Character.toUpperCase(rotatedStr.charAt(j));	
			    }
				 					   
			  }	
		 }
		 if(!Character.isLetter(givenString.charAt(i)))
			  finalString+=givenString.charAt(i);
	}
	System.out.println(finalString);
		
	 }
}

/*Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:      cdefghijklmnopqrstuvwxyzab

m -> o
i -> k
d -> f
d -> f
l -> n
e -> g
-    -
O -> Q
u -> w
t -> v
z -> b*/
/* String ans = "";
    int t =0;
  
    for(char c : s.toCharArray()){
        if(Character.isLetter(c)){
            if(Character.isUpperCase(c)){
            t=((int)(c + k-65))%26;
           
            ans +=  String.valueOf((char)(t + 65));
            }
            else{
                if(Character.isLowerCase(c)){
            t=((int)(c + k-97))%26;
            
            ans +=  String.valueOf((char)(t + 97));
            }
            }
        }
       

        else{
            ans += c;
        }
    }
    return ans;
    }
*/
 