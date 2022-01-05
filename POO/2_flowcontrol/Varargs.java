public class Varargs {
	void metodo(int i, String...ok){
		System.out.println("ITERACIoN " + i);
		for (int a = 0 ; a < ok.length ; a++ ) {
			System.out.println(ok[a]);
		}
		System.out.println();
	}

	public static void main (String ... a){
		String [] args = {"hola", "adios", "ok"};
		new Varargs().metodo(1);
		new Varargs().metodo(2,"un argumento");
		new Varargs().metodo(3, args);
	}
}
