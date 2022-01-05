public class Producer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	private int caracter;

	public Producer() {}

	public Producer (SyncStack s) {
		theStack = s;
		num = counter++;
	}

	public void run() {
		char c;

		for (int i = 0; i < 5; i++) {
			c = (char)('A'+ caracter++);
			theStack.push(c);
			System.out.println("Producer " + num + ": " + c);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
