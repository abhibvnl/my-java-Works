package vowels;
import java.util.Arrays;
import java.util.Scanner;


public class vowelsInd {

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
	//	System.out.println(Arrays.toString(wordArray));
		
		int vowelsCnt=0;
		int cnt=0;
		
		for (int i=0;i<vowels.length;) {
		
			for(int j=0; j<word.length();j++) {
				if(wordArray[j]==vowels[i]) {
					vowelsCnt++;
				  indValue[cnt]=j;
				  cnt++;
				}
			   }
			i++;
		}
		//System.out.println("Number of vowels in the Entered String "+ vowelsCnt);
		System.out.println(Arrays.toString(indValue));
		
		int no1=indValue[0]*100;
	    System.out.println(no1);
	    int no2=indValue[1]*100;
	    System.out.println(no2);
	    
	    int primeSum=0;
	    boolean flag=false;
	    for(int i=0; i<=no1;i++) {
	    	int m=i/2;
	    	if(i==0||i==1) {
	    		primeSum=+primeSum;
	    	}
	    	else {
	    		for(int j=2;j<=m;j++) {
	    			if(i%j==0)
	    				flag=true;		
	    		}
	    	}
	    	if(flag==false) {
	    		primeSum=+i;
	    	}
	    	
	    	
	    }
	    System.out.println(primeSum);
	}
}
