package marriege;

public class marriege {

 int age=27;

private marriege() {
	System.out.print("Married  ");
}

private static marriege m; //m=null  is type of PrimeMinister

public static marriege insOfMarriege() {
	if(m==null)
		m=new marriege();
	return m;     //returning p obj address
  }

}
