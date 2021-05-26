package practise2;

 
 class maincls{
	 int x=10;
	 
	 {
		 x=test();  //fix previous issue	 
	 }
	 
	 
	 int test() {
		 return 100;
	 }

	public static void main(String[] args) {
		 
		 maincls  obj1=new maincls();
		System.out.println(obj1.x);
		
		
		
		
		
		
		
		
	}
	
}
