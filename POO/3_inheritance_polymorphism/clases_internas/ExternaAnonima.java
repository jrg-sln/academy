public class ExternaAnonima {
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
		abstract class InternaLocal {
                        public abstract boolean hasMoreElements();
                        public abstract Object nextElement();
		}

		InternaLocal enumerador = new InternaLocal(){
                        public boolean hasMoreElements(){
                                return !isEmpty();
                        }

                        public Object nextElement(){
                                return getObject();
                        }
                };
                while(enumerador.hasMoreElements()){
                        String txt = (String) enumerador.nextElement();
                        System.out.println(txt);
                }
	}
}
