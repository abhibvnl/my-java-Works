package polindrome;

import java.util.*;
public class polindrome{
    public static void main(String[] args) {

        Scanner scn1=new Scanner(System.in);
        boolean check=false;
        
        System.out.print("enter value to check pol : ");
        String value=scn1.next();

        char array[]=new char[value.length()];

        for(int i=0; i<array.length; i++){
            array[i]=value.charAt(i);  // value.charAt(index)-->its string method 
                                }      //returns the char at index of string 
                                       //storing the return value into array.
                                    
       // System.out.println(Arrays.toString(array));
        
         int cnt=1;
         for(int i=0; i<value.length();){
            if(array[i]==array[array.length-cnt]){
            cnt++;
            i++;
            check=true;
            }
            else{
            check=false;
            break;
            }
        }
         System.out.println((check)?"pol":"not pol");

        

    }
}