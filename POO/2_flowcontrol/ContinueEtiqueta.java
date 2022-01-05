public class ContinueEtiqueta {
      public static void main (String [] a){
	int x = 0;
	fuera:
	do {
	      do {
		x++;
		if (x>2) {
			continue fuera;
		}
		System.out.println("If");
	      } while (x<3);
	      x++;
	      System.out.println("Do-while interno");
	} while (x<5);
	System.out.println("Do-while externo");
      }
}
