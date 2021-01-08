package data;

public class ErrorCheckingException extends Exception{
	public ErrorCheckingException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error: " + super.getMessage();
	}
}
