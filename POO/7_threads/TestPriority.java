public class TestPriority {
	public static void main(String[] args) {
		Thread first = new ThreadClass("First one");
		Thread second = new ThreadClass("Second one");
		Thread third = new ThreadClass("Third one");

		first.setPriority(Thread.MIN_PRIORITY);
		third.setPriority(Thread.MAX_PRIORITY);

		first.start();
		second.start();
		third.start();
		System.out.println("Ends thread main.");
	}
}

