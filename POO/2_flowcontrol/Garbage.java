import java.util.TreeSet;

public class Garbage {
	public static void main (String [] args){
		System.out.println("Procesadores disponibles: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Memoria al iniciar el programa:");
		System.out.println("Memoria total: " + Runtime.getRuntime().totalMemory());
		System.out.println("Memoria libre: " + Runtime.getRuntime().freeMemory());

		TreeSet []t = new TreeSet[10000];
		for (int cont = 0 ; cont < t.length ; cont++)
			t[cont] = new TreeSet();

		System.out.println();
		System.out.println("Memoria despuEs de reservar TreeSet[1000]:");
		System.out.println("Memoria total: " + Runtime.getRuntime().totalMemory());
		System.out.println("Memoria libre: " + Runtime.getRuntime().freeMemory());

		for (int cont = 0 ; cont < t.length ; cont++)
			t[cont] = null;

		Runtime.getRuntime().gc();
		//System.gc();
		System.out.println();
		System.out.println("Memoria despuEs de liberar los recursos del Arbol:");
		System.out.println("Memoria total: " + Runtime.getRuntime().totalMemory());
		System.out.println("Memoria libre: " + Runtime.getRuntime().freeMemory());
	}
}
