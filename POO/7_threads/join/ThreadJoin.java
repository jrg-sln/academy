public class ThreadJoin extends Thread {
	private String name;
	private int sleepTime;
	private Thread waitsFor;

	public ThreadJoin(){}
	public ThreadJoin(String name, int sleepTime, Thread waitsFor) {
		this.name = name;
		this.sleepTime = sleepTime;
		this.waitsFor = waitsFor;
	}

	public void run() {
		System.out.print("[" + name + " ");

		try {
			Thread.sleep(sleepTime);
		} catch(InterruptedException ie) { }

		System.out.print(name + "? ");

		if (!(waitsFor == null))
			try {
				waitsFor.join();
			} catch(InterruptedException ie) { }

		System.out.println(name + "] ");
	}
}
