package toString;

// implicitly imports java.lang.*;

   public class student  {     //implicitly inherits Object class//and the object cls has 11 mrthods   
  
	@Override
	public String toString() {
		return "abhi";
		}
	 
	public static void main(String[] args) {
		
		Object obj=new student(); //upcating To Object class
		System.out.println(obj);
	}
}
