package ATM;

public class bank extends atm {
    double balance=5000;
    
    @Override
	void deposit(int amt) {
		System.out.println("Amount Deposited SuccessFully");
		balance+=amt;
	}
    
    @Override
	void withdraw(int amt) {
    	if(amt<balance)
    	 {
    		System.out.println("Amount withDrwan SuccessFully");
    		balance-=amt;
        	}
    	else
		System.out.println("Insufficiant Balance");
    	
	}
    
    @Override
	void checkBal() {
		System.out.println("main Balancce Is "+balance);
		
	}
}
