package vowels;
import java.util.Arrays;
import java.util.Scanner;


public class vowelsCnt {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter word");
		String word=scan.nextLine().toLowerCase();
		char[] wordArray=new char[word.length()];
		char[] vowels= {'a','e','i','o','u'};
		
		for (int i=0;i<word.length();i++) {
			 wordArray[i]=word.charAt(i);
		}
		//System.out.println(Arrays.toString(wordArray));
		
		int vowelsCnt=0;
		
		for (int i=0;i<vowels.length;) {
		
			for(int j=0; j<word.length();j++) {
				if(wordArray[j]==vowels[i])
					vowelsCnt++;
			   }
			i++;
		}
		System.out.println("Number of vowels in the Entered String "+ vowelsCnt);
		
		
		
	  
	   //System.out.println(word);
	}
}
