public class Continue {
      public static void main (String [] a){
	int x = 0, y = 0;
	do {
	      do {
		x++;
		if (x>2) {
			continue;
		}
		System.out.println("If");
	      } while (x<3);
	      y++;
	      System.out.println("Do-while interno");
	} while (y<5);
	System.out.println("Do-while externo");
      }
}
