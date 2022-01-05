public class TestRunnableClass {
	public static void main(String[] args) {
		new Thread(new RunnableClass(), "First thread").start();
		new Thread(new RunnableClass(), "Second thread").start();
		System.out.println("Ends main thread.");
	}
}
