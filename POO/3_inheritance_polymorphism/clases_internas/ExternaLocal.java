public class ExternaLocal {
	public final int TAM = 5;
	Object arreglo[] = new Object[TAM];
	int cima = 0;

    	public void setObject(Object ob){
		arreglo[cima++] = ob;
    	}

    	public Object getObject(){
		return arreglo[--cima];
    	}

    	public boolean isEmpty(){
		return cima == 0;
    	}

	public void getElements(final Object objetos[]) {
		class InternaLocal{
			public boolean hasMoreElements(){
				return !isEmpty();
			}

			public Object nextElement(){
    	    			return getObject();
			}
    		}
		InternaLocal enumerador = new InternaLocal();
		while(enumerador.hasMoreElements()){
                        String txt = (String) enumerador.nextElement();
                        System.out.println(txt);
                }
	}
}
