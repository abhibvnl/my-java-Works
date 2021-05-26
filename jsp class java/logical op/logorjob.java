import java.util.Scanner;

class job{
    public static void main(String[] args) {
        
        Scanner scanner1= new Scanner(System.in); //scanner1 for numbers
        
        System.out.print("enter diploma percentage: ");
        float dipPerc= scanner1.nextFloat();

        System.out.print("enter engg percentage: ");
        float enggPerc=scanner1.nextFloat();

        boolean isElgibleJob= dipPerc>60 || enggPerc>60 ; //logical OR

        if(isElgibleJob==true)
        System.out.println("congrazz u r algible to get job");
        else
        System.out.println("sry! u r not elgible");


    }
}