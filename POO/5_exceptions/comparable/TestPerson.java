import java.util.TreeSet;

public class TestPerson {
	public static void main (String [] args) {
		TreeSet<PersonComparable> grupo = new TreeSet<PersonComparable>();
		grupo.add(new PersonComparable("Eduardo",18));
		grupo.add(new PersonComparable("Jaime",19));
		grupo.add(new PersonComparable("Alan",17));
		grupo.add(new PersonComparable("Samuel",18));
		grupo.add(new PersonComparable("adriana",18));
		System.out.println(grupo);
	}
}
