public class LogInException extends Exception {
	public LogInException() {
		super("Falló el inicio de sesión.");
	}

	public LogInException(String message){
		super(message);
	}
}
