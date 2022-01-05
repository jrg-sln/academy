public class BloqueEstatico {
	public static boolean acceso = false;
	static {
		System.out.println("Dentro del bloque estAtico");
		String so = System.getProperty("os.name");
		if (so.equals("Linux"))
			acceso = true;
	}

	public static void main (String [] args){
		System.out.println("MEtodo main");
		if (acceso){
			System.out.println("Bienvenido al sistema.");
		} else {
			System.out.println("Acceso denegado.");
		}
	}
}
