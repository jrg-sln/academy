public class ExternaMiembro {
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

	class InternaMiembro{
		public boolean hasMoreElements(){
			return !isEmpty();
		}

		public Object nextElement(){
    	    		return getObject();
		}
    	}
}
