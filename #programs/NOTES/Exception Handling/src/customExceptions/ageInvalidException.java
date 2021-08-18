package customExceptions;

public class ageInvalidException extends RuntimeException { //rule 1 and 2

	String message="hey dabba fellow get married soon";
	
	@Override
	public String getMessage() {
		return message;
	}
}
