public class TestThreadClass {
	public static void main(String[] args) {
		new ThreadClass("First one").start();
		new ThreadClass("Second one").start();
		System.out.println("Ends thread main.");
	}
}

