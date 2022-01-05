public class BreakEtiqueta {
	public static void main (String [] a){
		int x = 0;
		fuera:
		do {
	      		do {
				x++;
				if (x>2) {
					break fuera;
				}
				System.out.println("if");
	      		} while (x<3);
	      		x++;
	      		System.out.println("Do while interno");
		} while (x<4);
		System.out.println("Do while externo");
      	}
}
