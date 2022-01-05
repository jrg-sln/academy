import java.util.Scanner;

public class TestLogIn {
	public static void main (String [] arg){
		LogIn enter = new LogIn();
		while (true){
			try {
				Scanner read = new Scanner(System.in);
				System.out.println("Usuario:");
				String user = read.nextLine();
				System.out.println("Contraseña:");
				String pwd = read.nextLine();
				boolean res = enter.logIn(user, pwd);
				if (res){
					System.out.println("Bienvenido al sistema " + user + ".");
				} else {
					System.out.println("Error al iniciar sesión.");
				}
			} catch (LogInException e){
				System.out.println(e.getMessage());
				System.out.println("Su cuenta ha sido bloqueada. Au revoir!");
				break;
			}
		}
	}
}

