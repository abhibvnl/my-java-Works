package encapsulation;
// int y=10;// this voilets encapsulation rules ,,coz everythink should be in class

public class maincls {     // class is started

	int x=10;             //variable
	 
	maincls(){                     //constructor
		System.out.println("i am constr "); 
	}
	
	
	
	public static void main(String[] args) {    //function/method  (main is also function) //called  as main method
		
		
		System.out.println("i m body of main method");  
		maincls m1=new maincls();

	}

}                              //class ended    

//encapsulation nothing but var,constrtr and methods should be inside the class(main is also function)
