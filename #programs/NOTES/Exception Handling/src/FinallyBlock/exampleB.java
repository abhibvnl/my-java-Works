package FinallyBlock;

public class exampleB {

	public static void main(String[] args)  {
		
	try {
		System.out.println("data base opened");
		CantStoreDataEcxeption db=new CantStoreDataEcxeption();
		throw db;
	} 
	catch (CantStoreDataEcxeption e) {
		System.out.println("Error while storing data");
	}
	
	finally {
		System.out.println("data base closed"); //executed without exception

	}
	
	}
}
