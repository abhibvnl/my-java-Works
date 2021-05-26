//return type is Array

import java.util.*;
class smp{

  
    static String FRS (){            //1

        String msg="hi good moning";
        return msg;

        } 
     
    static String[] FRSArray (){      //2
       
       String sml[]={"a","b","c"}; //type 1 or 2
         return sml;
         } 

         static char[] FRC (){    //3

            char smlc[]={'a','b','c'};
            return smlc;
    
            } 

    public static void main(String[] args) {

        System.out.println(FRSArray());
        System.out.println(FRS());
        System.out.println(FRC());
        
    }
}