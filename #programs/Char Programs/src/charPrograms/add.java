package charPrograms;

public class add {
public static void main(String[] args) {
	char a='2';
	char b='3';
	
	System.out.println(a+b); //101
	
	int c=Character.getNumericValue(a);
	int d=Character.getNumericValue(b);
	System.out.println(c+d);
}
}
