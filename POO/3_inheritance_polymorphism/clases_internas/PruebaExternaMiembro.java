public class PruebaExternaMiembro {
	public static void main (String [] args){
		ExternaMiembro pila = new ExternaMiembro();

		for (int i = 0 ; i < pila.arreglo.length ; i++){
			String txt = "Objeto " + i;
			pila.setObject(txt);
		}

		ExternaMiembro.InternaMiembro enumerador;
		enumerador = pila.new InternaMiembro();
		
		while(enumerador.hasMoreElements()){
			String txt = (String) enumerador.nextElement();
			System.out.println(txt);
		}
	}
}
