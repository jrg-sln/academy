public class ExternaEstatica {
    	static int i = 5;
    	void metodoClaseExterna() {
		System.out.println("MEtodo de la clase externa.");
    	}
    	
    	public static class InternaEstatica {
		public static void main(String args[]) { 
			System.out.println("Clase interna -> i=" + i); 
			ExternaEstatica ee = new ExternaEstatica(); 
			ee.metodoClaseExterna();
		}
    	}
}
