public class Incrementos {
	public static void main (String [] args) {
		int x=0;
		int y=0;
		if (( ++x > 2 ) && (++y > 2))
 			x++;
		System.out.println("x = " + x + " y = " + y);
		x=3;
		y=1;
		if (( ++x > 2 ) && (++y > 2))
 			x++;
		System.out.println("x = " + x + " y = " + y);
		x=3;
		y=3;
		if (( ++x > 2 ) && (++y > 2))
 			x++;
		System.out.println("x = " + x + " y = " + y);
	}
}
