package Calculator;

import java.util.Scanner;

public class calcu3 {
	  static double sqr(double no){
	        return no*no;
	    }
	    
	    public static void main(String[] args) {

	        Scanner scanner1=new Scanner(System.in);
	       
	        
	        double mem[]= new double[2];
	        System.out.print("\nenter no1: ");
	        mem[0]=scanner1.nextDouble();
	        System.out.print("enter the operation u wanna do\n + - * / sqr : ");
	        String op=scanner1.next();
	        
	       
	        for(int i=0;i<1;i++){

	            if(op.equals("sqr"))
	            {
	               System.out.println("Result: "+(sqr(mem[0])));
	                break;
	            }

	            else if(op.equals("+")){
	            System.out.print("enter no2: ");
	            mem[1]=scanner1.nextDouble();
	            System.out.println("Result: "+(mem[0]+mem[1])); //if not() its going to concatinate
	           }
	           
	        
	          else if(op.equals("-")){
	            System.out.print("enter no2: ");
	            mem[1]=scanner1.nextDouble();
	            System.out.println("Result: "+(mem[0]-mem[1]));
	          }
	       

	        else if(op.equals("*")){
	            System.out.print("enter no2: ");
	            mem[1]=scanner1.nextDouble();
	            System.out.println("Result: "+(mem[0]*mem[1]));
	        }
	        

	        else if(op.equals("/")){
	            System.out.print("enter no2: ");
	            mem[1]=scanner1.nextDouble();
	            System.out.println("Result: "+(mem[0]/mem[1]));
	        }
	        

	        else
	        System.out.println("invalid operation");
	        }   

	        System.out.println("\n");
	        
	    }
	}