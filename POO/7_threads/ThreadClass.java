public class ThreadClass extends Thread {
	public ThreadClass(String name) {
		super(name);
	}

	public void run() {
		System.out.println("Priority from " + getName() + ": " + getPriority());
		for(int i = 0 ; i < 7 ; i++) {
			System.out.println("Iteration " + (i+1) + " from " + getName());
		}
		System.out.println("Ends " + getName());
	}
}

