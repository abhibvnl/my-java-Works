package vowels;
import java.util.Arrays;
import java.util.Scanner;


public class fixes {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter word");
		String word=scan.nextLine().toLowerCase();
		
		char[] wordArray=new char[word.length()];
		char[] vowels= {'a','e','i','o','u'};
		int indValue[]=new int[word.length()];
		
		for (int i=0;i<word.length();i++) {
			 wordArray[i]=word.charAt(i);
		}
	   System.out.println(Arrays.toString(wordArray));
		
		int vowelsCnt=0;
		int cnt=0;
		
		for (int i=0;i<wordArray.length;i++) {
		
			for(int j=0; j<vowels.length;j++) {
				if(wordArray[i]==vowels[j]) {
					vowelsCnt++;
				  indValue[cnt]=i;
				  cnt++;
				}
			   }
			
		}
		System.out.println(vowelsCnt);
		System.out.println(Arrays.toString(indValue));
		
		int resIndValue[]=new int[indValue.length];
		for(int l=0; l<indValue.length;l++)
		{
		 resIndValue[l]=indValue[l]*100;
	    System.out.print(resIndValue[l]+" ");
	    
		}
	    
	    int primeSum=0;
	    int cnt2=0;
	    String  finalArray[] =new String[vowelsCnt];
	    int cnt3=0;
	    for(int q=0 ;q<resIndValue.length;q++) {
	    	
	    	 for(int i=0; i<=resIndValue[q];i++) {
	 	        boolean flag=false;
	 	    	int m=i/2;
	 	    	if(i==0||i==1) {
	 	    		continue;
	 	    	}
	 	    	else {
	 	    		for(int j=2;j<=m;j++) {
	 	    			if(i%j==0) {
	 	    				flag=true;	
	 	    			    break;
	 	    			}
	 	    		}
	 	    	}
	 	    	if(flag==false) { 	    		
	 	    		primeSum+=i;   		
	 	    	}
	 	    		
	 	    }
	    	 if(resIndValue[q]==0)
	    	 continue;
	    	 System.out.println("\n"+primeSum);
	    	 String primes=Integer.toString(primeSum);
			  char pArray[]=new char[primes.length()];
			  int pArrayCnt=0;
			  for(int k=0;k<pArray.length;k++) {
				pArray[k]=primes.charAt(k)  ;
				pArrayCnt+=Character.getNumericValue(pArray[k]);
			  }
			  System.out.println(Arrays.toString(pArray));
			  System.out.println(pArrayCnt);
			  String s2=Integer.toString(pArrayCnt);
			
			     for(int i=0;i<vowelsCnt; i++) {
				   finalArray[cnt2]=s2;
				   primeSum=0;
				   cnt2++;
				   break;
				  }
				  System.out.println(Arrays.toString(finalArray));	
	    }
	    
                                //
        String newWord=word;
		for (int i=0;i<wordArray.length;i++) {
		
			for(int j=0; j<vowels.length; j++) {
				if(wordArray[i]==vowels[j]) {
					String s3=Character.toString(wordArray[i]);
					 newWord=newWord.replace(s3,finalArray[cnt3]);
					 System.out.println(cnt3);
				     cnt3++;
				}
			   }
		}
		System.out.println(newWord);//
	   
	}
}
