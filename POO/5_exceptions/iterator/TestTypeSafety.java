import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collection;

public class TestTypeSafety {

	public static void iterador(Collection <Account> l) {
		System.out.println("Iterator");
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void iterador2(Collection <Account> l) {
		System.out.println("Iterator 2");
		for (Account a : l) {
			System.out.println(a);
		}
	}

	public static void iterador3(List <Account> l) {
		System.out.println("Iterator 3");
		ListIterator <Account> i = l.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

	public static void main(String[] args) {
		List<Account> la = new ArrayList<Account>();
		la.add(new Account("Adrew"));
		la.add(new Account("Luigi"));
		la.add(new Account("Fred"));
		la.add(new Account("Kevin"));
		la.add(new Account("Laura"));
		System.out.println(la);
		System.out.println();
		iterador(la);
		System.out.println();
		iterador2(la);
		System.out.println();
		iterador3(la);
	}
}
