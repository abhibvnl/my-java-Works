package AsciiPrograms;

public class asciiOfAlpha1{
    public static void main(String[] args) {
        String caps[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String sml[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int cnt=65;  
     for(int i=0 ; i<26 ;i++)
     {
    
             System.out.print(caps[i]+" is "+ cnt +" ");
      cnt++;
     }
     System.out.print("\n");
     
     for(int i=0 ; i<26 ;i++)
     {
    
             System.out.print(sml[i]+" is "+ cnt +" ");
      cnt++;
     }


    }
}
