package digits;

//mul*2 of resulting number without using numeric numb
public class j_MultiplyWithoutNumeric{

  public static void main(String[] args) {
       int numb='B'-'A';    //ASCII value B=66-A=65=1
      for(int i=0; i<10;i++ )
      { 
          numb*='C'-'A';
          System.out.println(numb);
          
      }
     
  }
}