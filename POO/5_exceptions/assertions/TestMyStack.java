public class TestMyStack {
	public static void main (String [] args) throws Exception {
		MyStack referencia = new MyStack();

		for (int cont=0 ; cont<referencia.getMax() ; cont++){
			Object obj = referencia.pop();
			System.out.println(obj);
		}
	}
}

