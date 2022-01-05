public class LogInSocialNet extends LogIn {
	private byte attempt;
	public boolean logIn(String user, String pwd) throws Exception{
		if (user.equals("root") && pwd.equals("gnuLinux")){
			return true;
		} else {
			attempt++;
			if (attempt == 3){
				throw new LogInException("Número máximo de intentos.");
			}
			return false;
		}
	}
}

