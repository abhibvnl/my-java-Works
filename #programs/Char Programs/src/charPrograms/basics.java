package charPrograms;

public class basics {
 public static void main(String[] args) {
	  
	 System.out.println(Character.getNumericValue('A')); //10
	 System.out.println(Character.getNumericValue('B')); //11
	 
	 System.out.println(Character.getNumericValue('a')); //10
	 System.out.println(Character.getNumericValue('b')); //11
//------------------------------------------------------------------------------------	 
	 System.out.println(Character.getNumericValue('1'));  //1
	 System.out.println(Character.getNumericValue('2'));  //2
//------------------------------------------------------------------------------------	 
	 System.out.println(Character.getNumericValue('-'));  //-1
	 System.out.println(Character.getNumericValue('$'));  //-1
//-------------------------------------------------------------------------------------	 
	 
	 System.out.println(Character.isUpperCase('A')); //true
	 System.out.println(Character.isLowerCase('b'));  //true
	 
	 System.out.println(Character.isLetter('-'));  //false
     
	 int space=' ';
	 System.out.println(space);
//-------------------------------------------------------------------------------------	 
	 
	    
	     char c1='A';  
	     char c2='A'; 
		 int res=c1+c2; //calculate ascii value of A and A
		 
		 int res2=Character.getNumericValue('A')+Character.getNumericValue('A'); //10+10;
		 
		 System.out.println(res); //65+65
		 
		 System.out.println(res2);//20
//-------------------------------------------------------------------------------------	 
		 
		  String str="Hello Wordld";
		 for(int i=0; i<str.length() ;i++) 
			  if(str.charAt(i)==' ') // or ==32
				  System.out.println(i);
//-------------------------------------------------------------------------------------	 
		 
	  char c3='a';
	  System.out.println(Character.toUpperCase(c3));  //A
	 
//-------------------------------------------------------------------------------------	 
	 int n=65;
	 char c4=(char) n;
	 System.out.println(c4);   //A
	 
	 char c5= (char) (c4+32); //65+32=97=a //to get samller version of A add 32 to it
	 System.out.println(c5);   //a
	 
//------------------------------------------------------------------------	 
	  
	  
}
}
