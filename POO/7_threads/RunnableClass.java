public class RunnableClass implements Runnable {
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Iterationn " + (i+1) + " de " + 
			Thread.currentThread().getName());
		}
		System.out.println("Termina el " + Thread.currentThread().getName());
	}
}
