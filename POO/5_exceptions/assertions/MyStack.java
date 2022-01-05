public class MyStack {
	private final byte MAX = 5;
	private byte tope;
	private Object [] stack;

	public MyStack(){
		stack = new Object[MAX];
		for (int cont=0 ; cont<MAX ; cont++){
			stack[cont] = new Object();
		}
		tope = 4;
	}

	public byte getMax(){
		return MAX;
	}

	public byte getTope(){
		return tope;
	}

	public Object getElement(int position){
		tope++;
		return stack[position];
	}

	public Object pop() throws Exception{
		int position = getTope();
		if (position == 0){
			throw new Exception ("No se puede hacer pop.");
		}
		Object res = getElement(position);
		// Condición posterior
		assert (this. getTope() == MAX-1);
		return res;
	}
}

