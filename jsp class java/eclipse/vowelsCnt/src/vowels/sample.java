package vowels;
import java.util.Arrays;
public class sample {

	public static void main(String[] args) {
		
		String word="hele";
		char wordArray[]= {'h','e','l','e'};
		char[] vowels= {'a','e','i','o','u'};
		int cnt3=0;
		int vowelsCnt=2;
		String res[]=new String[vowelsCnt];
		String finalArray[]= {"7","22"};
		
		 String newWord=word;
			for (int i=0;i<wordArray.length;i++) {
			
				for(int j=0; j<vowels.length; j++) {
					if(wordArray[i]==vowels[j]) {
						String s3=Character.toString(wordArray[i]);
						 newWord=newWord.replace(s3,finalArray[cnt3]);
						 System.out.println(cnt3);
						// res[cnt3]=newWord;
					     cnt3++;
					    // System.out.println(Arrays.toString(res));
					}
				   }
				
			}
			System.out.println(Arrays.toString(res));
			System.out.println(newWord);//
	}
}
