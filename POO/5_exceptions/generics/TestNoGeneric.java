import java.util.List;
import java.util.LinkedList;

public class TestNoGeneric {
	public static void main (String [] arg){
		List<Amail> list = new LinkedList<Amail>();
		list.add(new Amail());
		// Estructura segura en tiempo de compilación
		//list.add(new Bmail());

		// Debido a que es una estructura segura
		// el cast no es necesario
		Amail a = list.get(0);

		// Una lista de una clase derivada no puede
		// ser asignada a una lista de una súper clase
		List <Account> listAccount = new LinkedList<Account>();
		List <Amail> listA = new LinkedList<Amail>();
		List <Bmail> listB = new LinkedList<Bmail>();
		//listAccount = listA;
		listAccount.add(new Amail());
		//listAccount = listB;
		listAccount.add(new Bmail());

		printList(listAccount);
		printList(listA);
		printList(listB);
	}

	public static void printList(List <? extends Account> list){
		for (int cont=0; cont < list.size() ; cont++){
			System.out.println(list.get(cont));
		}
	}
}
