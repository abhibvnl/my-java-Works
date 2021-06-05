//program to generate Random password
package GenerateRandmPassword;

import java.util.*;
public class randomPassword {

    static char[] pswrd(int len) {
        
        String caps="ABCDEFGHIJKL";
        String sml="abcdfghjk";
        String all=  caps+sml;
        Random rnd=new Random();
       char password[]= new char [len];

       for (int i=0; i<len; i++)
       {
           password[i]=all.charAt(rnd.nextInt(all.length()));
       }
       return password;
        

       }  

    public static void main(String[] args) {
        
       System.out.println(pswrd(10));


    }
}