package tohashCode;

public class employee {
   
	@Override
	public int hashCode() {
		return 100;
	}
	
	public static void main(String[] args) {
		
		employee e=new employee();
		System.out.println(e.hashCode());
	}
}
