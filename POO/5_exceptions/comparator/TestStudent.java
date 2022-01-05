import java.util.Comparator;
import java.util.TreeSet;

public class TestStudent {
	public static void main (String [] args) {
		Comparator c = new CompareName();
		TreeSet grupo = new TreeSet(c);
		grupo.add(new Student("Eduardo",3018));
		grupo.add(new Student("Jaime",3019));
		grupo.add(new Student("Alan",3017));
		grupo.add(new Student("Samuel",3022));
		grupo.add(new Student("adriana",3015));
		System.out.println(grupo);
	}
}
