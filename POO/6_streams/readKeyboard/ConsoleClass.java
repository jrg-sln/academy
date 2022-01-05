import java.io.Console;

public class ConsoleClass {
	public static void main(String [] args){
		Console con = System.console();
		System.out.print("Usuario: ");
		String user = con.readLine();
		System.out.print("Contraseña: ");
		char [] pass = con.readPassword();

		System.out.println("Los datos ingresados son:");
		System.out.println(user);
		System.out.println(pass);
	}
}
