public class TestSyncStack {
	public static void main(String[] args) {
		SyncStack stack = new SyncStack();

		Producer p1 = new Producer(stack);
		Thread prodT1 = new Thread (p1,"P1");
		prodT1.start();
		Producer p2 = new Producer(stack);
		Thread prodT2 = new Thread (p2, "P2");
		prodT2.start();

		Consumer c1 = new Consumer(stack);
		Thread consT1 = new Thread (c1, "C1");
		consT1.start();
		Consumer c2 = new Consumer(stack);
		Thread consT2 = new Thread (c2, "C2");
		consT2.start();
	}
}
