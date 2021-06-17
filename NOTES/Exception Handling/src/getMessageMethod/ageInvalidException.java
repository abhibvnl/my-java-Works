package getMessageMethod;

public class ageInvalidException extends RuntimeException {

	String message="hey dabba fellow get married soon";
	
	@Override
	public String getMessage() {
		return message;
	}
}
