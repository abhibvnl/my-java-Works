package MethodOvrloding2;

public class maincls {

 static	void sum(int n1,int n2) {
	  System.out.println(n1+n2);	
	}
 static	void sum(int n1,int n2,int n3) {
	  System.out.println(n1+n2+n3);	
	}
	public maincls() {
		
	}

	public static void main(String[] args) {
		
		sum(12,12);

	}

}
