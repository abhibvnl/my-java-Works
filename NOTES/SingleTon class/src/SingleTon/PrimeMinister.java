package SingleTon;

public class PrimeMinister {

String name="modi";

private PrimeMinister() {
	System.out.print("Pm got elected ");
}

private static PrimeMinister p; //p is type of PrimeMinister

public static PrimeMinister insOfPm() {
	if(p==null)
		p=new PrimeMinister();
	return p;     //returning p obj address
  }


public static void main(String[] args) {
	
	PrimeMinister store=PrimeMinister.insOfPm();
	System.out.print("and his name is \""+store.name+"\"");
	PrimeMinister.insOfPm();
	PrimeMinister.insOfPm();
}
}
