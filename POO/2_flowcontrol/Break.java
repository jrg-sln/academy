public class Break {
      	public static void main (String [] a){
		int x = 0, y = 0;
		do {
	      		do {
				x++;
				if (x>2) {
					break;
				}
				System.out.println("If");
	      		} while (x<3);
	      		y++;
	      		System.out.println("Do-while interno");
		} while (y<3);
		System.out.println("Do-while externo");
      	}
}
