public class TryCatchFinally {
    public static void main(String[] args) {
    	try {
        	String mensajes[] = {"Primero", "Segundo",  "Tercero" };
        	for (int i=0; i<=3; i++) {
        		System.out.println(mensajes[i]);
		}
    	} catch ( ArrayIndexOutOfBoundsException e ) {
       		System.out.println("\nError: índice fuera del arreglo.");
    	} finally {
        	System.out.println("\nEl bloque finally siempre se ejecuta.");
    	}
	System.out.println("\nContinua el flujo del programa.");
    }
}
