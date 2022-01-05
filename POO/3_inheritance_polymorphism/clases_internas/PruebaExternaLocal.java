public class PruebaExternaLocal {
	public static void main (String [] args){
		ExternaLocal pila = new ExternaLocal();

		for (int i = 0 ; i < pila.arreglo.length ; i++){
			String txt = "Objeto " + i;
			pila.setObject(txt);
		}
		
		pila.getElements(pila.arreglo);
	}
}
