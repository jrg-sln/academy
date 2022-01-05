public class PruebaExternaAnonima {
	public static void main (String [] args){
		ExternaAnonima pila = new ExternaAnonima();

		for (int i = 0 ; i < pila.arreglo.length ; i++){
			String txt = "Objeto " + i;
			pila.setObject(txt);
		}
		
		pila.getElements(pila.arreglo);
	}
}
