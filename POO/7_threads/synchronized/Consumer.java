public class Consumer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter = 1;

	public Consumer (SyncStack s) {
		theStack = s;
		num = counter++;
	}

	public void run() {
		char c;
		for (int i = 0; i < 5; i++) {
			c = theStack.pop();
			System.out.println("Consumer " + num + ": " + c);

			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
