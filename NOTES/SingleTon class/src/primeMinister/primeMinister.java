package primeMinister;

public class primeMinister {

String name="modi";

private primeMinister() {
	System.out.print("Pm got elected ");
}

private static primeMinister p; //p is type of PrimeMinister

public static primeMinister insOfPm() {
	if(p==null)
		p=new primeMinister();
	return p;     //returning p obj address
  }

}
