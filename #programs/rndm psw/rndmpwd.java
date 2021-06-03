import java.util.*;
class psw {

    static char[] pswrd(int len) {
        
        System.out.println("hi");
        String caps="ABCDEFGHIJKL";
        String sml="abcdfghjk";
        String all=  caps+sml;

        Random rnd=new Random();
       char password[]= new char [len];

       for (int i=0; i<len; i++)
       {
           password[i]=sml.charAt(rnd.nextInt(sml.length()));
       }
       return password;
        

       }  

    public static void main(String[] args) {
        
       System.out.println(pswrd(10));


    }
}