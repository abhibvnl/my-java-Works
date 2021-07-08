//example 1
package D_mapInterFace.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapClassC {
	
	String mobile;
	Double price;
    
	
     public HashMapClassC(String mobile, Double price) {
		
		this.mobile = mobile;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [mobile=" + mobile + ", " + (price != null ? "price=" + price : "") + "]";
	}

	public static void main(String[] args) {
		 
		 HashMapClassC m1=new HashMapClassC("nokia",15500.0);
		 HashMapClassC m2=new HashMapClassC("Redmi",16500.0);
		 HashMapClassC m3=new HashMapClassC("apple",17500.0);
		 
    	 HashMap<Integer, HashMapClassC> hs=new HashMap<>();
    	 hs.put(4,m1);
    	 hs.put(6,m2);
    	 hs.put(8,m3);
    	 
    	 Scanner scan =new Scanner(System.in);
    	 while(true) {
    		
    		 System.out.println("enter Ram variant\n0: for exit..");
    		 int ram=scan.nextInt();
    	 
    		 switch (ram) {
			case 4: {
				System.out.println(hs.get(ram));
				break;
			}
			case 6: {
				System.out.println(hs.get(ram));
				break;
			}
			case 8: {
				System.out.println(hs.get(ram));
				break;
			}
			
			case 0:{
				System.out.println("Thank u..........");
				scan.close();
				System.exit(0);
			}
			
			default:
				System.out.println("No such Varient Fund!...");
			}
    		 System.out.println("-----------------------------");
    	 }
    	 
    	 
    	 
	}

	
}
