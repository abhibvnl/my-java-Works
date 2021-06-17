package customExceptions;

public class InvalidPasswordException extends RuntimeException {
  
	@Override
	public String getMessage() {
		return "invalid password try again!";
	}
}
