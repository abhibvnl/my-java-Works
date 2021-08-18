package digits;

public class AboutModulas {
  public static void main(String[] args) {
	
	  
	  System.out.println(10%2);   //0 
	  //   2)10(5
	  //     10
	  //-------------
	  //     0=reminder
	 
	  System.out.println(10/2);  //5

//-------------------------------------------------	 
	  System.out.println(17%2); //2*8=16> 17-16=1
	  System.out.println(20%2); //2*10=20> 20-20=0;
	  System.out.println(15%2);  //1
	  System.out.println(15%7);  //1
	  System.out.println(2%15);  //    15)2(11 
                              //      15
                                 //   --------- 
                                 //     -13
                                 //      15
  								//------------------
                                //        2
  
    //even%2==gives always 0
    //odd%2 != gives 0
    System.out.println(17%2==0); //false
    System.out.println(16%2==0); //true
 //-------------------------------------------------------
    int t=0;
    char c='a'; //ascii value of a is 97
    int k=3;
    System.out.println((100-65)%26);  //9
    System.out.println((char)(t + 65));
    System.out.println(String.valueOf((char)(t + 65)));
   
    t=((int)(c + k-65))%26;
    System.out.println(t);  //9
 //----------------------------------------------------   
 //--------------------------------------------------------   
  
}
}