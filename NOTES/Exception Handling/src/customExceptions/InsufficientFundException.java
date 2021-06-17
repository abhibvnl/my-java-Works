package customExceptions;

public class InsufficientFundException extends RuntimeException {
   
	@Override
	public String getMessage() {
		return "Insufficient Funds!....";
	}
}
