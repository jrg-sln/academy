public class TestThreadJoin {
	public static void main (String [] args) {
		Thread t1 = new ThreadJoin("1", 1000, null);
		Thread t2 = new ThreadJoin("2", 4000, t1);
		Thread t3 = new ThreadJoin("3", 600, t2);
		Thread t4 = new ThreadJoin("4", 500, t3);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
