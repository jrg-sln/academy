import java.util.List;
import java.util.ArrayList;

public class SyncStack {
	private List<Character> buffer = new ArrayList<Character>(10);

	public synchronized char pop() {
		char c;
		while (buffer.size() == 0) {
			try {
				this.wait();
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
			}
		}
		c = buffer.remove(buffer.size()-1);
		return c;
	}

	public synchronized void push(char c) {
		buffer.add(c);
		this.notify();
	}
}
