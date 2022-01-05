public class TestVolatile {
	public static void main(String[] args) throws InterruptedException {
		Volatile t = new Volatile();
		t.start();
		Thread.sleep(1000);
		t.keepRunning = false;
		System.out.println("keepRunning set to false.");
	}
}
