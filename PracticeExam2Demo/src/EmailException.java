
@SuppressWarnings("serial")
public class EmailException extends Exception {
	
	public EmailException() {
		super("Invalid Email");
		
	}

	public EmailException (String message) {
		super(message);
	}
		
}


