import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class Mapa {
	public static void main(String [] args) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("uno","1ro");
		m.put("segundo", new Integer(2));
		m.put("tercero","3rd");
		// Se sobre-escribe un valor
		m.put("tercero","III");
		// Regresa un conjunto con las llaves del mapa
		Set llaves = m.keySet();
		// Regresa una colección con los valores del mapa
		Collection valores = m.values();
		// Regresa un conjunto con los pares <llave, valor>
		Set pares = m.entrySet();
		System.out.println("Llaves: \n " + llaves);
		System.out.println("Valores: \n " + valores);
		System.out.println("Pares: \n " + pares);
	}
}
