package ex4;

interface swiggy{
void orderFood();
}

interface payTm{
void pay();
}

class amazon{
	void orderProduct() {
	System.out.println("order some products");
	}
}
public class jerry extends amazon implements swiggy,payTm {
    @Override
	public void orderFood() {
		System.out.println("ordered food");
	}
    @Override
	public void pay() {
		System.out.println("payment done");
	}
	public static void main(String[] args) {
		
		jerry j=new jerry();
		j.orderFood();
		j.pay();
		j.orderProduct();
	}

}
