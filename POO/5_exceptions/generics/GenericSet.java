import java.util.Set;
import java.util.HashSet;
public class GenericSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("second");
		set.add("3rd");
		// This line generates compile error
		//set.add(new Integer(4));
		set.add("second");
		// Duplicate, not added
		System.out.println(set);
	}
}
